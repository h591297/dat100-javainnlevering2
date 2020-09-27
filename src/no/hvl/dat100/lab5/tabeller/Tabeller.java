package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		String ut = "";
		
		for (int i=0; i<tabell.length; i++) {
			if (i < tabell.length-1) {
				ut += (tabell[i] + ",");
			}
			else {
				ut += (tabell[i]);
			}
		}
		System.out.println("(" + ut + ")");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String ut = "";
		
		for (int i=0; i<tabell.length; i++) {
			if (i < tabell.length-1) {
				ut += (tabell[i] + ",");
			}
			else {
				ut += (tabell[i]);
			}
		}
		return "[" + ut + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i=0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		for (int i=0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
					funnet = true;
			}
		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int index = -1;
		for (int i=0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
					index = i;
			}
		}
		return index;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] rev = new int[tabell.length];
		int countDown = tabell.length-1;
			for (int i=0; i < tabell.length; i++) {
				rev[i] = tabell[countDown];
				countDown--;
			}
		return rev;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		if (tabell.length > 1) {
			for (int i=0; i < tabell.length-1; i++) {
				if (tabell[i] < tabell[i+1]) {
					sortert = true;
				}
				else {
					sortert = false;
				}
			}
		}
	return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] combined = new int[tabell1.length + tabell2.length];
		for (int i=0; i < tabell1.length; i++) {
			combined[i] = tabell1[i];
		}
		for (int l=0; l < tabell2.length; l++) {
			combined[l+tabell1.length] = tabell2[l];
		}
	return combined;
			
	}
}
