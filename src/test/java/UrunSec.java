import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrunSec {



      /*
       1.amazon.com'a git
       2.nutella ara
       3.ilk ürünü seç
       4.list'e ekle.*/

        public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resourcess/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("nutella");
        searchBox.submit();
        searchBox = driver.findElement(By.className("s-image"));
        searchBox.click();
        searchBox = driver.findElement(By.name("submit.add-to-registry.wishlist.unrecognized"));
        searchBox.click();
        Thread.sleep(5000);
        driver.close();
    }

}
