package Amazon_Tests;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Amazon_Pages.Amazon_LoginPage_Multiple_Iteration;
import excelLib.ExcelLib;
import jxl.read.biff.BiffException;

public class Amazon_Test_Multiple_Iteration
{
	/**
	 * Test Case Iteration Count
	 */
	private static String IterationCount;

	@DataProvider
	public Object[][] data() throws BiffException, IOException 
	{
		ExcelLib xl = new ExcelLib("BatchRun", this.getClass().getSimpleName());
		IterationCount = String.valueOf(xl.iteratorCount());
		return xl.getTestdata();
	}

	//Test Case Objective
	/**
	 * Test Case Objective
	 */
	private static String TestCaseObjective = "Validate Ordering of a product in Amazon website multiple times";

	/**
	 * 
	 * @param url
	 * @param browserName
	 * @param search
	 * @throws Exception
	 */

	@Test(dataProvider = "data")
	/*Note: While providing the arguments, please make sure 
	 * that the order of arguments passed inside run function 
	 * should be same as the order respected in data sheet, 
	 * otherwise script wont run
	 * OR In simple words, "the order of the arguments must be respected"*/
	public void Test_pdf_output_for_steps(String url, String browserName, String search) throws Exception
	{
		//Instantiate the page
		Amazon_LoginPage_Multiple_Iteration aml = new Amazon_LoginPage_Multiple_Iteration();

		//Test Case
		aml.beforemethod(this.getClass().getSimpleName(), TestCaseObjective, url, IterationCount);
		aml.amazon_test_001(url, browserName, search);
	}
}