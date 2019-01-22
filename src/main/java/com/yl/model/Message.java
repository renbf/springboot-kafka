package com.yl.model;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4761285195241243133L;

	private Long id;    //id

    private String msg; //消息

    private Date sendTime;  //

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
    
}
