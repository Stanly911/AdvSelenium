package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void tc1()
	{
		Reporter.log("Hello Java",true);
	}
}
