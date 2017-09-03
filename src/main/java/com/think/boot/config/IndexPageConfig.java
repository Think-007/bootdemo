///*      						
// * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
// * 
// * History:
// * ------------------------------------------------------------------------------
// * Date    	|  Who  		|  What  
// * 2017年9月1日	| lipengfeia 	| 	create the file                       
// */
//
//package com.think.boot.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.Ordered;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * 
// * 默认首页面配置
// * 
// * <p>
// * 类详细描述
// * </p>
// * 
// * @author lipengfeia
// * 
// */
//@Configuration
//public class IndexPageConfig extends WebMvcConfigurerAdapter {
//
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("forward:/index.html");
//		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		super.addViewControllers(registry);
//	}
//
//}
