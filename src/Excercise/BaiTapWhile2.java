package Excercise;
import java.util.Scanner;
public class BaiTapWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float tong = tinhTongKhongAmCach2(scan); 
		System.out.println(tong); 
		
		
	}
	//khong xai cờ hiệu 
	public static float tinhTongKhongAm(Scanner scan) {
		float tong = 0; //tạo biến tích luỹ ngoài vòng lặp 
		int nhap = 1; 
		while(nhap > 0) {
			System.out.println("hãy nhập vào số  >= 0. Nhập <=0  để dừng "); 
			nhap = Integer.parseInt(scan.nextLine()); 
			if(nhap > 0) {
				tong+= nhap; 
			}
		}
		return tong; 
	}
	public static float tinhTongKhongAmCach2 (Scanner scan) {
		float tong = 0;
		boolean flag = true; 
		while (flag) {
			 System.out.println("hãy nhập vào số  >= 0. Nhập <=0  để dừng ");
			int nhap = Integer.parseInt(scan.nextLine()); 
			if(nhap > 0) {
				tong += nhap; 
			} else {
				flag = false; 
			}
		}
		return tong; 
	}

}
