package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

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
}
