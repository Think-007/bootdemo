/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月31日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.mapper.oracle;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.think.boot.domain.UserInfo;

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
@Mapper
public interface OUserInfoMapper {

	@Insert("insert into t2 values (#{name},#{age})")
	public int saveUser(UserInfo userInfo);

	public UserInfo queryUser(String name);

}
