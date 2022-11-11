package mathworks.technical.assignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"prediction",
"probability"
})
@Generated("jsonschema2pojo")
public class Prediction {

@JsonProperty("prediction")
private String prediction;
@JsonProperty("probability")
private Double probability;

@JsonProperty("prediction")
public String getPrediction() {
return prediction;
}

@JsonProperty("prediction")
public void setPrediction(String prediction) {
this.prediction = prediction;
}

@JsonProperty("probability")
public Double getProbability() {
return probability;
}

@JsonProperty("probability")
public void setProbability(Double probability) {
this.probability = probability;
}

}