package org.college;

public class College {
private void collegeName() {
	// TODO Auto-generated method stub
System.out.println("College Name: ABC");
}
private void collegeCode() {
	// TODO Auto-generated method stub
System.out.println("Code: 4123");
}
private void collegeRank() {
	// TODO Auto-generated method stub
System.out.println("Rank: 1");
}
public static void main(String[] args) {
	College c = new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	Student s = new Student();
	s.studentNamet();
	s.studentDept();
	s.studentID();
	Hostel h =new Hostel();
	h.hostelName();
	Dept d = new Dept();
	d.deptName();
}
}
