package sourcecode;
import java.io.File;  
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class user {
	private String email;
	private String password;
	private String username;
	private static int walletID;
	public user(String e,String pw,String un){
		this.email=e;
		this.password=pw;
		this.username = un;
	}
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	

	public int getWalletID() {
		return walletID;
	}

	
	public void signup() throws IOException {
		FileWriter obj = new FileWriter("usersInfo",true);
		Scanner scan = new Scanner(new File("usersInfo"));
		boolean flag = true;
        while(scan.hasNext()){
            String line = scan.nextLine().toLowerCase().toString();
            if(line.contains(this.getEmail()) || line.contains(this.getUsername())){
            	flag=false;
                System.out.println("the username or email that you enterd is taken!");
            }
        }
        scan.close();
        if(flag) {
        	obj.appendInfile
        }
		
	}
	public boolean login (String un,String pw) {
		if(this.getUsername()==un && this.getPassword()==pw ) {
			System.out.println("login successfully !");
			return true;
		}
		else {
			System.out.println("Error! you entered a wrong username or password");
			System.out.println("please try again!");
			return false;
		}
	}
	
}
