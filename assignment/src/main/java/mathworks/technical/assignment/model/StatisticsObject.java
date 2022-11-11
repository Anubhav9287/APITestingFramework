
package mathworks.technical.assignment.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/*
 * POJO for statistics object
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "errors",
    "get",
    "parameters",
    "response",
    "results"
})
@Generated("jsonschema2pojo")
public class StatisticsObject {

    @JsonProperty("errors")
    private List<Object> errors = null;
    @JsonProperty("get")
    private String get;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("response")
    private List<Response> response = null;
    @JsonProperty("results")
    private Integer results;

    @JsonProperty("errors")
    public List<Object> getErrors() {
        return errors;
    }

    @JsonProperty("errors")
    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

    @JsonProperty("get")
    public String getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(String get) {
        this.get = get;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
    return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
    this.parameters = parameters;
    }


    @JsonProperty("response")
    public List<Response> getResponse() {
        return response;
    }

    @JsonProperty("response")
    public void setResponse(List<Response> response) {
        this.response = response;
    }

    @JsonProperty("results")
    public Integer getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Integer results) {
        this.results = results;
    }

}
