/******************************************************************
 *
 *    
 *
 *    Copyright (c) 2016-forever 
 *    http://www.fzqblog.top
 *
 *    Package:     top.fzqblog.model
 *
 *    Filename:    Task.java
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
 *    Create at:   2016年11月2日 下午4:51:27
 *
 *    Revision:
 *
 *    2016年11月2日 下午4:51:27
 *        - first revision
 *
 *****************************************************************/
package top.fzqblog.quartz;

/**
 * @ClassName Task
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author 抽离
 * @Date 2016年11月2日 下午4:51:27
 * @version 1.0.0
 */
public class Task {
	
	private Long id;
	
	private String taskClassz;
	
	private String taskMethod;
	
	private String taskTime;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the taskClassz
	 */
	public String getTaskClassz() {
		return taskClassz;
	}

	/**
	 * @param taskClassz the taskClassz to set
	 */
	public void setTaskClassz(String taskClassz) {
		this.taskClassz = taskClassz;
	}

	/**
	 * @return the taskMethod
	 */
	public String getTaskMethod() {
		return taskMethod;
	}

	/**
	 * @param taskMethod the taskMethod to set
	 */
	public void setTaskMethod(String taskMethod) {
		this.taskMethod = taskMethod;
	}

	/**
	 * @return the taskTime
	 */
	public String getTaskTime() {
		return taskTime;
	}

	/**
	 * @param taskTime the taskTime to set
	 */
	public void setTaskTime(String taskTime) {
		this.taskTime = taskTime;
	}

	/* (非 Javadoc)
	 * Description:
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskClassz=" + taskClassz + ", taskMethod=" + taskMethod + ", taskTime=" + taskTime
				+ "]";
	}
	
	
	
}
