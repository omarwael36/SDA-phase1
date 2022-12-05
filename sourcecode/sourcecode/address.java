package sourcecode;

import java.util.Scanner;

public class address extends inputfields {
	public void createField(){
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		setAddress(temp);
		scanner.close();
	}
}
