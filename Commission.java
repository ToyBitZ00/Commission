import java.text.DecimalFormat;

public class Commission {
	public static void main(String[] args) {
		double sales;
		double commRate;
		int cRate;
		double result;

		DecimalFormat dc = new DecimalFormat("0.00");
		sales = 15000.0;
		commRate = 0.07;
		cRate = 3;

		result = computeCommission(sales, commRate);
		System.out.println("Result 1: " + dc.format(result));

		result = computeCommission(sales);
		System.out.println("Result 2: " + result);

		result = computeCommission(sales, cRate);
		System.out.println("Result 3: " + result);
	}

	public static double computeCommission(double sales, double rate) {
		double cAmount;
		cAmount = sales * rate;
		return cAmount;
	}

	public static double computeCommission(double sales) {

	}

	public static double computeCommission(double sales, int cRate) {

	}
}
