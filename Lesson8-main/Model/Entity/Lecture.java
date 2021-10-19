package Entity;

import Singelton.L_Worker;
import Enum.Gender;

public class Lecture extends Infor {

	public Lecture() {
		super();
	}
	String gt;
	public Lecture(String name, int age, int id, String gt) {
		super(name, age, id);
		this.gt = gt;
	}
	
	/**
	 * @return the gt
	 */
	public String getGt() {
		return gt;
	}


	

}
