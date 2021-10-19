package Utils;

import java.util.Scanner;

import javax.swing.text.Position;

import Entity.Infor;
import Entity.Lecture;
import Entity.Student;
import Entity.Worker;
import Entity_Schedule.LichHoc;
import Entity_Schedule.LichTruc;
import Enum.Gender;
import Enum.PhongHoc;
import Enum.Tiet;
import Enum.positionL;
import Singelton.L_Hoc;
import Singelton.L_Lecture;
import Singelton.L_Student;
import Singelton.L_Truc;
import Singelton.L_Worker;
import View.ShowMenu;

public class Input {
	static Scanner input = new Scanner (System.in);
	
	static public void NhapInfor() {
		ShowMenu.MenuPhu1();
		int choose2 = CheckInput.readInt(input, 1, 3);
		System.out.println("Nhập id: ");
		int id = CheckInput.readInt(input, 1, 10000);
		System.out.println("Nhập tên: ");
		String ten = CheckInput.readString(input);
		System.out.println("Nhập tuổi: ");
		int tuoi = CheckInput.readInt(input, 18, 100);
		System.out.println("Nhập giới tính:...(NU(1), NAM(2), KHAC(3))");
		int gt = CheckInput.readInt(input, 0, 2);
		Gender gender = Gender.gtOf(gt);
		if (choose2 == 1) {
			L_Student.addToList(new Student (ten, tuoi,id ,gender.gend));
		}
		else if (choose2 == 2) {
			L_Lecture.addToList(new Lecture (ten, tuoi, id, gender.gend));
		}
		else if (choose2 == 3) {
			L_Worker.addToList(new Worker (ten, tuoi, id, gender.gend));
		}
		
	}
	
	static public void NhapLich() {
		
		
		ShowMenu.MenuPhu2();
		int choose2 = CheckInput.readInt(input, 1, 2);
		if (choose2 == 1) {
			System.out.println("Nhập id: ");
			int id = CheckInput.readInt(input, 1, 10000);
			System.out.println("Nhập thời gian");
			System.out.println("6H45_7H45 (1), 8H_9H (2), 9H15_10H15 (3), 10H30_11H30 (4)");
			int tg = CheckInput.readInt(input, 1, 4);
			Tiet tiet = Tiet.tietOf(tg);
			System.out.println("Nhập phòng");
			System.out.println("A101(1), B205(2), C306(3), D407(4), E509(5)");
			int ph = CheckInput.readInt(input, 1, 5);
			PhongHoc phongHoc = PhongHoc.toaOf(ph);
			L_Hoc.addToList(new LichHoc (id, phongHoc.toa, tiet.tgian));
		}
		else if (choose2 == 2) {
			System.out.println("Nhập id: ");
			int id = CheckInput.readInt(input, 1, 10000);
			System.out.println("Nhập thời gian");
			System.out.println("6H45_7H45 (1), 8H_9H (2), 9H15_10H15 (3), 10H30_11H30 (4)");
			int tg = CheckInput.readInt(input, 1, 4);
			Tiet tiet = Tiet.tietOf(tg);
			System.out.println("Vị trí trực");
			System.out.println("A1(\"Tòa A1\", 1), A2(\"Tòa A2\", 2), B(\"Tòa B\", 3)");
			int toa = CheckInput.readInt(input, 1, 3);
			positionL poTruc = positionL.trucOf(toa);
			L_Truc.addToList(new LichTruc (id, poTruc.truc, tiet.tgian));
		}
		
	}
	
	
}
