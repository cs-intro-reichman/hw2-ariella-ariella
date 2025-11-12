// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		for (int seed = 1; seed <= N; seed++){
			int sequenceValue = seed;
			int numOfSteps = 1;
			do{
				if (args[1].equals("v")) {
					System.out.print(sequenceValue + " ");
				}
				numOfSteps++;
				if (sequenceValue % 2 == 0) {
					sequenceValue /= 2;
				} else {
					sequenceValue = (sequenceValue * 3) + 1;
				}
			} while (sequenceValue != 1);
			if (args[1].equals("v")) {
				System.out.println("1 (" + numOfSteps + ")");
			}
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
