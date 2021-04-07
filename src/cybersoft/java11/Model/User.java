package cybersoft.java11.Model;

public class User {
	private String userName;
	private String passWord;
	private String name;
	private String age;
	
	public User() {
		userName="";
		passWord="";
		name="";
		age="";
	}
	
	public User(String userName, String passWord, String name, String age) {
		this.userName=userName;
		this.passWord=passWord;
		this.name=name;
		this.age=age;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age=age;
	}
	
}
