package sourcecode;

import java.util.Scanner;

public class form extends handler {
	public void createField(){
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		setAmount(temp);
		scanner.close();
	}
}
