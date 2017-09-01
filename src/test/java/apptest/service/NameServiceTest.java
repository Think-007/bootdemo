/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月31日	| lipengfeia 	| 	create the file                       
 */

package apptest.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.boot.App;
import com.think.boot.config.WxConfig;
import com.think.boot.dao.UserInfoDao;
import com.think.boot.domain.UserInfo;
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
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class NameServiceTest {

	@Autowired
	private NameService nameService;

	@Autowired
	private WxConfig wxConfig;

	@Autowired
	UserInfoDao userInfoDao;

	@Test
	public void testNameService() {

		nameService.say();
		System.out.println(wxConfig);

		System.out.println("boot test");

	}

}
