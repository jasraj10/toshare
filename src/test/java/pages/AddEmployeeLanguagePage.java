package pages;

import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AddEmployeeLanguagePage extends CommonMethods {


    @FindBy(id="menu_leave_viewLeaveModule")
    public  WebElement myInfo;

    @FindBy(xpath = "//table[@id='resultTable']/tbody/tr[1]/td[3]/a")
    public WebElement empNameBtn;

    @FindBy(partialLinkText = "Qualifications")
    public WebElement Qualbtn;
    @FindBy(id="addLanguage")
    public WebElement addLangBtn;
    @FindBy(id="language_code")
    public WebElement LangBtn;
    @FindBy(id="language_lang_type")
    public WebElement LangTypeBtn;
    @FindBy(name="language[comments]")
    public WebElement LangComments;
    @FindBy(id="btnLanguageSave")
    public WebElement LangSaveBtn;



    public AddEmployeeLanguagePage(){
        PageFactory.initElements(driver, this);
    }

}
