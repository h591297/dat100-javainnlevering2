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
		int skaler[][] = new int[matrise.length][matrise[0].length]; 
		for (int i = 0; i < matrise.length; i++) {
			for (int l = 0; l < matrise[i].length; l++) {
				skaler[i][l] = tall * matrise[i][l];
			}
		}
	return skaler;
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
	// e)
	public static int[][] speile(int[][] matrise) {
		int speila[][] = new int[matrise.length][matrise[0].length]; 
		for (int i = 0; i < matrise.length; i++) {
			for (int l = 0; l < matrise[i].length; l++) {
				 speila[l][i] = matrise[i][l]; 
			}
		}
	return speila;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int multiplisert[][] = new int[a.length][a[0].length];
		for (int treig=0; treig < a.length; treig++ ) {
			for (int rask=0; rask < a.length; rask++) {
				for (int raskast=0; raskast < a.length; raskast++)
				multiplisert[treig][rask] += (a[treig][raskast] * b[raskast][rask]);
			}
		}
		return multiplisert;
	}
	
}
