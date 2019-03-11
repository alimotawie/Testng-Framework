package runner;

import Resourses.Base;
import cucumber.api.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue= {"steps"} )
public class BDDrunner extends Base {
	
	

}
