package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than jessica wants to learn automation at the academy Choucair$")
    public void thanJessicaWantsToLearnAutomationAtTheAcademyChoucair() {
    OnStage.theActorCalled("Jessica").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }


    @When("^she search for the course Recursos Automatización Bancolombia on the choucair academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^she finds the course called Recursos Automatización Bancolombia$")
    public void sheFindsTheCourseCalledRecursosAutomatizaciónBancolombia() {

    }
}
