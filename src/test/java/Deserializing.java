import org.testng.Assert;
import org.testng.annotations.Test;
import requests.Service;

public class Deserializing {

    @Test()
    public void deserialize() {
            Assert.assertEquals("Kasimir Shulz",
                    Service.maxEntry().getName());
    }
}
