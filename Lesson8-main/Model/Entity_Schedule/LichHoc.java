package Entity_Schedule;

import Singelton.L_Hoc;
import Enum.Tiet;
import Enum.PhongHoc;

public class LichHoc extends LichChung {
	
	public LichHoc ( ) {
		super();
	}
	private String lhoc, thoc;
	
	public LichHoc(int id, String lhoc, String thoc) {
		super(id);
		this.lhoc = lhoc;
		this.thoc = thoc;
	}
	
	/**
	 * @return the lhoc
	 */
	public String getLhoc() {
		return lhoc;
	}

	/**
	 * @return the thoc
	 */
	public String getThoc() {
		return thoc;
	}

	
	
	
	
	
}
