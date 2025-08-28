package week5day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailAutomation {
	public static void main(String[] args) throws InterruptedException {

   

    // Launch Chrome browser
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    // 1. Launch the erail URL
    driver.get("https://erail.in/");

    // 2. Enter "MAS" as the "From" station
    WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
    fromStation.clear();
    fromStation.sendKeys("MAS");
    Thread.sleep(1000);
    fromStation.sendKeys("\n");

    // 3. Enter "MDU" as the "To" station
    WebElement toStation = driver.findElement(By.id("txtStationTo"));
    toStation.clear();
    toStation.sendKeys("MDU");
    Thread.sleep(1000);
    toStation.sendKeys("\n");

    // 4. Uncheck the "Sort on Date" checkbooks
    WebElement sortOnDate = driver.findElement(By.id("chkSelectDateOnly"));
    if (sortOnDate.isSelected()) {
        sortOnDate.click();
    }

    Thread.sleep(3000); // wait for table refresh

    // 5. Retrieve train names from the web table
    List<WebElement> trainNames = driver.findElements(
            By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));

    System.out.println("Total trains listed: " + trainNames.size());

    // 6. Verify duplicates
    Set<String> uniqueTrains = new HashSet<>();
    boolean hasDuplicates = false;

    for (WebElement train : trainNames) {
        String name = train.getText().trim();
        if (!uniqueTrains.add(name)) {
            System.out.println("Duplicate train found: " + name);
            hasDuplicates = true;
        }
    }

    if (!hasDuplicates) {
        System.out.println("✅ No duplicate train names found.");
    }

    // Close the browser
    driver.wait();
}
}
	


