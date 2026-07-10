package com.ex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@Repository("mp")
public class MessageProcessor {
	
	@Autowired
	private ApplicationContext appCtx;

	public MessageProcessor() {
		System.out.println("msg Processor Constructor");
	}
	
	TextMessage sms;
	EmailMessage email;
	WhatsappMessage wap;
	
	public void process(String type,String to,String text)
	{
		
		Message msg=(Message) appCtx.getBean(type);
		msg.send(to, text);
		
	}

}
