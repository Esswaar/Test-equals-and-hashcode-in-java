
public class Student {
	private String regNumber;
	public Student(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//System.out.println("this is calling by map equals method");
		if(obj != null && obj instanceof Student) {
			String regNumber = ((Student)obj).getRegNumber();
			if( regNumber != null && regNumber == this.regNumber);{
				return true;
			}
			
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//System.out.println("this is calling by map hashcode method");
		return this.regNumber.hashCode();
	}
}
