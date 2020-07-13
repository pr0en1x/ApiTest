package entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first",
    "last"
})
@Data
public class Name {
    String first;
    String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public Name() { }

    @Override
    public String toString() {
        return first + " " + last;
    }
}
