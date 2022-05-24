package week1.day2;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

	}

}
