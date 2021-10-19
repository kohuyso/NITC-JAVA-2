package Utils;

import java.util.Scanner;

public class CheckInput {
	static Scanner input = new Scanner(System.in);

	public static int readInt(Scanner input, int min, int max) {
		while (true) {
			try {
				int a = Integer.parseInt(input.nextLine());
				if (a < min || a > max) {
					System.out.println("Số cần nhập phải >= " + min + " và <= " + max);
					System.out.println("Nhập lại ");
				} else
					return a;
			} catch (NumberFormatException ex) {
				System.out.println("Lỗi NumberFormatException");
				System.out.println("Nhập lại");
			}
		}
	}

	public static String readString(Scanner input) {
		while (true) {
			try {
				while (true) {
					String s = input.nextLine();
					int check = 1;
					for (int i = 0; i < s.length(); i++) {
						if ((s.charAt(i) - 0 >= 97 && s.charAt(i) - 0 <= 122)
								|| (s.charAt(i) - 0 >= 65 && s.charAt(i) - 0 <= 90))
							continue;
						else {
							System.out.println("Tên không được chứa ký tự đặc biệt");
							System.out.println("Nhập lại: ");
							check = 0;
							break;
						}
					}
					if (check == 1 && s != null && !s.isEmpty())
						return s;
				}
			} catch (Exception ex) {
				System.out.println("Lỗi");
				System.out.println("Nhập lại: ");
			}
		}
	}
}
