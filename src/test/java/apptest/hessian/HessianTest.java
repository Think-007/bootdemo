/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年9月4日	| lipengfeia 	| 	create the file                       
 */

package apptest.hessian;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.boot.App;
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
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class HessianTest {

//	@Autowired
//	@Qualifier("nameFacade")
//	private NameFacade nameFacade;
//
//	@Test
//	public void nameservie() {
//
//		nameFacade.queryName();
//
//	}
}
