package sourcecode;

public class landline extends serviceProvider{
	public services createService(String s) {
		if(s.compareTo("quarter reciept")>=0) {
			return new monthlyReciept();
		}
		else if(s.compareTo("monthly reciept")>=0) {
			return new quarterReciept();
		}
		else {
			return null;
		}
	}
}
