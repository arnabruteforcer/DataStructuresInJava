package arnabFiles;

public class InfoClass {
	
	private String name;
	private int roll;
	private int rank;
	private int account;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRoll() {                       // displaying the roll number
		return roll;
	}
	
	public void setRoll(int roll) {                   
		this.roll = roll;
	}
	
	public int getRank() {                    // displaying the rank 
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void getAccount() {                         // displaying the account
		System.out.println("Access Denied");
	}
	
	
	private void validateAndModifyAccount (String password,int account)
	{
		 if(password.equals("mypass"))
		 {
			 this.account = account;
			 System.out.println("account modified successfully");
		 }
			 else
		 {
			 System.out.println("invalid user");
		 }
	}

	
	public void setAccount(String pass,int account) {
		validateAndModifyAccount( pass,account );
	}	

}
