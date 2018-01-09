package arnabFiles;

public class SubjectIntake extends InfoClass{
	
	int number_of_subjects; //extra field added in this class
	
	@Override
	public void setAccount(String pass, int account) {
		
		super.setAccount(pass, account);
	}

	SubjectIntake()
	{
	 this.number_of_subjects=0;	
	}

	public int getNumber_of_subjects() {
		return number_of_subjects;
	}

	public void setNumber_of_subjects(int number_of_subjects) {
		this.number_of_subjects = number_of_subjects;
	}

	
}
