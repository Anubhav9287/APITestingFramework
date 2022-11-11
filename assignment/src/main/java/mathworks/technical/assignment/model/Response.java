
package mathworks.technical.assignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cases",
    "continent",
    "country",
    "day",
    "deaths",
    "population",
    "tests",
    "time"
})
@Generated("jsonschema2pojo")
public class Response {

    @JsonProperty("cases")
    private Cases cases;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("country")
    private String country;
    @JsonProperty("day")
    private String day;
    @JsonProperty("deaths")
    private Deaths deaths;
    @JsonProperty("population")
    private Integer population;
    @JsonProperty("tests")
    private Tests tests;
    @JsonProperty("time")
    private String time;

    @JsonProperty("cases")
    public Cases getCases() {
        return cases;
    }

    @JsonProperty("cases")
    public void setCases(Cases cases) {
        this.cases = cases;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("day")
    public String getDay() {
        return day;
    }

    @JsonProperty("day")
    public void setDay(String day) {
        this.day = day;
    }

    @JsonProperty("deaths")
    public Deaths getDeaths() {
        return deaths;
    }

    @JsonProperty("deaths")
    public void setDeaths(Deaths deaths) {
        this.deaths = deaths;
    }

    @JsonProperty("population")
    public Integer getPopulation() {
        return population;
    }

    @JsonProperty("population")
    public void setPopulation(Integer population) {
        this.population = population;
    }

    @JsonProperty("tests")
    public Tests getTests() {
        return tests;
    }

    @JsonProperty("tests")
    public void setTests(Tests tests) {
        this.tests = tests;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

}
