package orangehrmm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	@DataProvider
	
	public Object[][] testData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "Bongani";
		data[0][1] = "Mandla";
		
		data[1][0] = "Emily";
		data[1][1] = "Bongani";
		
		return data;
	}//end testData
	
	@Test(dataProvider = "testData")
	public void test(String username,String password) {
		System.out.println("Username" + username + "Password" + password);
	}//end test
}
