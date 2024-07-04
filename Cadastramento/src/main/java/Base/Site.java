package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

public class Site
{
    public WebDriver driver;
    public String url;
    @BeforeClass
    public void Before()
    {
        url = "";
        driver = new EdgeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    protected WebDriver GetDriver() {return driver;}
}
