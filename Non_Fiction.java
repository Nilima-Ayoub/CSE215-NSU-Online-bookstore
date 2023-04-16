package correctassignment;
public class Non_Fiction implements  Genra {

private static double genraDiscount;
private String subGenra;
private final String GENRA="non-fiction";

public Non_Fiction(String subGenra) {
	this.genraDiscount = 0.1;
	this.subGenra = subGenra;
}

public double getGenraDiscount() {
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
	return "Non_Fiction [genraDiscount=10%, subGenra=" + subGenra + ", GENRA=" + GENRA + "]";
}
}



