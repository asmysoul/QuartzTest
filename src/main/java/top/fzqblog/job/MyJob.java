/******************************************************************
 *
 *    
 *
 *    Copyright (c) 2016-forever 
 *    http://www.fzqblog.top
 *
 *    Package:     top.fzqblog.job
 *
 *    Filename:    MyJob.java
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
 *    Create at:   2016年11月2日 下午4:36:10
 *
 *    Revision:
 *
 *    2016年11月2日 下午4:36:10
 *        - first revision
 *
 *****************************************************************/
package top.fzqblog.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @ClassName MyJob
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author 抽离
 * @Date 2016年11月2日 下午4:36:10
 * @version 1.0.0
 */
public class MyJob implements Job{

	/* (非 Javadoc)
	 * Description:
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	public void execute(JobExecutionContext context) throws JobExecutionException {
	
		
	}

}
