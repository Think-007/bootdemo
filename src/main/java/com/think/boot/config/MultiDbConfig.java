/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年9月2日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.think.multidb.MultiDataSource;
import com.think.multidb.MysqlSessionFactory;
import com.think.multidb.OracleSessionFactory;

/**
 * 
 * 多数据源配置整合类
 * 
 * <p>
 * 将多数据源的配置整合到一起，不用多数据源要注释掉该类
 * </p>
 * 
 * @author lipengfeia
 * 
 */
@Configuration
@Import({ MultiDataSource.class, MysqlSessionFactory.class,
		OracleSessionFactory.class })
public class MultiDbConfig {

}
