import org.testng.Assert;
import org.testng.annotations.Test;
import requests.Deserialize;

public class ApiTest {

    @Test()
    public void KasimirShulzWroteMaxFacts() {
            Assert.assertEquals("Kasimir Shulz",
                    Deserialize.maxFacts().getName());
    }
}
