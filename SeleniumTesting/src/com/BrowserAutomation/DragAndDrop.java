package com.BrowserAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\LIVE TECH\\Testing\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Property of iframe-<iframe src="/resources/demos/droppable/default.html" class="<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>"></iframe>
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//Property of draggable-<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative;">
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		//Property of droppable-<div id="droppable" class="ui-widget-header ui-droppable">
		WebElement drop_Element =driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag_Element,drop_Element).perform();
		driver.switchTo().defaultContent();
		driver.quit();

	}

}
