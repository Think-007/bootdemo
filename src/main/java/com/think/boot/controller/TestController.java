/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月30日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.think.boot.service.NameService;

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

}
