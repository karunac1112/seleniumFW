package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Login extends BasePage
{

@FindBy(name="username")
private WebElement username;

@FindBy(name="pwd")
private WebElement password;

@FindBy(xpath="//input[@type='submit']")
private WebElement login;

public Login(WebDriver d)  //Constructor
{
	super(d);
	PageFactory.initElements(d, this);		
}

public WebElement username()
{
	return username;
}
public WebElement password()
{
	return password;
}
public WebElement login()
{
	return login;
}

	
}
