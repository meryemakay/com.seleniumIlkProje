import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethodlar2 {
    public static void main(String[] args) {


        // amazon sitesine gidip Kaynek kodlarinda "Gateway" yazdigini test edin
        System.setProperty("webdriver.chrome.driver", "resourcess/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");


        String sayfaKaynakKodlari = driver.getPageSource();//driver.getPageSource()Icinde olunan sayfanin kaynak kodlarini String olarak getirir
        System.out.println("sayfanın kaynak kodları : " + sayfaKaynakKodlari);
        String arananKelime = "Gateway";

        if (sayfaKaynakKodlari.contains(arananKelime)) { //kaynak kodlarının ıcınde aranan kelıme var mı
            //Kaynak Kodu Testi PASSED
            System.out.println("Kaynak Kodu Testi PASSED");
        } else {
            System.out.println("Kaynak kodlarinda " + arananKelime + " yok, test FAILED");
        }
        driver.close();

    }
}

