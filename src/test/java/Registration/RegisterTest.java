package Registration;

import org.testng.annotations.Test;
import pages.Registration;

public class RegisterTest {

    final Registration register = new Registration();
    @Test
    public void Register(){
        register.FillRegister();
    }
}

