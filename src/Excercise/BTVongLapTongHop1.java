package Excercise;

import java.util.Scanner;

public class BTVongLapTongHop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap 1 chu so ");
		System.out.println(584%10);
		int n = Integer.parseInt(scan.nextLine());
		xuLySo(n); 
	}

	public static void xuLySo(int n) {
		int soBanDau = n; // tạo bản sao của n để xử lý
		int soDangTach;
		int tongCacSo = 0;
		int dem = 0;
		do {
			soDangTach = soBanDau % 10;
			dem++;
			tongCacSo += soDangTach;
			soBanDau /= 10;
		} while (soBanDau != 0);
		System.out.println("So " + n + "co " + dem + "chu so ");
		System.out.println("Chu so cuoi cung " + n % 10);
		System.out.println("Chu so hang dau tien : " + soDangTach);
		System.out.println("Tong cac chu so  " + tongCacSo);
		System.out.println("So dao nuoc cua n = " + n + "là : ");
		// loại bỏ các số 0 ;
		while (n % 10 == 0) {
			n /= 10;
		}
		do {
			System.out.println("" + n %10); 
			n/=10; 
		}while (n!=0);
	}

}
