
public class Tableau {

	public static void main(String[] args) {
		int[][] tab = new int[3][4];
		int Moy = 0;
		int k = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				tab[i][j] = (int) (Math.random() * 100);
				System.out.print(tab[i][j] + "  ");
				k++;
				Moy = (Moy + tab[i][j]);
			}
		}
		Moy = Moy / k;
		System.out.println("La moyenne est " + Moy);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (tab[i][j] == Moy) {
					System.out.print("L'indice est " + (i * 4 + j));
					break;
				}
			}
		}	
		search(tab, 50);
	}

	public static void search(int[][] tab, int t) {
		for (int k = 0; k < tab.length; k++) {
			for (int l = 0; l < tab[k].length; l++) {
				if (tab[k][l] == t) {
					System.out.print("le nombre se trouve a la position " + (k * (tab.length + 1) + l));
					// System.out.println("/"+k +""+ l);
					break;
				}
			}
		}
	}

}
