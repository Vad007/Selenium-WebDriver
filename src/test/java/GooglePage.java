import org.openqa.selenium.By;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by vpykhalov on 4/6/2016.
 */
public class GooglePage extends BOP {
    private String findElement = "#lst-ib";
    private String clickElement = "button[name='btnG']";
    private String elementName ="[name=btnG]";
    private String mailLink =".r a[href*='mail.ru']";

    public void navigateToGoogle() {

        navigate("http://www.google.com.ua");
    }
    public void verifyGooglePage(){

        assertEquals("Google", getTitle());

    }
    public void inputText(String searchText) {

        textSearch(searchText, findElement);

    }

    public void startSearchGoogle () {

        clickSelector(elementName);

    }
    public boolean verifyMail(){

        if (driver.findElements(By.cssSelector(elementName)).size() !=0 ) {

            return true;

        }
        else {

            System.out.println("There isn't Mail page");
            return true;
        }

    }


    public void goToMail() {

        clickSelector(mailLink);
    }

}

