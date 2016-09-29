package Project_Package;

public class Modules {
	private String mod_name;
	private int mod_id;
	private Student students[];
	public Modules(String mod, int num,Student s[] ){
		this.mod_name=mod;
		this.mod_id=num;
		this.students=s;
	}
	public String getMod_Name(){
		return this.mod_name;
	}
	public int getId(){
		return this.mod_id;
	}
	public Student[] getStudents(){
		return this.students;
	}
}
