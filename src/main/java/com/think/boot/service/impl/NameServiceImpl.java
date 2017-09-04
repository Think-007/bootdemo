/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月31日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.think.boot.domain.UserInfo;
import com.think.boot.mapper.mysql.MUserInfoMapper;
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
@Service
public class NameServiceImpl implements NameService {

	@Autowired
	private MUserInfoMapper userInfoDao;

	@Value("${age}")
	private int age;
	@Value("${name}")
	private String name;

	@Override
	public int say() {
		UserInfo user = new UserInfo();
		user.setAge(age);
		user.setName(name);
		System.out.println(user);
		userInfoDao.saveUser(user);

		System.out.println("少时诵诗书所所所所所所所所所所");
		System.out.println("坎坎坷坷扩扩扩扩");
		return 9;
	}

}
