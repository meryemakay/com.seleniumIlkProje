import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AmazonSearchTest {

    public static void main(String[] args) throws InterruptedException {


/* Tekrar Testi
 1. Bir class oluşturun : AmazonSearchTest
 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
         a.google web sayfasına gidin. https://www. amazon.com/
 b. Search(ara) "city bike"
 c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
 d. "Shopping" e tıklayın.
 e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.*/

            System.setProperty("webdriver.chrome.driver","resourcess/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


            //  a.google web sayfasına gidin. https://www. amazon.com/
            driver.get("https://amazon.com/");


            // b. Search(ara) "city bike"
            WebElement aramaKutusuElemeni = driver.findElement(By.id("twotabsearchtextbox"));//arama kutusuna gıdıldı
            aramaKutusuElemeni.sendKeys("city bike"+ Keys.ENTER);//arama kutusuna ıstenen ıfade yazılıp arama baslatıldı
                                                              //herhngı bır web elemetıne ıstedıgımız yazıyı yollmak ıstersek

            // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
            WebElement aramaSonucElementi=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div"));
            String sonucSayisi[]= aramaSonucElementi.getText().split(" ");
            System.out.println("Sayfadaki sonuc sayisi: "+sonucSayisi[2]);

        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));

        System.out.println("sayfadakı lınk sayısı :" + linkListesi.size());


            // d. "Shopping" e tıklayın.
           //??

            // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
            WebElement ilkSonuc=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
            ilkSonuc.click();//ılk sonuca clık yapıldı
            Thread.sleep(2000);

            driver.get("https://bkmkitap.com");
            Thread.sleep(2000);

            driver.navigate().back();
            Thread.sleep(2000);

            driver.navigate().forward();
            Thread.sleep(5000);

            driver.close();



        }

    }

