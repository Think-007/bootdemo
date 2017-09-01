/*      						
 * Copyright 2010 Beijing Xinwei, Inc. All rights reserved.
 * 
 * History:
 * ------------------------------------------------------------------------------
 * Date    	|  Who  		|  What  
 * 2017年8月31日	| lipengfeia 	| 	create the file                       
 */

package com.think.boot.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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
@Component
@EnableScheduling
public class NameTask {

//	@Scheduled(cron = "*/2 * * * * ?")
	public void hh() {

		new Thread() {
			@Override
			public void run() {
				super.run();

				System.out.println("阿拉拉了拉阿拉阿拉");
				System.out.println(Thread.currentThread().getId() + "------"
						+ Thread.currentThread().getName());
			}
		}.start();

		System.out.println("水水水水");
	}
}
