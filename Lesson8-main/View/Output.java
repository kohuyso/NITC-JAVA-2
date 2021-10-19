package Utils;

import java.util.List;
import java.util.Scanner;

import Entity.Lecture;
import Entity.Student;
import Entity.Worker;
import Entity_Schedule.LichHoc;
import Entity_Schedule.LichTruc;
import Singelton.L_Hoc;
import Singelton.L_Lecture;
import Singelton.L_Student;
import Singelton.L_Truc;
import Singelton.L_Worker;

public class Output {
	static Scanner input = new Scanner(System.in);

	public static void XuatDL () {
		List <Student> hs = L_Student.getInstance();
		List <Lecture> gv = L_Lecture.getInstance();
		List <Worker> vn = L_Worker.getInstance();
		List <LichHoc> lh = L_Hoc.getInstance();
		List <LichTruc> lt = L_Truc.getInstance();
 		
		System.out.println("Nhập đối tượng cần xuất thông tin");
		System.out.println("1. Học sinh");
		System.out.println("2. Giảng viên");
		System.out.println("3. Nhân viên");
		int choose = CheckInput.readInt(input, 1, 3);
		System.out.println("Nhập ID: ");
		int id = CheckInput.readInt(input, 1, 100);
		
		if (choose == 1) {
			if (L_Student.getHS(id) != null) {
				System.out.println("Tên: " + L_Student.getHS(id).getName());
			}
			if (L_Hoc.getLHoc(id) != null) {
				System.out.println("Phòng: " + L_Hoc.getLHoc(id).getLhoc() + "Thời gian: " + L_Hoc.getLHoc(id).getThoc());
			}
		}
		else if (choose == 2) {
			if (L_Lecture.getGV(id) != null) {
				System.out.println("Tên: " + L_Lecture.getGV(id).getName());
			}
			if (L_Hoc.getLHoc(id) != null) {
				System.out.println("Phòng: " + L_Hoc.getLHoc(id).getLhoc() + "Thời gian: " + L_Hoc.getLHoc(id).getThoc());
			}
		}
		else {
			if (L_Worker.getwk(id) != null) {
				System.out.println("Tên: " + L_Worker.getwk(id).getName());
			}
			if (L_Truc.getTruc(id) != null) {
				System.out.println("Vị trí: " + L_Truc.getTruc(id).getLhoc() + "Thời gian: " + L_Truc.getTruc(id).getThoc());
			}
		}
	}
}
