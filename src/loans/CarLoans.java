package loans;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoans {

	
	
	@Parameters({"MYTEXT"})
	@Test 
	public void CarloansLogin(String mytext) {
		
		System.out.println("This is carloan login Page with"+mytext);	
	}
	
	
	@Test 
	public void CarloansUserPage() {
		
		System.out.println("This is carloan UserPage Page");	
	}
	
	@Test (dataProvider="getData")
	public void CarloansSummary(String Usr,String Pass) {
		
		System.out.println("This is carloan Summary Page" );	
		
		System.out.println(Usr + Pass);
	}
	
	@Test 
	public void CarloansLogout() {
		
		System.out.println("This is carloan  Logout Page");	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
}

}
