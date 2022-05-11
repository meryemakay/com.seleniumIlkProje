import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        /*
        1.
Yeni bir class olusturalim (Homework)
2.
ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.
Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
4.
https://www.walmart.com/ sayfasina gidin.
5.
Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6.
Tekrar “facebook” sayfasina donun
7.
Sayfayi yenileyin
8.
Sayfayi tam sayfa (maximize) yapin
9.
Browser’i kapatin
         */
        System.setProperty("webdriver.chrome.driver","resourcess/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
driver.getTitle();
String actualTitle = driver.getTitle();
String aranan="facebook";
if(actualTitle.equals(aranan)){
    System.out.println("baslık dogru");
}else{
    System.out.println("aranan actualTitle :" + actualTitle );
}


driver.getCurrentUrl();
String actualUrl = driver.getCurrentUrl();
String arananUrl="facebook";
if(actualUrl.contains(arananUrl)){
    System.out.println("sayfa url ı facebook ıcerıyor");
}else {
    System.out.println(actualUrl);
}


driver.get("https://www.walmart.com");
driver.getTitle();
 String actualTitle1=driver.getTitle();
 String aranan1="Walmart.com";

 if(actualTitle1.equals(aranan1)){
     System.out.println("icerıyor");
 }else {
     System.out.println("ıcermıyor "+actualTitle1 );
 }

        driver.navigate().back();//facebook a gerı doner   Icinde olunan sayfadan, geldigi onceki sayfaya dondurur
        Thread.sleep(2000);

        driver.navigate().refresh();//sayfayı refresh yapalım   **Icinde olunan sayfayi yeniler.
        Thread.sleep(2000);

driver.manage().window().maximize();
        Thread.sleep(2000);

driver.close();
    }
}
