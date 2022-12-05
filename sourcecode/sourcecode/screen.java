package sourcecode;

public class screen {
	public screen() {
		
	}
	public void showservices(services s) {
		for(int i =0;i<s.name.size();i++) {
			System.out.println(i +"- " +s.name.get(i));
		}
	}
	public void showDiscount(discount d) {
		for(int i = 0; i<d.dis.size();i++) {
			System.out.println( i + "- " + d.dis.get(i));
		}
	}
}
