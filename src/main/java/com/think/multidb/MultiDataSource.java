/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年9月2日	| lipengfeia 	| 	create the file                       
 */

package com.think.multidb;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
@Configuration
public class MultiDataSource{

	@Bean(name = "mysql.datasource")
	@ConfigurationProperties(prefix = "mysql.spring.datasource")
	public DataSource mysqlDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "oracle.datasource")
	@ConfigurationProperties(prefix = "oracle.spring.datasource")
	public DataSource oracleDataSource() {
		return DataSourceBuilder.create().build();
	}

}
