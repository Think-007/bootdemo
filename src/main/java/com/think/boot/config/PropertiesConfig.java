/*      						
 * Copyright 2012 LPF  All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年9月3日	| LPF 	| 	create the file                       
 */

package com.think.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 
 * 将properties文件加载到系统环境中
 * 
 * <p>
 * 类详细描述
 * </p>
 * 
 * @author LPF
 * 
 */
@Configuration
@PropertySource({ "classpath:config/other/system.properties" })
public class PropertiesConfig {

}
