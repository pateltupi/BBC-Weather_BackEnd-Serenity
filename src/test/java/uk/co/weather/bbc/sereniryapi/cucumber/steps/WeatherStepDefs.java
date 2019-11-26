package uk.co.weather.bbc.sereniryapi.cucumber.steps;
/*
 * Created By Trupti Patel on 2019-09-12
 */

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class WeatherStepDefs {
    @When("^User send a GET request endpoint$")
    public void userSendAGETRequestEndpoint() {
        Response response = (Response) given()
                .when()
                .get("44418/");
        System.out.println(response.body().prettyPrint());
    }

    @Then("^They should get back a next Five Day weather forcast$")
    public void theyShouldGetBackANextFiveDayWeatherForcast() {
    }

    @When("^User search today's weather status name$")
    public void userSearchTodaySWeatherStatusName() {
        given()
                .when()
                .get("44418/")
                .then()
                .extract().path("consolidated_weather[0].weather_state_name");
    }

    @Then("^User should see today's weather$")
    public void userShouldSeeTodaySWeather() {
    }
}
