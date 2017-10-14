import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int[] tab = generate(10);
		Dichotomie.Dicho(tab, 53);
		Tri.tri(tab);
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}

	}
	static public int[] generate(int size) {
		int[] tab = new int[size];
		Random rand = new Random();
		{
			for (int i = 0; i < tab.length; i++) {
				tab[i] = rand.nextInt(100);
			}
			for (int i = 0; i < tab.length; i++) {
				System.out.print(tab[i] + " ");
			}
		}
		return tab;
	}
}
