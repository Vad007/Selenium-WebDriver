/**
 * Created by vpykhalov on 4/6/2016.
 */
public class MailPage extends BOP {
    private String selectorUser ="#mailbox__login";
    private String selectorPassword ="#mailbox__password";
    private String selectorSigin ="#mailbox__auth__button";

    public void inputText(String userName,String selectorUser, String passWord,String selectorPassword) {

        inputTextUserName(userName,selectorUser);
        inputTextPassword(passWord,selectorPassword);}
    public void startSigin () {

        clickSelector(selectorSigin);

    }
}

