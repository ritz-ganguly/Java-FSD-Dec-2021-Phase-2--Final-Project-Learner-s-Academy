package mypack.entity;

public class Teachers {
private int teacherId;
private String firstName;
private String lastName;
private int age;
public Teachers() {
	// TODO Auto-generated constructor stub
}
public int getTeacherId() {
	return teacherId;
}
public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
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
@Override
public String toString() {
	return "Teachers [teacherId=" + teacherId + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
			+ "]";
}

}
