package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Fact {
    @JsonProperty("_id")
    String id;
    String text;
    String type;
    User user;
    Integer upvotes;
    Object userUpvoted;
    @JsonProperty("all")
    private List<Fact> factList = null;
    @JsonProperty("all")
    public List<Fact> getFactList() {
        return factList;
    }
}
