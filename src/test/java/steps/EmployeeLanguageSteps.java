package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;


public class EmployeeLanguageSteps extends CommonMethods {

    @When("user enters employee username and password")
    public void user_enters_username_and_password() {
        openBrowserAndLaunchApplication();
        WebElement username = driver.findElement(By.name("txtUsername"));
        username.sendKeys("rickjames123");
        WebElement password = driver.findElement(By.name("txtPassword"));
        password.sendKeys("Syntax@123");


    }
    @Then("user clicks on the login button")
    public void user_clicks_on_login_button(){

        click(loginPage.loginBtn);

    }
    @Given("user is navigated to my info page")
    public void user_is_navigated_to_my_info_page()  {
      click(addEmployeeLanguagePage.empNameBtn);


    }
    @When("user clicks qualifications")
    public void user_clicks_qualifications() {

        click(addEmployeeLanguagePage.Qualbtn);
    }
    @When("user clicks add under Language")
    public void user_clicks_add_under_language() {

        click(addEmployeeLanguagePage.addLangBtn);
    }
    @When("selects language")
    public void selects_language() throws InterruptedException {
        click(addEmployeeLanguagePage.addLangBtn);
        Thread.sleep(2000);
        WebElement selectEnglish = driver.findElement(By.partialLinkText("English"));
        selectEnglish.click();


    }
    @When("selects fluency")
    public void selects_fluency() throws InterruptedException {
        click(addEmployeeLanguagePage.LangBtn);
        Thread.sleep(2000);
        WebElement selectFluency = driver.findElement(By.partialLinkText("Writing"));
        selectFluency.click();

    }
    @When("selects competency")
    public void selects_competency() throws InterruptedException {
       click(addEmployeeLanguagePage.LangTypeBtn);
        Thread.sleep(2000);
        WebElement selectCompetency = driver.findElement(By.partialLinkText("Mother Tongue"));
        selectCompetency.click();

    }
    @When("enters comments")
    public void enters_comments() {
        click(addEmployeeLanguagePage.LangComments);
        sendText(addEmployeeLanguagePage.LangComments, "hello");
    }
    @Then("clicks save")
    public void clicks_save() {

        click(addEmployeeLanguagePage.LangSaveBtn);
    }


}
