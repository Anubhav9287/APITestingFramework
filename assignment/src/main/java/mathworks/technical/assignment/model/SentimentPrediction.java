package mathworks.technical.assignment.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"id",
"predictions"
})
@Generated("jsonschema2pojo")
public class SentimentPrediction {

@JsonProperty("id")
private String id;
@JsonProperty("predictions")
private List<Prediction> predictions = null;

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("predictions")
public List<Prediction> getPredictions() {
return predictions;
}

@JsonProperty("predictions")
public void setPredictions(List<Prediction> predictions) {
this.predictions = predictions;
}

}