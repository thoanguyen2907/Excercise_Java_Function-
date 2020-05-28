package Excercise;

import java.util.Scanner;

public class BTTOngLap1Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long nhap 1 chu so ");
		int n = Integer.parseInt(scan.nextLine());
		xuLySo(n); 
	}
	public static void xuLySo(int soN) {
		int soBanDau = soN;
		int tong = 0; 
		int count = 0;
		int soDangTach; 
		do {
			soDangTach = soBanDau %10;
			count ++; 
			tong += soDangTach; 
			soBanDau = soBanDau/10; 
		} while(soBanDau != 0); 
		System.out.println("Chu so cuoi cung la : "+ (soN %10)); 
		System.out.println("Chu so dau tien la : "+ soDangTach);
		System.out.println("Co " + count + " chu so trong day so " ); 	
		System.out.println("Tong cua day so la " + tong);
		}

}
