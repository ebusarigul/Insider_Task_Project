package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InsiderPage {

    public InsiderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//a[text()=\"Login\"]")
    public WebElement btn_login;

    @FindBy(xpath="//a[text()=\"Get a Demo\"]")
    public WebElement btn_getADemo;

    @FindBy(xpath="//*[@id=\"navbarDropdownMenuLink\" and contains(text(),\"Company\")]")
    public WebElement ddown_companyMenu;

    @FindBy(css="a[href=\"https://useinsider.com/careers/\"]")
    public WebElement btn_careers;

    @FindBy(css="#career-our-location")
    public WebElement block_careersOurLocation;

    @FindBy(xpath="//*[@class=\"location-info\"]")
    public WebElement locationsInfo;

    @FindBy(xpath="//*[text()=\"Life at Insider\"]//..//..//..//..//..")
    public WebElement block_lifeAtInsider;

    @FindBy(xpath="//a[contains(@href,\"qualityassurance\")]")
    public WebElement btn_seeAllJobs;

    @FindBy(css="#select2-filter-by-location-container")
    public WebElement ddown_filterByLocation;

    @FindBy(css="#select2-filter-by-department-container")
    public WebElement ddown_filterByDepartment;

    @FindBy(css="#filter-by-location")
    public WebElement filterByLocation;

    @FindBy(css="#filter-by-department")
    public WebElement filterByDepartment;

    @FindBy(css=".position-list-item-wrapper>span")
    public WebElement departmentResult;

    @FindBy(css=".position-list-item-wrapper>div")
    public WebElement locationResult;

    @FindBy(xpath="//*[text()=\"Accept All\"]")
    public WebElement btn_acceptAll;

    @FindBy(xpath="(//a[contains(text(),\"View Role\")])[3]")
    public WebElement btn_viewRole3;

    @FindBy(xpath="//*[text()=\"Apply for this job\"]")
    public WebElement btn_applyForThisJob;

    @FindBy(css=".posting-headline>h2")
    public WebElement txt_jobTitle;


}
