package jenkins2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sampletest2 {
	
		
		@Test
		public void myfirstTest() {
			
		String BROWSER = System.getProperty("BROWSER");
		String URL= System.getProperty("URL");
System.out.println(BROWSER);
System.out.println(URL);

			Reporter.log("i'm happy today",true);

			
		}
}


