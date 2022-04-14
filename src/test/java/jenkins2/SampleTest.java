package jenkins2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	
		@Test
		public void myfirstTest() {
			Reporter.log("i'm happy today",true);
		}

}
