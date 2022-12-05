package sourcecode;

import java.util.Scanner;

public class amount extends inputfields {
	public void createField(){
		Scanner scanner = new Scanner(System.in);
		double temp = scanner.nextDouble();
		setAmount(temp);
		scanner.close();
	}
}
