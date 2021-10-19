package Entity;


import Singelton.L_Worker;
import Enum.Gender;

public class Worker extends Infor{

	public Worker() {
		
	}
	private String gioiTinh;
	
	/**
	 * @return the gioiTinh
	 */
	public String getGioiTinh() {
		return gioiTinh;
	}

	public Worker(String name, int age, int id, String gioiTinh) {
		super(name, age, id);
		this.gioiTinh = gioiTinh;
	}
	
	
}
