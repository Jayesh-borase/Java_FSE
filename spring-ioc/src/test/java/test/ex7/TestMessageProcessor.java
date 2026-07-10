package test.ex7;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ex7.MessageProcessor;

public class TestMessageProcessor {

	@Test
	public void testProcess() {
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("appctx.xml");
		
		MessageProcessor mp=appCtx.getBean(MessageProcessor.class,"mp");
		
		mp.process("sms", "9325JAYESH","Hello Jayesh");
		mp.process("email", "jayesh@email","Hola Jayesh");
		mp.process("wap", "@jayesh","Ciao Jayesh");
	}
	
}
