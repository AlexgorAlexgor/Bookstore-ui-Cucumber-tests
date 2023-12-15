package steps;

import pages.*;

public class BaseSteps {
   /* XLoginPage XLoginPage = new XLoginPage();
    XInventoryPage XInventoryPage = new XInventoryPage();*/

    BookStorePage bookStorePage =new BookStorePage();
    ProfilePage profilePage =new ProfilePage();
    LoginForm loginForm=new LoginForm();
    RegisterForm registerForm=new RegisterForm();

   // String BASE_URL = "https://www.saucedemo.com/";

   /* @Before
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(BASE_URL);
    }
    @After
    public void tearDown(){
        closeWebDriver();
    }*/
}


