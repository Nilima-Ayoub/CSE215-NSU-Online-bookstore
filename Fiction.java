package correctassignment;
public class Fiction implements Genra {
    private static double genraDiscount;
	private String subGenra;
	private  final String GENRA="fiction";
	public  Fiction(String subGenra) {
		this.genraDiscount = 0.09;
		this.subGenra = subGenra;
	}
	
	public  double getGenraDiscount() {
		return genraDiscount;
	}
	public static void setGenraDiscount(double genraDiscount) {
		genraDiscount = genraDiscount;
	}
	public String getSubGenra() {
		return subGenra;
	}
	public void setSubGenra(String subGenra) {
		this.subGenra = subGenra;
	}
	
	@Override
	public String toString() {
		return "Fiction [genraDiscount= 9 % ,subGenra=" + subGenra + ", GENRA=" + GENRA + "]";
	}
}



