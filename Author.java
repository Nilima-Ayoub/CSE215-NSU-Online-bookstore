package correctassignment;

public class Author {
private String name;
private String emailid;
private String gender;
private int age;
public Author(String name, String emailid, int age, String gender) {
	this.name = name;
	this.emailid = emailid;
	this.age = age;
	this.gender = gender;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Information of Author [name=" + name + ", emailid=" + emailid + ", gender=" + gender + ", age=" + age + "]";
}
}

