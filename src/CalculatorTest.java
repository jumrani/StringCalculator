import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  
	@Test
	public void calcEmptystring()
	{
		assertEquals(0,Calculator.add(""));
	}

	@Test
	public void calcSingleNUmber()
	{
		assertEquals(1,Calculator.add("1"));
	}
	
}