import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by vpykhalov on 4/6/2016.
 */
public class Test extends Driver {

    @BeforeMethod
    public void startTest() {
        startWebDriver();
    }

    @AfterMethod
    public void stopTest() {
        stopWebDriver();
    }

    @org.testng.annotations.Test
    public void MyTest() {


        GooglePage pageGoogle = new GooglePage();
        MailPage pageMail = new MailPage();

        pageGoogle.navigateToGoogle();
        pageGoogle.verifyGooglePage();
        pageGoogle.inputText("mail");
        pageGoogle.startSearchGoogle();
        pageGoogle.goToMail();
        if (pageGoogle.verifyMail()) {

            pageGoogle.goToMail();

        }

        pageMail.inputTextUserName("wk007");//more pay attention
        pageMail.inputTextPassword("travers2000");//more pay attention
        pageMail.startSigin();
        pageMail.clickLogout();

    }
}
//will make logout process
