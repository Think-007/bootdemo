/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月30日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot;

import org.apache.ibatis.type.Alias;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * spring boot 启动器
 * 
 * <p>
 * 类详细描述
 * </p>
 * 
 * @author lipengfeia
 * 
 */
@SpringBootApplication
@ServletComponentScan
// 开启事务
@EnableTransactionManagement
@ImportResource({ "classpath:hessian/hessian-server.xml" })
public class App {
	public static void main(String[] args) {

		SpringApplication.run(App.class, args);

	}
}
