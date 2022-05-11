import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {


    public static void main(String[] args) throws InterruptedException {
        /*
        1. Yeni bir class olusturun (TekrarTesti)
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. Sayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
       10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
       URL'yi yazdırın
       11.Sayfayi kapatin

         */
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.Youtube.com");
        Thread.sleep(1500);
        String  actualTitle=driver.getTitle();
        String arananTitle="youtube";
        // System.out.println(driver.getTitle());
        if ((arananTitle.equals(actualTitle))){
            System.out.println("title testi PASSED");
        }else {
            System.out.println("Youtube actual baslik: " + actualTitle);
        }

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String arananKelime="youtube";
        if(actualUrl.contains(arananKelime)){
            System.out.println("Youtube  url testi PASSED");
        }else{
            System.out.println(actualUrl);
        }



        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().fullscreen();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String amazonActualTitle= driver.getTitle();
        String arananBaslik="Amazon";
        if(amazonActualTitle.contains(arananBaslik)) {
            System.out.println("Amazon title testi PASSED");
        } else{
            System.out.println("Guncel title: " + amazonActualTitle);

        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String amazonActualUrl= driver.getCurrentUrl();
        String arananUrl="https://www.amazon.com/";
        if(amazonActualUrl.equals(arananUrl)){
            System.out.println("Amazon url testi PASSED");
        }else {
            System.out.println("guncel amazon url : " + amazonActualUrl);
        }


        //11.Sayfayi kapatin
        driver.close();
    }
}
