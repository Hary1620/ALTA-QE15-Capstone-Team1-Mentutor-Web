package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Hooks {
    public static WebDriver driver;

    public static ChromeOptions GenerateDriverChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox",
//                "--single-process",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
        );
        return options;
    }

    public static EdgeOptions GenerateEdgeDriver(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments(
                "--no-sandbox",
            "--single-process",
                "--ignore-ssl-errors=yes",
                "--ignore-certificate-errors",
                "--window-size=1280,800",
                "--remote-allow-origins=*"
        );
        return options;
    }

    @Before
    public void openBrowser(){
        //inisiasi library selenium
       driver = new ChromeDriver(GenerateDriverChrome());
//        driver = new EdgeDriver(GenerateEdgeDriver());

        String appUrl = "https://mentutor-fe.vercel.app/";
        driver.get(appUrl);//fungsi untuk ngebuka link html
        driver.manage().window().maximize();//fungsi untuk maximize browser
    }

    @After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
}

