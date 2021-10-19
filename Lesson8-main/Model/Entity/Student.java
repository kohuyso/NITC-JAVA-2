package Entity;

import Singelton.L_Student;
import Enum.Gender;
import Enum.Type;

public class Student extends Infor{
	public Student() {
		
	}
	private String type;
	private String gioiTinh;
	public Student(String name, int age, int id, String gioiTinh) {
		super(name, age, id);
		
		this.gioiTinh = gioiTinh;
	}
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	
	
}
