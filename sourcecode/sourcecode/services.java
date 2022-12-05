package sourcecode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public abstract class services {
	int index ;
	public double amount;
	public ArrayList<serviceProvider> sp = new ArrayList<serviceProvider>();
	
	abstract public double cost(int n , int i);
	public void update(userInfo u) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();
		transactions temp = new transactions();
		temp.setAmount(amount);
		temp.setSource(u.getUsername());
		temp.setSp(sp.get(index));
		temp.setT(dtf.format(now));
		u.usertransaction.add(temp);
	}
}
