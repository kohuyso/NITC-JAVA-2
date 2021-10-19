package HamMain;

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
import View.ShowMenu;

public class MainP {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		ShowMenu.Menu();
	}
}
