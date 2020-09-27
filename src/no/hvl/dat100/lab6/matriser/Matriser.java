package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int l = 0; l < matrise[i].length; l++) {
				System.out.print(matrise[i][l] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String ut = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int l = 0; l < matrise[i].length; l++) {
				ut += (matrise[i][l] + " ");
			}
			ut += ("\n");
		}
	return ut;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {
			for (int l = 0; l < matrise[i].length; l++) {
				matrise[i][l] *= tall;
			}
		}
	return matrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		Boolean lik = false;
		
		for (int i = 0; i < a.length; i++) {
			for (int l = 0; l < a[i].length; l++) {
				if (a[i][l] == b[i][l]) {
					lik = true;
				}
			}
		}
	return lik;
	}

//valgfritt resten
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
