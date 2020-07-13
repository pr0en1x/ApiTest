import org.testng.Assert;
import org.testng.annotations.Test;
import requests.RequestApi;

public class Deserializing {

    @Test()
    public void deserialize() {
            Assert.assertEquals("Kasimir Shulz",
                    RequestApi.maxEntry().getName());
    }
}
