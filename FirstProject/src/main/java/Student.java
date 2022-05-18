
public class Student {
	
	private String sName;
	private int rollNumber;
	
	public Student()
	{
		System.out.println("In the student constructor");
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", rollNumber=" + rollNumber + "]";
	}
	
	public String reverseName(String name)
	{
		String rName = "";
		
		return rName;
	}
	

}
