package entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactList {

    public final List<Fact> facts = new ArrayList<>();

    @JsonAnyGetter
    public List<Fact> any() {
        return facts;
    }

    @JsonAnySetter
    public void set(Fact value) {
        facts.add(value);
    }
}
