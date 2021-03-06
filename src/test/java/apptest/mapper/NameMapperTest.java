/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月31日	| lipengfeia 	| 	create the file                       
 */

package apptest.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.boot.App;
import com.think.boot.domain.UserInfo;
import com.think.boot.mapper.mysql.MUserInfoMapper;

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
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class NameMapperTest {

	@Autowired
	private MUserInfoMapper userInfoDao;
	@Value("${age}")
	private int age;
	@Value("${name}")
	private String name;

	@Test
	public void testUserInfoDao() {

		UserInfo user = new UserInfo();
		user.setAge(age);
		user.setName(name);
		userInfoDao.saveUser(user);
		
		System.out.println(user);

		System.out.println(userInfoDao.queryUser("fff5"));
	}

}
