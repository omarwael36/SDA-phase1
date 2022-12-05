package sourcecode;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		systeminfo info = new systeminfo();
		screen s = new screen();
		userscontroller u =new userscontroller();
		String email,username,password;
		int choice=0;
        System.out.println("1- signup");
        System.out.println("2- login");
        Scanner obj = new Scanner(System.in);
        while(true) {
        	choice = obj.nextInt();
        	if(choice == 1) {
            	System.out.println("Enter your email : ");
            	email = obj.nextLine();
            	System.out.println("Enter your username : ");
            	username = obj.nextLine();
            	System.out.println("Enter your password : ");
            	password = obj.nextLine();
            	u.signup(username, email, password);
            }
            else if(choice == 2) {
            	System.out.println("Enter your username : ");
            	username = obj.nextLine();
            	System.out.println("Enter your password : ");
            	password = obj.nextLine();
            	u.login(username, password);
            }
            else {
            	System.out.println("Enter a valid choice ");
            }
        s.showservices(info);
        }
        
    }
}
