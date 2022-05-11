import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManage {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resourcess/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        System.out.println("wındow olculerı : " +driver.manage().window().getSize());
        //wındow olculerı : (1051, 798)
        System.out.println(" wındow konumu: "+driver.manage().window().getPosition());
        // wındow konumu: (9, 9)
        Thread.sleep(2000);

        driver.manage().window().setPosition(new Point(15,15));//Browser’in koordinatlarini verir
        driver.manage().window().setSize(new Dimension(900,600));//Browser’in olculerini verir


        System.out.print("yeni pencere olculerı :");
        System.out.println(driver.manage().window().getSize());//yeni pencere olculerı :(902, 602)


        System.out.print("yeni pencere konumu : ");
        System.out.println(driver.manage().window().getPosition());//yeni pencere konumu : (13, 13)

        Thread.sleep(2000);



}

}
