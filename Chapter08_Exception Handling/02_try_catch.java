import java.util.*;
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException, Exception {
		 int number= 100;
		 int result=0;
		 
		 for(int i=0;i<10;i++) {
			 try {
				 result=number/(int)(Math.random()*10);
				 System.out.println(result);
			 }catch(ArithmeticException e) {
				 System.out.println("0");
			 }
		 }
		
	}
	
}
//0으로 나누는 ArithmeticException이 발생할경우 중간에서 예외처리를 해서 비정상 종료를 막아준다
