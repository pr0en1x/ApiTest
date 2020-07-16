import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import requests.Deserialize;

public class ApiTest {

    @Test()
    @Description(value = "Тест проверяет, что Kasimir Shulz написал больше всех фактов")
    public void KasimirShulzWroteMaxFacts() {
            Assert.assertEquals(Deserialize.maxFacts().getName(), "Kasimir Shulz");
    }
}
