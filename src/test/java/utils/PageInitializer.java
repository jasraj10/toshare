package utils;

import pages.AddEmployeeLanguagePage;
import pages.LoginPage;


public class PageInitializer {
    public static LoginPage loginPage;
    public static AddEmployeeLanguagePage addEmployeeLanguagePage;




    public static void initializePageObjects() {
        loginPage = new LoginPage();
        addEmployeeLanguagePage = new AddEmployeeLanguagePage();

    }
}

