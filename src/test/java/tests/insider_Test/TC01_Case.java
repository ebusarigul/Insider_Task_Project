package tests.insider_Test;

import org.testng.annotations.Test;
import pages.InsiderPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01_Case {

    InsiderPage insiderPage = new InsiderPage();

    @Test
    public void insider() {

        //1)Visit https://useinsider.com/ and check Insider home page is opened or not

        Driver.getDriver().get(ConfigReader.getProperty("insiderUrl"));
        ReusableMethods.checkEqualsUrl("https://useinsider.com/",Driver.getDriver().getCurrentUrl());
        ReusableMethods.waitTillClickableAndClickIt(insiderPage.btn_acceptAll);

        ReusableMethods.checkElementVisible(insiderPage.btn_login);
        ReusableMethods.checkElementVisible(insiderPage.btn_getADemo);

        //2)Select the “Company” menu in the navigation bar, select “Careers” and check Career
        //  page, its Locations, Teams, and Life at Insider blocks are open or not

        ReusableMethods.waitTillClickableAndClickIt(insiderPage.ddown_companyMenu);
        ReusableMethods.waitTillClickableAndClickIt(insiderPage.btn_careers);
        ReusableMethods.checkEqualsUrl("https://useinsider.com/careers/",Driver.getDriver().getCurrentUrl());

        ReusableMethods.scrollIntoViewJS(insiderPage.block_careersOurLocation);
        ReusableMethods.checkElementVisible(insiderPage.block_careersOurLocation);
        ReusableMethods.wait(2);

        ReusableMethods.scrollIntoViewJS(insiderPage.locationsInfo);
        ReusableMethods.checkElementVisible(insiderPage.locationsInfo);
        ReusableMethods.wait(2);

        ReusableMethods.scrollIntoViewJS(insiderPage.block_lifeAtInsider);
        ReusableMethods.checkElementVisible(insiderPage.block_lifeAtInsider);
        ReusableMethods.wait(2);

        //3)Go to https://useinsider.com/careers/quality-assurance/, click “See all QA jobs”, filter
        //  jobs by Location: “Istanbul, Turkey”, and Department: “Quality Assurance”, check the
        //  presence of the jobs list

        Driver.getDriver().get(ConfigReader.getProperty("insiderQAUrl"));
        ReusableMethods.checkEqualsUrl("https://useinsider.com/careers/quality-assurance/",Driver.getDriver().getCurrentUrl());

        ReusableMethods.waitTillClickableAndClickIt(insiderPage.btn_seeAllJobs);
        ReusableMethods.wait(5);
        ReusableMethods.selectAnItemFromDropdown(insiderPage.filterByLocation,"Istanbul, Turkey");
        ReusableMethods.selectAnItemFromDropdown(insiderPage.filterByDepartment,"Quality Assurance");

        ReusableMethods.findElementWithTextAndCheckAttributeText(insiderPage.ddown_filterByLocation,"title","Istanbul, Turkey");
        ReusableMethods.findElementWithTextAndCheckAttributeText(insiderPage.ddown_filterByDepartment,"title","Quality Assurance");

        //4)Check that all jobs’ Position contains “Quality Assurance”, Department contains
        //  “Quality Assurance”, and Location contains “Istanbul, Turkey”

        ReusableMethods.scrollIntoViewJS(insiderPage.btn_viewRole3);
        ReusableMethods.wait(2);
        ReusableMethods.checkTextOfElements(insiderPage.departmentResult,"Quality Assurance");
        ReusableMethods.checkTextOfElements(insiderPage.locationResult,"Istanbul, Turkey");

        //5)Click the “View Role” button and check that this action redirects us to the Lever
        //  Application form page
        
        ReusableMethods.hover(insiderPage.btn_viewRole3);
        ReusableMethods.waitTillClickableAndClickIt(insiderPage.btn_viewRole3);
        ReusableMethods.switchToNewWindow();
        ReusableMethods.checkContainsUrl("https://jobs.lever.co/useinsider/",Driver.getDriver().getCurrentUrl());
        ReusableMethods.checkElementVisible(insiderPage.btn_applyForThisJob);
        ReusableMethods.checkTextOfElement(insiderPage.txt_jobTitle,"Software Quality Assurance Engineer");









    }

}
