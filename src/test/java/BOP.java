import org.openqa.selenium.By;

/**
 * Created by vpykhalov on 4/6/2016.
 */
public class BOP extends Driver {
    public void navigate(String url) {

        driver.get(url);
    }

    public String getTitle() {

        return driver.getTitle();

    }

    public void textSearch(String text, String findElement) {

        driver.findElement(By.cssSelector(findElement)).sendKeys(text);

    }

    public void clickSelector(String clickElement) {

        driver.findElement(By.cssSelector(clickElement)).click();

    }

    public void inputText(String selector,String text) {
        driver.findElement(By.cssSelector(selector)).sendKeys(text);
    }
//    public void inputTextUserName(String selectorUser,String userName) {
//        driver.findElement(By.cssSelector(selectorUser)).sendKeys(userName);
//
//    }
//    public void inputTextPassword( String selectorPassword,String passWord){
//        driver.findElement(By.cssSelector(selectorPassword)).sendKeys(passWord);}

    public void clickMailSelector(String clickElement) {

        driver.findElement(By.cssSelector(clickElement)).click();

    }

}

