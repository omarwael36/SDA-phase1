package sourcecode;

import java.util.ArrayList;
public class userscontroller {
	public ArrayList<userInfo> u =new ArrayList<userInfo>();
	
	public userscontroller() {
		
	}
	public boolean signup(String un , String e ,String pw) {
		for(int i = 0; i<u.size(); i++) {
			if(u.get(i).getUsername()==un || u.get(i).getEmail()==e) {
				System.out.println("the email or username you entered is taken !!");
				return false;
			}
		}
		userInfo temp = new userInfo();
		temp.setEmail(e);
		temp.setPassword(pw);
		temp.setUsername(un);
		u.add(temp);
		System.out.println("you are signed up successfully !!");
		return true;
	}
	public boolean login(String un , String pw) {
		for(int i = 0; i<u.size(); i++) {
			if(u.get(i).getUsername()==un && u.get(i).getPassword()==pw) {
				System.out.println("you are logged in successfully !!");
				return true;
			}
		}
		System.out.println("the username or password you entered is wrong");
		return false;
	}
	public boolean searchService(services s, String key) {
		boolean flag = false;
		for(int i =0;i<s.name.size();i++) {
			if(s.name.get(i).compareTo(key)>=0) {
				System.out.println(s.name.get(i));
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Not found !");
		}
		return flag;
	}
}
