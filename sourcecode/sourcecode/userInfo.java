package sourcecode;


public class userInfo {
	private String email;
	private String password;
	private String username;
	private static int walletID;
	public userInfo(String e,String pw,String un){
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

	
	public void signup() {
		
		
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
