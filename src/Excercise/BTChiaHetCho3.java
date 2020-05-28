package Excercise;
import java.util.Scanner;
public class BTChiaHetCho3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui Long nhap vao 1 so "); 
		int soN = Integer.parseInt(scan.nextLine()); 
		int count = ChiaHetCho3While(soN); 
		//int count  = ChiaHetCho3For(soN); 
		System.out.println("Tong so dem la : " + count);
	}
	public static int ChiaHetCho3While(int soN) {
		int count = 0; 
		int i = 0; 
		while (i <= soN) {
			if(i % 3 == 0) {
				count++;			
			}
			i++;
		}
		return  count;
	}
	public static int ChiaHetCho3For(int soN) {
		int count = 0; 	
		for (int i = 0; i < soN; i++) {
			if(i % 3 == 0) {
				count++; 
			}
		}
		return  count;
	}
}
