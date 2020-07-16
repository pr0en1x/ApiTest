package requests;

import entities.Fact;
import entities.User;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Deserialize {
    @Step("Найти юзера с наибольшим кол-во фактов")
    public static User maxFacts() {
        Map<User, Long> factsCountByUser = RequestApi.response().
                jsonPath().
                getList("all", Fact.class).
                stream().
                filter(e -> e.getUser() != null).
                collect(Collectors.groupingBy(Fact::getUser, Collectors.counting()));
        User user = Collections.max(factsCountByUser.entrySet(), Map.Entry.comparingByValue()).getKey();
        Allure.addAttachment("Результат", user.toString());

        return user;
    }
}
