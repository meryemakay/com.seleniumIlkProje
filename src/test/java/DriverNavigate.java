import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigate {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resourcess/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //Browser’i maximize yapar

        driver.navigate().to("https://www.amazon.com");//String olarak girilen Url’e gider
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");//String olarak girilen Url’e gider
        Thread.sleep(2000);

        driver.navigate().back();//amazon a gerı doner   Icinde olunan sayfadan, geldigi onceki sayfaya dondurur
        Thread.sleep(2000);

        driver.navigate().forward();//facebook a dondu Back ile donulen bir sayfadan tekrar ileri gider
        Thread.sleep(2000);

        driver.navigate().refresh();//sayfayı refresh yapalım   **Icinde olunan sayfayi yeniler.
        Thread.sleep(2000);

        driver.close(); //sayfa kapandı

    }
}
