package Enum;



public enum PhongHoc {
	A101 ("Ph�ng A101", 1),
	A202 ("Ph�ng A202", 2),
	A303 ("Ph�ng A303", 3);

	
	public final String toa;
	public int dd;
	private PhongHoc (String toa, int dd) {
		this.toa = toa;
		this.dd = dd;
	}
	
	public static PhongHoc toaOf (int dd) {
		for (PhongHoc e : values()) {
			if (e.dd == dd) {
				return e;
			}
		}
		return null;
	}
}
