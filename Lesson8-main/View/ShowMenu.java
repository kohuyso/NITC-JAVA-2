package View;

import java.util.Scanner;

import Entity.Lecture;
import Entity.Student;
import Entity.Worker;
import Entity_Schedule.LichHoc;
import Entity_Schedule.LichTruc;
import Singelton.L_Student;
import Utils.CheckInput;
import Utils.Input;
import Utils.Output;

public class ShowMenu {
	static Scanner input = new Scanner(System.in);
	
	public static void Menu() {
		System.out.println("1. Nhập thông tin");
		System.out.println("2. Nhập lịch làm việc");
		System.out.println("3. Tìm thông tin");
		
		int x = CheckInput.readInt(input, 1, 4);
		while (x != 4) {
			if(x == 1) {
				Input.NhapInfor();
			}
			else if(x == 2) {
				Input.NhapLich();
			}
			else if (x == 3) {
				Output.XuatDL();
			}
			else if (x == 4) {
				break;
			}
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Nhập lịch làm việc");
			System.out.println("3. Tìm thông tin");
		}
		
	}
	
	public static void MenuPhu1 () {
		System.out.println("1.Nhập thông tin học sinh");
		System.out.println("2.Nhập thông tin giảng viên");
		System.out.println("3.Nhập thông tin nhân viên");
		
	}
	
	public static void MenuPhu2 () {
		System.out.println("1.Nhập lịch học");
		System.out.println("2.Nhập lịch trực");
		
		
	}
	

	
	
}
