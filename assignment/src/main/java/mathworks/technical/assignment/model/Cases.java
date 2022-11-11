
package mathworks.technical.assignment.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/*
 * POJO for statistics object
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "1M_pop",
    "active",
    "critical",
    "new",
    "recovered",
    "total"
})
@Generated("jsonschema2pojo")
public class Cases {

    @JsonProperty("1M_pop")
    private String _1MPop;
    @JsonProperty("active")
    private Integer active;
    @JsonProperty("critical")
    private Integer critical;
    @JsonProperty("new")
    private String _new;
    @JsonProperty("recovered")
    private Integer recovered;
    @JsonProperty("total")
    private Integer total;

    @JsonProperty("1M_pop")
    public String get1MPop() {
        return _1MPop;
    }

    @JsonProperty("1M_pop")
    public void set1MPop(String _1MPop) {
        this._1MPop = _1MPop;
    }

    @JsonProperty("active")
    public Integer getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Integer active) {
        this.active = active;
    }

    @JsonProperty("critical")
    public Integer getCritical() {
        return critical;
    }

    @JsonProperty("critical")
    public void setCritical(Integer critical) {
        this.critical = critical;
    }

    @JsonProperty("new")
    public String getNew() {
        return _new;
    }

    @JsonProperty("new")
    public void setNew(String _new) {
        this._new = _new;
    }

    @JsonProperty("recovered")
    public Integer getRecovered() {
        return recovered;
    }

    @JsonProperty("recovered")
    public void setRecovered(Integer recovered) {
        this.recovered = recovered;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

}
