import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BusinessImplementationClass  {

    WebDriver driver;
    public String user;
    public String passCode;
BusinessImplementationClass(WebDriver driver,String u, String p){
    this.driver=driver;
    this.user=u;
    this.passCode=p;
    PageFactory.initElements(driver, this);


}

public void toPassToBusinessImplementationCls() throws InterruptedException {



    ObjectClass ob=new ObjectClass(driver,user,passCode);

    if(user.equalsIgnoreCase("Admin") && (passCode.equalsIgnoreCase("admin123"))) {
        ob.toEnterUsernamePassword(user, passCode);
        Thread.sleep(3000);
        System.out.println("LoginSuccessful");
    }
    else{
        ob.toEnterUsernamePassword(user, passCode);
        Thread.sleep(3000);
        System.out.println("loginFailed");
    }
    driver.quit();




}


}
