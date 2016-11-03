/******************************************************************
 *
 *    
 *
 *    Copyright (c) 2016-forever 
 *    http://www.fzqblog.top
 *
 *    Package:     top.fzqblog.test
 *
 *    Filename:    DynamicTaskTest.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2001-2014
 *
 *    Company:     fzqblog
 *
 *    @author:     抽离
 *
 *    @version:    1.0.0
 *
 *    Create at:   2016年11月3日 下午3:22:08
 *
 *    Revision:
 *
 *    2016年11月3日 下午3:22:08
 *        - first revision
 *
 *****************************************************************/
package top.fzqblog.test;

import org.quartz.SchedulerException;

import top.fzqblog.quartz.Task;
import top.fzqblog.quartz.trigger.CronTriggerManager;

/**
 * @ClassName DynamicTaskTest
 * @Description  定时任务测试
 * @author 抽离
 * @Date 2016年11月3日 下午3:22:08
 * @version 1.0.0
 */
public class DynamicTaskTest {
	public static void main(String[] args) {
		Task task = new Task();
		task.setId(1L);
		task.setTaskClassz("top.fzqblog.service.impl.StatisticalDataServiceImpl");
		task.setTaskMethod("caculateData");
		task.setTaskTime("0/3 * * * * ?");
		CronTriggerManager cronTriggerManager = new CronTriggerManager();
		try {
			cronTriggerManager.addJob(task, true);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
