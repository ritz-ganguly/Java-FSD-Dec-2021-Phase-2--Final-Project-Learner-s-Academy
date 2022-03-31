package mypack.entity;

public class Users {
private String emailId;
private String password;
private String type;
public Users() {
	
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Users [emailId=" + emailId + ", password=" + password + ", type=" + type + "]";
}


}
