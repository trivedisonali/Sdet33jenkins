package jenkins2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sampletest2 {
	
		
		@Test
		public void myfirstTest() {

			Reporter.log("i'm happy today",true);

			Reporter.log("i'm  not happy today",true);
			Reporter.log("i'm  not happy today",true);
		}

		}


