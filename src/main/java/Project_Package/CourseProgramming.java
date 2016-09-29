package Project_Package;

import org.joda.time.DateTime;

public class CourseProgramming {
	private String name;
	private Modules mods[];
	private DateTime start;
	private DateTime end;
	public CourseProgramming(String nm, Modules m[], DateTime s, DateTime e){
		this.name=nm;
		this.mods = m;
		this.start=s;
		this.end=e;
	}
	public String getName(){
		return this.name;
	}
	public Modules[] getModules(){
		return this.mods;
	}
	public DateTime getStartDate(){
		return this.start;
	}
	public DateTime getEndDate(){
		return this.end;
	}

}
