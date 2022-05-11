import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlar {
    public static void main(String[] args) {
          /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in "https://www.amazon.com/" a esit oldugunu test edin
            4- sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","resourcess/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        // 1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com"); //amazon url ye gıdıldı


        //  2- Basligin Amazon kelimesi icerdigini test edin
        String actualTitle = driver.getTitle(); //driver.getTitle() Icinde olunan sayfanin basligini String olarak getirir
        String arananKelime="Amazon";

        if (actualTitle.contains(arananKelime)){     //Title testi PASSED
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title "+ arananKelime + "'yi icermiyor, title testi FAILED");
        }

        //  3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualUrl= driver.getCurrentUrl();// driver.getCurrentUrl() Icinde olunan sayfanin Url’ini String olarak getirir
        String expectedUrl="https://www.amazon.com";

        if(actualUrl.equals(expectedUrl)){  //actual Url:https://www.amazon.com/ beklenen URL'den farkli, test FAILED
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("actual Url:"+actualUrl+" beklenen URL'den farkli, test FAILED");
        }


        // 4- sayfayi kapatin
        driver.close();

    }
}




