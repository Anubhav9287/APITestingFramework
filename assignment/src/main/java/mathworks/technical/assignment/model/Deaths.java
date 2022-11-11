
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
    "new",
    "total"
})
@Generated("jsonschema2pojo")
public class Deaths {

    @JsonProperty("1M_pop")
    private String _1MPop;
    @JsonProperty("new")
    private Object _new;
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

    @JsonProperty("new")
    public Object getNew() {
        return _new;
    }

    @JsonProperty("new")
    public void setNew(Object _new) {
        this._new = _new;
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
