package wetic.calcmanager.commun;

import java.util.Scanner;

public final class MyService {

	public static double encodeData(String msg) {
		double result;
		System.out.println(msg);
		Scanner sc = new Scanner(System.in);
		result = sc.nextInt();
		
		return result;
	}

	@Override
	public String toString() {
		return "MyService [toString()=" + super.toString() + "]";
	}
	
	
}
