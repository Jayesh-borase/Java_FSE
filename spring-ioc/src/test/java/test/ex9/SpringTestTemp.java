package test.ex9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ex9.TemeratureConverter;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations ="classpath:appctx.xml")
public class SpringTestTemp {
	
	@Autowired
	private TemeratureConverter tc;
	
	@Test
	public void testFtoc()
	{
		int c=tc.ftoc(102);
		Assertions.assertEquals(38,c);
	}
	

	@Test
	public void testCtof()
	{
		int f=tc.ctof(36);
		Assertions.assertEquals(96,f);
	}
}
