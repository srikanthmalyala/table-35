package com.hack.hacktron.vo;

public class CustomMessages {
	
	private Integer message_id;
	private Integer queue_id;
	private String message_description;
	public Integer getMessage_id() {
		return message_id;
	}
	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}
	public Integer getQueue_id() {
		return queue_id;
	}
	public void setQueue_id(Integer queue_id) {
		this.queue_id = queue_id;
	}
	public String getMessage_description() {
		return message_description;
	}
	public void setMessage_description(String message_description) {
		this.message_description = message_description;
	}
	@Override
	public String toString() {
		return "Messages [message_id=" + message_id + ", queue_id=" + queue_id + ", message_description="
				+ message_description + "]";
	}

	
}
