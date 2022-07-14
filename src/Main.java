import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "d:\\korotkevich\\seleniumdriver\\chromedriver_win32\\chromedriver.exe");
        test(new ChromeDriver());
//        test(new FirefoxDriver());
    }

    public static void test(WebDriver driver) {
        driver.get("http://www.dev.by");

        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException exception){

        }
        driver.close();
    }

}
