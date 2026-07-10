package test.ex8;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ex8.ExchangeConfig;
import com.ex8.ExchangeService;

public class TestExchange {
	
	@Test
	public void testConfig() {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ExchangeConfig.class);
		
		
		ExchangeService ex=(ExchangeService) ctx.getBean("exchange");
		ex.convert();
	}
}
