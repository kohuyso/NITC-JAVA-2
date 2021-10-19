package Enum;



public enum positionL {
	A1("T�a A1", 1), A2("T�a A2", 2), B("T�a B", 3);

	public final String truc;
	public int dd;

	private positionL(String truc, int dd) {
		this.truc = truc;
		this.dd = dd;
	}

	public static positionL trucOf(int dd) {
		for (positionL e : values()) {
			if (e.dd == dd) {
				return e;
			}
		}
		return null;
	}
}
