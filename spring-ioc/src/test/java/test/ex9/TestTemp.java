package test.ex9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ex9.TemeratureConverter;

public class TestTemp {
	
	@Test
	public void testCToF() {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(TemeratureConverter.class);
		
		
		TemeratureConverter tm=(TemeratureConverter) ctx.getBean("temp");
		int f=tm.ctof(102);
		
		Assertions.assertEquals(215, f);
	}
	
	@Test
	public void testFtoC() {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(TemeratureConverter.class);
		
		
		TemeratureConverter tm=(TemeratureConverter) ctx.getBean("temp");
		int c=tm.ftoc(102);
		
		Assertions.assertEquals(38, c);
	}
}
