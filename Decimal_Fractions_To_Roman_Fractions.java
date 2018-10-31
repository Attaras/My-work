
public class Decimal_Fractions_To_Roman_Fractions {
	static double Fint = 0;

	public static void main(String[] args) {
		double y = 0.141592653589793238462643383279502884197169399375105820974944592307816406286 ;
		int e = 0;

		dividing(y);
		System.out.println("\n");

	}

	private static void dividing(double y) {
		for (int i = 1; i < 100; i++) {
			Calculation(y, i);
			y = Fractal.Fint;
		}
		
	}

	public static void Calculation(double y, int i) {

		double multiplier = (1 / (Math.pow(12, i)));

		double Result = y / multiplier;
		Fractal.Fint = ( Result - (int) Result ) * multiplier;
		int D = (int) Result;
		//System.out.print("D = " + D + "     ,   ");


			Roman(D);
		
	}

	private static void Roman(int D) {
		if (D == 0) {
			System.out.print("0");
		}
		if (D > 0 && D < 6) {
			for (int i = 0; i < D; i++) {
				System.out.print("�");
			}
			System.out.print("");
		}
		else if (D == 6) {
			System.out.print("S");
		}
		else if (D > 6) {
			System.out.print("S");
			for (int i = 0; i < (D - 6); i++) {
				System.out.print("�");
			}
		}
		System.out.print(",");
	}
}
