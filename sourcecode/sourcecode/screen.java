package sourcecode;

public class screen {
	public screen() {
		
	}
	public void showservices(systeminfo s) {
		for(int i =0;i<s.servicesname.size();i++) {
			System.out.println(i +"- " +s.servicesname.get(i));
		}
	}
	public void showDiscount(systeminfo d) {
		for(int i = 0; i<d.dis.size();i++) {
			System.out.println( i + "- " + d.dis.get(i));
		}
	}
}
