package grid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

class Ex01_UsingGridonDocker extends BaseTest4{

	@Test
	void test() {
		System.out.println("hello");
		this.getDriver().findElement(By.linkText("Settings")).click();
		this.getWaiter().until(ExpectedConditions.visibilityOfElementLocated(By.id("blogname")));

		Select weekStart = new Select(getDriver().findElement(By.id("start_of_week")));
		String expectedDay = "Monday";
		weekStart.selectByVisibleText(expectedDay);

		String actualDay = weekStart.getFirstSelectedOption().getText();
		assertEquals(expectedDay, actualDay, "Verify the start of the week");
		System.out.println("bye bye");
	}

}
