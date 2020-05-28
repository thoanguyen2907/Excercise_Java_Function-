package Excercise;

public class InSoNguyenDuongLeChan {
	static final int NUMBER = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inLeDungWhileCach2();
		System.out.print("\n");
		inChanDungForCach2();
	}

	public static void inLeDungFor() {
		for (int i = 0; i < NUMBER; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void inChanDungFor() {
		for (int i = 0; i < NUMBER; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void inLeDungForCach2() {
		for (int i = 1; i < NUMBER; i += 2) {
			System.out.print(i + " ");
		}
	}

	public static void inChanDungForCach2() {
		for (int i = 0; i < NUMBER; i += 2) {
			System.out.print(i + " ");
		}
	}

	public static void inLeDungWhileCach2() {
		int i = 1;
		while (i < NUMBER) {
			System.out.print(i+" ");
			i += 2;
		}
	}
}
