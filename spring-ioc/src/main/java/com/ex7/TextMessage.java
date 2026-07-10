package com.ex7;

import org.springframework.stereotype.Component;

@Component("sms")
public class TextMessage implements Message{
		public TextMessage()
		{
			System.out.println("Text msg Constructor");
		}
		
		@Override
		public void send(String to,String text)
		{
			System.out.println("Sms sent to,"+to+", as: "+text);
		}
}
