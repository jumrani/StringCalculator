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
	
	@Test
	public void calcTwoNumberDelimitedByComma()
	{
		assertEquals(3,Calculator.add("1,2"));
	}
     
	@Test
	public void calcOnMultipleNumberDelimitedByComma()
	{
		assertEquals(6,Calculator.add("1,2,3"));
	}
	
	@Test
	public void calcOnNewLineAsValidDeliminator()
	{
		assertEquals(6,Calculator.add("1\n2,3"));
	}
}
