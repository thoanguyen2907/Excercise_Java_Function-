package Excercise;
import java.util.Scanner;
public class BaiTapWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = demLanThiLai(scan); 
		System.out.println("So Lan Thi Lai " + count); 
	}
	public static int demLanThiLai(Scanner scan) {
		int count = 0; //biến đếm 
		float diem = 2; // giá trị khởi gán 
		while(diem < 5) {
			System.out.println("Nhập điểm thi của bạn:  "); 
			diem = Float.parseFloat(scan.nextLine()); 
			if(diem < 5) {
				count++; 
			} else {
				System.out.println("Chúc mừng bạn đã thi đậu !!"); 
			}
		}
		return count; 
	
	}

}
