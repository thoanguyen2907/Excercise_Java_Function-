package Excercise;

import java.util.Scanner;

public class BTVongLapFibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap 1 chu so ");
		int n = Integer.parseInt(scan.nextLine());
		inFibo(n); 
	}
	public static void inFibo(int n) {
		System.out.println(n + " chu so dau tien trong day fibonacci");
		for (int i = 0; i < n;i++) {
			int ai = fibonacci(i); 
			System.out.print(ai + "\t"); 
		}
	}
	public static int fibonacci(int n) {
	int kq; 
	int a0 = 0; 
	int a1 = 1; 
	int an = 1; 
	if(n < 0) {
		kq =  -1 ; 
	} else if(n ==0 || n == 1) {
		kq =  n; 
	} else {
		for (int i = 2; i<n; i++) {
			a0 = a1; 
			a1 = an; 
			an = a0 + a1; 
		}
		kq = an;
	}
	 
	return kq; 
	}

}
