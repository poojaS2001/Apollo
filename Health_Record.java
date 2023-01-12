package Step_definition;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page_Factory.HealthpageFac;
import io.cucumber.java.en.*;

public class Health_Record {

	WebDriver driver=new ChromeDriver();
	HealthpageFac log=new HealthpageFac(driver);
	
@Given("user is on home page")
public void user_is_on_home_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
    
    driver.get("https://www.apollo247.com/");
    driver.manage().window().maximize();
	
}

@When("user click on login\\/sign up popup")
public void user_click_on_login_sign_up_popup() throws InterruptedException {
    log.Alertion();
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    log.lgn();
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@And("user enter mobile number and click on arrow button")
public void user_enter_mobile_number_and_click_on_arrow_button() throws InterruptedException {
	 log.Number();
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
}

@And("After entering OTP")
public void after_entering_otp() throws InterruptedException {
	log.Labl();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Then("click on arrow button")
public void click_on_arrow_button() throws InterruptedException {
    log.Arrowclick();
    driver.get("https://www.apollo247.com/health-records/prescription");
    log.Test();
    log.Hospital();
    log.Health();
    log.Ins();
    log.Bill();
    
    
    
    
    
}






@Given("User is in Health Record Tab")
public void user_is_in_health_record_tab() {
	driver.get("https://www.apollo247.com/health-records/prescription");
}

@When("Click on doctor consultation category.")
public void click_on_doctor_consultation_category() {
	log.Alertion();
	log.Doc_consultation();
}

@And("User add the Prescription.")
public void user_add_the_prescription() {
    log.addingpresc();
}

@And("User enter the date.")
public void user_enter_the_date() throws InterruptedException {
	log.Calen();
	
    
}

@And("User enter the patient name.")
public void user_enter_the_patient_name() {
    log.P_name();
}

@And("User enter the doctor name.")
public void user_enter_the_doctor_name() {
    log.D_name();
}

@Then("User is able to view consultation report and previous report.")
public void user_is_able_to_view_consultation_report_and_previous_report() {
	log.UPLOAD();
    log.DONE();
   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

@Given("User is home page of health record Tab")
public void user_is_home_page_of_health_record_tab() {
    
	 driver.get("https://www.apollo247.com/health-records/prescription");
	
}

@When("Click on Test Report category.")
public void click_on_test_report_category() {
	log.Alertion();
	log.Test();
}

@And("User is able to view previous Test report")
public void user_is_able_to_view_previous_test_report() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@And("Click on Hospitalization  category.")
public void click_on_hospitalization_category() {
    log.Hospital();
}

@And("User is able to view previous Hospitalization report")
public void user_is_able_to_view_previous_hospitalization_report() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@And("Click on Health Condition category.")
public void click_on_health_condition_category() {
    log.Health();
}

@And("User is able to view previous Health Condition report")
public void user_is_able_to_view_previous_health_condition_report() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@And("Click on vaccination category.")
public void click_on_vaccination_category() {
    log.Vac_n();
}

@And("User is able to view previous vaccination report")
public void user_is_able_to_view_previous_vaccination_report() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@And("Click on bills category.")
public void click_on_bills_category() {
   log.Bill();
}

@And("User is able to view previous bill details")
public void user_is_able_to_view_previous_bill_details() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@And("Click on Insurance category.")
public void click_on_insurance_category() throws InterruptedException {
   log.Ins();
}

@Then("User is able to view previous Insurance report")
public void user_is_able_to_view_previous_insurance_report() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,500)");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}

}
