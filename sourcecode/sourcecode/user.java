package sourcecode;

public class user {
	private String email;
	private String password;
	private String username;
	private static int walletID;
	
	public user(){
		
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getWalletID() {
		return walletID;
	}

	public void setWalletID(int walletID) {
		this.walletID = walletID;
	}
	public void signup(String e,String pw, String un) {
		this.setEmail(e);
		this.setPassword(pw);
		this.setUsername(un);
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
