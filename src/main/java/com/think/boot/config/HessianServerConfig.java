/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年9月1日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Component;

import com.think.boot.facade.NameFacade;
import com.think.boot.service.NameService;

/**
 * 
 * hessian的java配置
 * 
 * <p>
 * 类详细描述
 * </p>
 * 
 * @author lipengfeia
 * 
 */

@Component
public class HessianServerConfig {
	// @Autowired
	// private NameFacade nameFacade;
	//
	// @Bean(name = "/hessian/NameFacade")
	// public HessianServiceExporter exportHelloService() {
	// HessianServiceExporter exporter = new HessianServiceExporter();
	// exporter.setService(nameFacade);
	// exporter.setServiceInterface(NameFacade.class);
	// return exporter;
	// }
}
