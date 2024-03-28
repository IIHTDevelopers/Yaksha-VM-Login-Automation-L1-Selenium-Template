package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Automation_L1_Pages extends StartupPage{
	
	By helloLoginButton=By.xpath("");
    By loginButton=By.xpath("");
    By signInIframe=By.xpath("");
    By loginWithPasswordButton=By.xpath("(");
    By emailIdField=By.xpath("");
    By passwordField=By.xpath("");
    By logInButton=By.xpath("");
    By errorMessage=By.xpath("");
    By logInButtonAtRightTopCorner=By.xpath("");

	String pageName = this.getClass().getSimpleName();

	public Login_Automation_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}
	
	/**@Test1
	 * about this method openTheLoginPanelByClickingOnLogin() 
	 * @param : null
	 * @description : open The Login Panel By Clicking On Login
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean openTheLoginPanelByClickingOnLogin() throws Exception {
		
		return false;
	}
	
	/**@Test2
	 * about this method clickOnLoginAndswitchToSigninIframe() 
	 * @param : null
	 * @description : click On Login And switch To Signin Iframe
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnLoginAndswitchToSigninIframe() throws Exception {
		
		return false;
	}
	
	/**@Test3
	 * about this method openLoginWithPasswordbox() 
	 * @param : null
	 * @description : open Login With Password box
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean openLoginWithPasswordbox() throws Exception {
		
		return false;
	}
	
	/**@Test4
	 * about this method enterEmailandPasswordInLoginBox() 
	 * @param : Map<String, String>
	 * @description : enter Email and Password In LoginBox
	 * @return : String
	 * @author : Yaksha
	 */
	public String enterEmailandPasswordInLoginBox(Map<String, String> expectedData) throws Exception {
		
		return null;
	}
	
	/**@Test5
	 * about this method clickOnLoginButton() 
	 * @param : null
	 * @description : click On Login Button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnLoginButton() throws Exception {
		
		return false;
	}
	
	/**@Test6
	 * about this method checkforFailureLoginValidateTheErrorMessage() 
	 * @param : null
	 * @description : check for Failure Login Validate The Error Message(Check for failure Login and validate the error message)
	 * @return : String
	 * @author : Yaksha
	 */
	public String checkforFailureLoginValidateTheErrorMessage() throws Exception {
		
		return null;	

	}
	
	/**@Test7
	 * about this method provideValidUserNameAndPasswordAndValidate() 
	 * @param : Map<String, String>
	 * @description : provide Valid User Name And Password And Validate, Check for success Login
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean provideValidUserNameAndPasswordAndValidate(Map<String, String> expectedData) throws Exception {
		
		return false;
	}
	
	
}
