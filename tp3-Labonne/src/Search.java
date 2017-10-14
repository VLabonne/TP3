
public class Search {
	public static void search(int[][] tab, int t) {
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] == t) {
					System.out.print("le nombre se trouve a la " + (i * (tab.length + 1) + j));
					break;
				}
			}
		}
	}

}
