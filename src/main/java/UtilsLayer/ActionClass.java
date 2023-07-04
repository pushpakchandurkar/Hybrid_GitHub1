package UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass{
	
	public static void copyPaste()
	{
		System.out.println("ppppppp");
	}
	
	public static void click(WebElement wb)
	{
		Actions act = new Actions(driver);
		act.click(wb).build().perform();
	}
	
	public static void doubleClick(WebElement wb)
	{
		Actions act = new Actions(driver);
		act.doubleClick(wb).build().perform();
	}
	
	public static void rightClick(WebElement wb)
	{
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
			}
	
	public static void moveToElement(WebElement wb)
	{
		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();
	}
	
	public static void DragAndDrop(WebElement srcwb, WebElement tgtwb)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(srcwb, tgtwb).build().perform();
			}
	
	public static void clickAndHold(WebElement wb)
	{
		Actions act = new Actions(driver);
		act.clickAndHold(wb).build().perform();
			}
	
	public static void release(WebElement wb)
	{
		Actions act = new Actions(driver);
		act.release(wb).build().perform();
			}
	
	public static void sendKeys(WebElement wb, String value)
	{
		Actions act = new Actions(driver);
		act.sendKeys(wb, value).build().perform();
			}
	
	public static void sendInUpperCase(WebElement wb, String value)
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(wb, value).keyUp(Keys.SHIFT).build().perform();
			}
	
	public static void CopyPaste(WebElement srcwb, String value, WebElement trgwb)
	{
		new Actions(driver).sendKeys(srcwb, value).keyDown(Keys.CONTROL).keyDown("a")
		.keyDown(Keys.CONTROL).keyDown("c").click(trgwb).keyDown(Keys.CONTROL).keyDown("v").keyUp(Keys.CONTROL)
		.build().perform();
			}
	
	public static void moveToEndofPage()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.END).build().perform();
			}
	
	public static void moveToHomePage()
	{
		Actions act = new Actions(driver);
		act.keyDown(Keys.HOME).build().perform();
			}
	

}
