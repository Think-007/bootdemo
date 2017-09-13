/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月30日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.controller;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.think.boot.service.NameService;
import com.think.boot.util.SecurityCode;
import com.think.boot.util.SecurityImage;

/**
 * 
 * 类简要描述
 * 
 * <p>
 * 类详细描述
 * </p>
 * 
 * @author lipengfeia
 * 
 */
@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private NameService nameService;

	@RequestMapping("/hello/{name}")
	@ResponseBody
	public String test(@PathVariable("name") String name) {

		System.out.println("hello test" + name);
		return "hello " + name;

	}

	@RequestMapping("/hello1")
	public String test1() {

		return "/home";
	}

	@RequestMapping("/name")
	@ResponseBody
	public String nameCon() {

		nameService.say();

		return "say ok";

	}

	@RequestMapping("/code")
	public void code(HttpServletRequest request, HttpServletResponse response)
			throws Throwable {

		String securityCode = SecurityCode.getSecurityCode();

		BufferedImage bufferedImage = SecurityImage.createImage(securityCode);

		// // 禁止图像缓存。
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/jpeg");
		// 将图像输出到输出流中。
		OutputStream os = response.getOutputStream();
		ImageIO.write(bufferedImage, "jpeg", os);
		os.close();
	}

}
