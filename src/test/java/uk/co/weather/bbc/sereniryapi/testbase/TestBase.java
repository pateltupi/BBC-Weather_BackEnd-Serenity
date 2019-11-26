package uk.co.weather.bbc.sereniryapi.testbase;
/*
 * Created By Trupti Patel
 */

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void inIt(){

        RestAssured.baseURI = "https://www.metaweather.com/api/location/";
    }
}
