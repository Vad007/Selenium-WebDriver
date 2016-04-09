/**
 * Created by vpykhalov on 4/6/2016.
 */
public class MailPage extends BOP {
    private String selectorUser ="#mailbox__login";
    private String selectorPassword ="#mailbox__password";
    private String selectorSigin ="#mailbox__auth__button";
    private String selectorLogOut = "#PH_logoutLink";

    public void startSigin () {

        clickSelector(selectorSigin);

    }

    public void inputTextUserName (String userName) {
        inputText(selectorUser, userName);
    }

    public void inputTextPassword (String password) {
        inputText(selectorPassword, password);
    }

    public void inputCredential(String userName, String password) {
        inputTextUserName(userName);
        inputTextPassword(password);

    }
    public void clickLogout(){
        clickSelector(selectorLogOut);
    }
}

