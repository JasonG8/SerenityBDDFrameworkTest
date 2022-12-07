package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.UserRegister;
import userinterfaces.HomePage;
import utils.drivers.MyChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.constantes.ConstantManage.ACTOR;
import static utils.constantes.ConstantManage.URL;

public class UserRegisterSteps {

    @Before
    public void SetUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorCalled(ACTOR);
        theActorInTheSpotlight().can(BrowseTheWeb.with(MyChromeDriver.chromeHisBrowserWeb().onTheUrl(URL)));

    }


    @When("^user create an account filling all fields$")
    public void userCreateAnAccountFillingAllFields() {
        theActorInTheSpotlight().attemptsTo(UserRegister.makeinformation());
    }

    @Then("^user sees its username$")
    public void userSeesItsUsername() {

    }

}
