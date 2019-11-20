package com.nicordesigns.helloworld;

import com.nicordesigns.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private MessageStore messageStore;
	
	private String name;

	private String customGreeting;
	
    public String getCustomGreeting() {
		return customGreeting;
	}

	public MessageStore getMessageStore() {
        return messageStore;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() {
		
		messageStore = new MessageStore();
		
		setCustomGreeting( getName());
		
		return "SUCCESS";
		
		
	}

	private void setCustomGreeting(String customGreeting) {
		
		this.customGreeting = customGreeting;
	}

	
	
	

}
