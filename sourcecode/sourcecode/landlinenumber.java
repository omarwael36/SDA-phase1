package sourcecode;

import java.util.Scanner;

public class landlinenumber extends inputfields {
	public void createField(){
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		setLandline_number(temp);
		scanner.close();
	}
}
