package Excercise;
import java.util.Scanner;
public class tinhTongN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui Long Nhap 1 so N : ");
		int soN = Integer.parseInt(scan.nextLine()); 
//		int  tong = tinhTongSoN(soN);
		int  tong  = tinhTongSoNFor(soN); 
		System.out.print("Tong tu 1 den n là "+ tong); 
	}
	public static int tinhTongSoN(int soN) {
		int i = 0; 
		int sum = 0;	
		while (i <= soN) {
			if(i %2 ==0) {
				sum +=i;			
				i+= 2;			
			}
		}
		return sum; 

	}
	public static int tinhTongSoNFor(int soN) {
		int i = 0; 
		int sum = 0;	
		for (i = 0; i <= soN; i +=2) {
			sum += i; 
		}
			
		return sum; 
	} 

}
