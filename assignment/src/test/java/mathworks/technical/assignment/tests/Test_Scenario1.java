package mathworks.technical.assignment.tests;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import mathworks.technical.assignment.helpers.Covid19Helper;
import mathworks.technical.assignment.model.StatisticsObject;

public class Test_Scenario1 {
	
	private Covid19Helper covid19Helper;
	
	
	@BeforeClass
	public void init() {
		covid19Helper = new Covid19Helper();
	}
	
	
	/*
	 * This test will check if the result of API is greater than 0
	 */
	@Test
	public void testValidateStatisticsResult() {
		StatisticsObject statistics = covid19Helper.getStatistics();
		boolean result = false;
		if (statistics.getResults() > 0) {
			result = true;
		}
		Assert.assertEquals(true,result);
	}
	/*
	 * This test case will check the country in the statistics
	 */
	@Test
	public void testValidateStatisticsCountry() {
		StatisticsObject statistics = covid19Helper.getStatistics();
		String country = statistics.getResponse().get(0).getCountry();
		Assert.assertEquals("USA",country);
	}
}
