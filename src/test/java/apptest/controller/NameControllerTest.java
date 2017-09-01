/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月31日	| lipengfeia 	| 	create the file                       
 */

package apptest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.think.boot.App;

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
@AutoConfigureMockMvc
public class NameControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testNameController() throws Exception {

		mockMvc.perform(MockMvcRequestBuilders.get("/test/name"));

	}

	// @Test
	// public void getStudentList() throws Exception {
	// mvc.perform(MockMvcRequestBuilders.get("/students"))
	// .andExpect(MockMvcResultMatchers.status().isOk());
	// //.andExpect(MockMvcResultMatchers.content().string("365")); //测试接口返回内容
	// }

}
