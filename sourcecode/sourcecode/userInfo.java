package sourcecode;


public class userInfo {
	private String email;
	private String password;
	private String username;
	private float wallet_amount;
	public userInfo() {
		this.email = " ";
		this.password = " ";
		this.username = " ";
		this.wallet_amount = 0;
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
	public float getWallet_amount() {
		return wallet_amount;
	}
	public void setWallet_amount(float wallet_amount) {
		this.wallet_amount = wallet_amount;
	}
	

	
	
	
}
