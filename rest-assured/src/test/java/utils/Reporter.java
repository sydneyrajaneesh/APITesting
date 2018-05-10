package utils;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporter {
	public ExtentTest test;
	public static ExtentReports extent;
	public String testCaseName, testDescription, category;

	
	public void reportStep(String desc, String status) {

	
		// Write if it is successful or failure or information
		if(status.toUpperCase().equals("PASS")){
			test.log(LogStatus.PASS, desc);
		}else if(status.toUpperCase().equals("FAIL")){
			test.log(LogStatus.FAIL, desc);
			throw new RuntimeException("FAILED");
		}else if(status.toUpperCase().equals("INFO")){
			test.log(LogStatus.INFO, desc);
		}
	}
	

	public ExtentReports startResult(){
		extent = new ExtentReports("./reports/result.html", false);
		extent.loadConfig(new File("./src/main/resources/extent-config.xml"));
		return extent;
	}

	public ExtentTest startTestCase(String testCaseName, String testDescription){
		test = extent.startTest(testCaseName, testDescription);
		return test;
	}

	public void endResult(){		
		extent.flush();
	}

	public void endTestcase(){
		extent.endTest(test);
	}

	
	
}
