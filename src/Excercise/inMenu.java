package Excercise;

import java.util.Scanner;

public class inMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời nhập số a : ");
		float a = Float.parseFloat(scan.nextLine()); 
		System.out.println("Mời nhập số b : ");
		float b = Float.parseFloat(scan.nextLine()); 
		xuLyMenu(scan, a, b);
	}

	public static void taoMenu() {
		System.out.println("Chuong Trinh cac phep tinh don gian ");
		System.out.println("Moi Chon Theo Cac Chuc Nang ");
		System.out.println("1. TInh tong ");
		System.out.println("2. TInh hieu ");
		System.out.println("3. TInh tich ");
		System.out.println("4. TInh thuong ");
		System.out.println("0. Thoat");

	}

	public static void xuLyMenu(Scanner scan, float a, float b) {
		boolean flag = true;
		int chon;
		do {
			taoMenu();
			System.out.println("Moi Chon >> ");			
			chon = Integer.parseInt(scan.nextLine());
			System.out.println("Chon >> " + chon);	
			switch (chon) {
			case 1:
				float tong = a + b;
				System.out.println("Tong hai so a, b (" + a + ", " + b + ") : " + tong);
				break;
			case 2:
				float hieu = a - b;
				System.out.println("Hieu  hai so a, b (" + a + "," + b + ") : " + hieu);
				break;
			case 3:
				float tich = a * b;
				System.out.println("Tich  hai so a, b (" + a + "," + b + ") : " + tich);
				break;
			case 4:
				if (b == 0) {
					System.out.println("b phải là số khác 0");
				} else {
					float thuong = a / b;
					System.out.println("Thuong 2 so a, b (" +a + "," + b+ ") : "+ thuong);
				}
				break;
			case 0:
				flag = false;
				System.out.println("ban da thoat chuong trinh ");
				break;
			default:
				System.out.println("Vu long chon 0-4 ");
			}
		} while (flag);
	}

}
