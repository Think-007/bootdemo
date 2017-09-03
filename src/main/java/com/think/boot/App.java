/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月30日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * spring boot 启动器，但数据源配置
 * 
 * <p>
 * 多数据源配置的时候,在 @SpringBootApplication 注解后面加上 (exclude = {
 * DataSourceAutoConfiguration.class }) 并去掉 @EnableTransactionManagement
 * 注解,再解开MultiDbConfig类的注释
 * </p>
 * 
 * @author lipengfeia
 * 
 */
@SpringBootApplication
// (exclude = { DataSourceAutoConfiguration.class })
@ServletComponentScan
@EnableTransactionManagement
@ImportResource({ "classpath:hessian/hessian-server.xml",
		"classpath:hessian/hessian-client.xml" })
public class App {
	public static void main(String[] args) {

		SpringApplication.run(App.class, args);

	}

}
