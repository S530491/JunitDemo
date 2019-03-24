package Demojunit.Demojunit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class TestCalculator  {
	Calculator c=null;
//	we can do in the below manner or we can make it using the mockito framework
//	CalculatorService s=new CalculatorService() {
//		
//		public int add(int i, int j) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	};
//	we can create the below service using the below syntax too
//	@Mock
//	CalculatorService service
//	@Rule public MockitoRule r=MockitoJunit.rule();
	CalculatorService s=Mockito.mock(CalculatorService.class);
	@Before
	public void setUp() {
		c=new Calculator(s);
	}

	
@Test	
public void testAdd() {
	when(s.add(2, 3)).thenReturn(5);
	assertEquals(10,c.perform(2, 3));
//to verify whther mock service is called or not e can do like this
	verify(s).add(2,3);
}
}
