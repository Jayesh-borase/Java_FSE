package test.ex4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ex4.Hello;

 class TestHello {
	
	@Test
	public void testHello()
	{
		ApplicationContext appCtx=new ClassPathXmlApplicationContext("appctx.xml");
		
		Hello h=(Hello) appCtx.getBean("hi");
		System.out.println(h.getMessage());
	}
}
