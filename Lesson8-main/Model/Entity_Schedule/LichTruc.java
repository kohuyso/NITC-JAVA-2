package Entity_Schedule;

import Singelton.L_Truc;
import Enum.Tiet;
import Enum.positionL;

public class LichTruc extends LichChung {
	private String lhoc, thoc;

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
	public LichTruc () {	
	}
	public LichTruc(int id, String lhoc, String thoc) {
		super(id);
		this.lhoc = lhoc;
		this.thoc = thoc;
	}
	
	

}
