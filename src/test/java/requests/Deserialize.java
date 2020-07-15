package requests;

import entities.Fact;
import entities.User;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Deserialize {
    public static User maxFacts() {
        Map<User, Long> factsCountByUser = RequestApi.response().
                jsonPath().
                getList("all", Fact.class).
                stream().
                filter(e -> e.getUser() != null).
                collect(Collectors.groupingBy(Fact::getUser, Collectors.counting()));

        return Collections.max(factsCountByUser.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
