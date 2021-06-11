package loans;

import org.testng.annotations.Test;

public class PersonalLoans {
	
	
	@Test(priority = 1)
	public void PersonalLoansLogin() {
		
		System.out.println("This is PersonalLoans login Page");	
	}

	@Test(priority = 1)
	public void PersonalLoansUserPage() {
		
		System.out.println("This is PersonalLoans UserPage Page");	
	}
	
	@Test(priority = 1) 
	public void PersonalLoansSummary() {
		
		System.out.println("This is PersonalLoans Summary Page");	
	}
	
	@Test (priority = 2)
	public void PersonalLoansLogout() {
		
		System.out.println("This is PersonalLoans  Logout Page");	
	}

}
