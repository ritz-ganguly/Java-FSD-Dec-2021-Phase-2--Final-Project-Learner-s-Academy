package mypack.entity;

public class Students {
private int studentId;
private String firstName;
private String lastName;
private int age;
private int classId;
private String className;
public Students() {
	
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getClassId() {
	return classId;
}
public void setClassId(int classId) {
	this.classId = classId;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
@Override
public String toString() {
	return "Students [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ ", classId=" + classId + ", className=" + className + "]";
}

}
