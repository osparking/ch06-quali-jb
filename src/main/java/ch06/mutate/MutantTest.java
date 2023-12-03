package ch06.mutate;

public class MutantTest {
	public static void main(String[] args) {
		System.out.println(changeBeta(true));
	}

	private static int changeBeta(boolean a) {
		int b = 0;
		
		if (!a) {
			b = 1;
		} else {
			b = 2;
		}
		
		return b;
	}
}
