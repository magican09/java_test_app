package erp.empl_lib.Interfaces;

import java.util.Date;

public interface IPerson extends IIDable,INambeable {
	String getSerame();
	void setSername(String name);
	
	String getPatronomic();
	void setPatronomic(String name);
	
	Date getDOB();
	void setDOB(Date dob);
	
}