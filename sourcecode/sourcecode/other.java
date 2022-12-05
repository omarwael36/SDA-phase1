package sourcecode;

import java.util.Scanner;

public class other extends inputfields{
	public void createField(){
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		setOther(temp);
		scanner.close();
	}
}
