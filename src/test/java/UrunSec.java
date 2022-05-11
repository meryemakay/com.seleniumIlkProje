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
           //1.webdriver ın turu ve path ı belırlendı
            System.setProperty("webdriver.chrome.driver","resourcess/drivers/chromedriver.exe");

            /*2.driver objesı olusturuldu
            WebDriver : bir interface’dir, dolayisiyla obje uretemeyiz.
             Browser’larin driver olusturabilmesi icin bir
          kalip gibi calisir. Biz hangi browser’I
            kullanmak istersek driver olustururken o browser’a ait constructor’I
            kullaniriz.

      **
driver, insan olarak yaptigimiz veya gordugumuz tum
islemleri otomasyon yapmamiza yardimci olur.
             */
            WebDriver driver = new ChromeDriver();

            //3.driver objesı uzerınden WebDriver calssından methodlar kullnıldı
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
