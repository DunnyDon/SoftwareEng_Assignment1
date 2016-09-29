package Project_Package;

public class Student {
	private int id;
	private String name;
	private String dob;
	private String username;
	public Student(String nm, String birthday,int idnum){
		this.name=nm;
		this.dob=birthday;
		this.id=idnum;
	}
	public String getUserName(){
		return this.name+this.id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public String getdob(){
		return this.dob;
	}
}
