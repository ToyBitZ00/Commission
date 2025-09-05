import java.text.DecimalFormat;
import java.util.Scanner;

public class Commission {
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		double sales;
		double commRate;
		int cRate;
		double result;

		DecimalFormat dc = new DecimalFormat("0.00");
		System.out.print("Enter total sales: ");
		sales = object.nextDouble();
		commRate = 0.07;
		cRate = 3;

		result = computeCommission(sales, commRate);
		System.out.println("Result 1: " + dc.format(result));

		result = computeCommission(sales);
		System.out.println("Result 2: " + result);

		result = computeCommission(sales, cRate);
		System.out.println("Result 3: " + result);
		object.close();
	}

	public static double computeCommission(double sales, double rate) {
		double cAmount;
		cAmount = sales * rate;
		return cAmount;
	}

	public static double computeCommission(double sales) {
		double commRate = 0.05;
		double cAmount;

		cAmount = sales * commRate;

		return cAmount;
	}

	public static double computeCommission(double sales, int cRate) {
		double cAmount;

		cAmount = (cRate / 100.0) * sales;

		return cAmount;
	}
}
