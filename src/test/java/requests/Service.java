package requests;

import entities.Fact;
import entities.User;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Service {
    public static User maxEntry() {
        Map<User, Long> factsCountByUser = RequestApi.facts().
                stream().
                filter(e -> e.getUser() != null).
                collect(Collectors.groupingBy(Fact::getUser, Collectors.counting()));

        return Collections.max(factsCountByUser.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
