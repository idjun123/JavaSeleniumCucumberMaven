package StepDefinition;

import io.cucumber.java.en.*;
import static pages.LoginPage.*;

public class LoginPage {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws Throwable {
        fillLoginFields();
        clickSignIn();
    }

}
