package test.ex6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ex6.MyLife;
public class testMyLife {
	
	@Test
	public void testLifeCycle() {
		ConfigurableApplicationContext appCxt=new ClassPathXmlApplicationContext("appctx.xml");
		appCxt.getBean("MyLife.class");
		
		appCxt.close();
	}
}
