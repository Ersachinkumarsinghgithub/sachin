package testcases;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import basepage.Base_Page;
import pages.Flipkart_Login;
public class Flipkart_LoginTest extends Base_Page {
 
 @Test
 public void init() throws Exception {
 
 Flipkart_Login loginpage = 
PageFactory.initElements(driver,Flipkart_Login.class);
 
 loginpage.setEmail("abc@gmail.com");
 loginpage.setPassword("abcdef");
 loginpage.clickLoginButton();
 }
}
