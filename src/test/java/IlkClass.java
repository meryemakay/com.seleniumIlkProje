import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resourcess/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com");//String olarak girilen Url’e gider
        System.out.println("driver.getTitle() = " + driver.getTitle());//Icinde olunan sayfanin basligini String olarak getirir
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//Icinde olunan sayfanin Url’ini String olarak getirir
        System.out.println(driver.getPageSource());//Icinde olunan sayfanin kaynak kodlarini String olarak getirir
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());//Icinde olunan sayfa ve/veya tab’larin handle degerlerini getirir
driver.close();


    }
}
