package Parabank.application;



import org.testng.annotations.Test;


@Test
public class AppTest extends App{
	public void one() {
		
	drivertype("chrome");
	url("https://parabank.parasoft.com/parabank/index.htm");
	enter("//input[@name='username']","Username");
	enter("//input[@name='password']","Password");
	click("//input[@value='Log In']");
	close();
}

	
    
}
