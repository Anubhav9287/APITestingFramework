package mathworks.technical.assignment.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;

import mathworks.technical.assignment.helpers.SentimentHelper;
import mathworks.technical.assignment.model.SentimentPrediction;

@RunWith(DataProviderRunner.class)
public class Test_Scenario2 {
	
	private static SentimentHelper sentimentHelper;
	
	@BeforeClass
	public static void init() {
		sentimentHelper = new SentimentHelper();
	}
	
	@DataProvider
    public static Object[][] sentimentAnalysis() {
        return new Object[][]{
                {1, "en", "I am a programmer"},
                {2, "en", "Hello I love the service"},
                {3, "en", "failure is not fatal"},
                {4, "en", "Lead from the heart, not the head"},
                {5, "en", "You cannot protect yourself from sadness without protecting yourself from happiness"}
        };
    }
	
	@Test
	@UseDataProvider("sentimentAnalysis")
	public void testCheckIdExits(int id, String language, String text) {
		SentimentPrediction predictions = sentimentHelper.getSentiments(id,language,text);
		
		String r_id = predictions.getId();
		assertNotNull(r_id,"id is not null");
	}
	
	@Test
	@UseDataProvider("sentimentAnalysis")
	public void testVerifyProbabilityGreaterThanHalf(int id, String language, String text) {
		SentimentPrediction predictions = sentimentHelper.getSentiments(id,language,text);
		Double probability = predictions.getPredictions().get(0).getProbability();
		assertTrue(probability > 0.5);
	}
	
}
