package cybersoft.java11.controller;

import java.util.LinkedList;
import java.util.List;

import cybersoft.java11.Model.User;

public class AuthController {
	private static List<User> userList=new LinkedList<User>();;
	
	public AuthController() {
		userList.add(new User("admin", "admin", "admin1", "20"));
		userList.add(new User("abc", "def", "abc1", "20"));
	}
	
	public static boolean login(String userName, String passWord) {
		boolean result=false;
//		System.out.println(userName);
		for(User user: userList) {
			if(user.getUserName().equalsIgnoreCase(userName)) {
				return user.getPassWord().equals(passWord);
			}
		}
		return result;
	}
	
	public static boolean register(String userName, String passWord, String name, String age) {
		boolean result=true;
		
		//register code
		for(User user: userList) {
			System.out.println(user.getUserName());
			if(userName.equalsIgnoreCase(user.getUserName())) {
				System.out.println(userName);
				result=false;
			}
		} 
		if(result==true) {
			userList.add(new User(userName, passWord, name, age));
			return true;
		} else 
			return false;
	}
}
