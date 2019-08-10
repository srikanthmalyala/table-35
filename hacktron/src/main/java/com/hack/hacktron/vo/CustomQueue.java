package com.hack.hacktron.vo;




public class CustomQueue {

	private Integer queue_id;
	private String queue_name;
	
	public Integer getQueue_id() {
		return queue_id;
	}
	public void setQueue_id(Integer queue_id) {
		this.queue_id = queue_id;
	}
	public String getQueue_name() {
		return queue_name;
	}
	public void setQueue_name(String queue_name) {
		this.queue_name = queue_name;
	}
	@Override
	public String toString() {
		return "Queue [queue_id=" + queue_id + ", queue_name=" + queue_name + "]";
	}
	
	
	
	
}
