package sourcecode;

public class vodafone extends serviceProvider {
	public services createService(String s) {
		if(s.compareTo("mobile recharge")>=0) {
			return new mobileRecharge();
		}
		else if(s.compareTo("internet payment")>=0) {
			return new internetPayment();
		}
		else {
			return null;
		}
	}
}
