
public class Student {
	private String ID;
	private String name;
	
	public Student(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	@Override
	public boolean equals(Object obj) {
		//return true of two student has the same ID
		if(obj instanceof Student) {
			Student anotherS= (Student) obj;
			if(this.ID==anotherS.ID) return true;
			else return false;
		}		
		else return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.ID+"_"+this.name;
	}
	
	
	
	

}
