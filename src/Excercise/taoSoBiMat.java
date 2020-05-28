package Excercise;
import java.util.Scanner;
public class taoSoBiMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		doanSo(scan); 
	}
	public static void doanSo (Scanner scan) {
		int soBiMat = (int) (Math.random() * 99 + 1); 
		int nhap; 
		do {
			System.out.println("Vui Long nhap vao 1 so "); 
			nhap = Integer.parseInt(scan.nextLine()); 
			if(nhap < soBiMat) {
				System.out.println("Vui long nhap vao so lon hon "); 
			}else {
				System.out.println("Vui long nhap vao be lon hon "); 
			}
		} while (soBiMat != nhap);	
		System.out.println("Xin Chuc mung, so bi mat la " + soBiMat); 
	}

}
