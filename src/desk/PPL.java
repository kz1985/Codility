package desk;

public class PPL {
	public static void main(String[] args) {
		int i = 19;
		for (int j = 0; j < 100; j++) {
			i += j;
		

			if (i > 3000) {
				System.out.println(i);
				break;
			}
		}
	}
}
