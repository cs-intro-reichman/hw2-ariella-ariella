// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		double sum = 0.0;
		double denominator = 1.0;
	    for (int termIndex = 0; termIndex < Integer.parseInt(args[0]); termIndex++) {
			if (termIndex % 2 == 0) {
				sum += (1.0/denominator);
			} else {
				sum -= (1.0/denominator);
			}
			denominator += 2;
		}
		System.out.println("pi according to Java: " + Math.PI); 
		System.out.println("pi, approximated:     " + (4 * sum));
	}
}
