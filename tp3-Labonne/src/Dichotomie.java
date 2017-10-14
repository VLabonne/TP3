import java.util.Arrays;

public class Dichotomie {
	public static void Dicho(int tab[], int x) {
		int n = tab.length - 1;
		int g = 0;
		int d = n;
		Arrays.sort(tab);
		
		while (g <= d) {
			int m = (g + d) / 2;
			if (tab[m] == x) {
				System.out.println("\nm= "+m);
			}
			if (tab[m] < x) {
				g = m + 1;
			} else {
				d = m - 1;
			}
		}
	}
}
