package erp.empl_lib;
import java.util.Date;
import java.util.UUID;

import erp.empl_lib.Interfaces.*;

public abstract class Person implements IPerson {
	private UUID id;
	private String name;
	private String sername;
	private String patronomic;
	private Date dob;
	
	public UUID getId() {return id;}
	public void  setId(UUID id) {this.id = id;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getSerame() {return sername;}
	public void setSername(String sername) {this.sername = sername;}
	
	public String getPatronomic() {return patronomic;}
	public void setPatronomic(String patronomic) {this.patronomic = patronomic;}
	
	public Date getDOB() {return dob;}
	public void setDOB(Date dob) {this.dob = dob;}
}
