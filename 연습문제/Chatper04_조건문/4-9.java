package Main;
import java.util.*;


public class Main {	
	public static void main(String[] args) throws Exception {
		
		String str ="12345";
		int sum=0;
		
		for(int i =0;i<str.length();i++) {
			sum+=Character.getNumericValue(str.charAt(i));
		
		}
		System.out.println(sum);
	}
}
