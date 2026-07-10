package test.ex3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMyLife {
	
	@Test
	public void testLifeCycle() {
		ConfigurableApplicationContext appCxt=new ClassPathXmlApplicationContext("ex3-context.xml");
		appCxt.getBean("MyLife","MyLife.class");
		
		appCxt.close();
	}
}
