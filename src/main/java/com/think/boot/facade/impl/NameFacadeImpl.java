/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年9月1日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.facade.impl;

import org.springframework.stereotype.Component;

import com.think.boot.facade.NameFacade;

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
@Component()
public class NameFacadeImpl implements NameFacade {

	@Override
	public String queryName() {
		// TODO Auto-generated method stub

		System.out.println("name facade");
		return "EEEEEEEEEEEEEEEEEEE";
	}

}
