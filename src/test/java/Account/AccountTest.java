package Account;

import pages.MyAccount;
import org.testng.annotations.Test;

public class AccountTest {

    final MyAccount account = new MyAccount();

    @Test
    public void AccountLogin(){
        account.AccountPage();
    }

}
