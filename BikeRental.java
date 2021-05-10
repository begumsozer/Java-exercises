import java.util.Scanner;

public class Velo {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Donnez l'heure de début de la location (un entier) : ");
		int debut = clavier.nextInt();
		System.out.print("Donnez l'heure de fin de la location (un entier) : ");
		int fin = clavier.nextInt();

		/*******************************************
		 * Completez le programme a partir d'ici.
		 *******************************************/

		double sommeTotale = 0;

		// conditions des horaires à respecter
		if ((debut < 0 || debut > 24) || (fin < 0 || fin > 24)) {
			System.out.println("Les heures doivent être comprises entre 0 et 24 !");
			System.exit(0);
		} else if (debut > fin) {
			System.out.println("Bizarre, le début de la location est après la fin...");
			System.exit(0);
		} else if (debut == fin) {
			System.out.println("Bizarre, vous n’avez pas loué votre vélo bien longtemps !");
			System.exit(0);
		} else {
			System.out.println("Vous avez loué votre vélo pendant");
		}

		// décomposition du prix
		if (fin < 7) {
			sommeTotale = (fin - debut) * 1;
			System.out.println(sommeTotale + " heure(s) au tarif horaire de 1.0 franc(s)");
		} else if ((fin >= 7 && fin < 17) && (debut < 7)) {
			sommeTotale = ((7 - debut) * 1) + (fin - 7) * 2;
			System.out.println((7 - debut) + " heure(s) au tarif horaire de 1.0 franc(s)");
			System.out.println((fin - 7) + " heure(s) au tarif horaire de 2.0 franc(s)");
		} else if ((fin >= 7 && fin < 17) && (debut >= 7)) {
			sommeTotale = (fin - debut) * 2;
			System.out.println((fin - debut) + " heure(s) au tarif horaire de 2.0 franc(s)");
		} else if (fin >= 17 && (debut < 7)) {
			sommeTotale = ((7 - debut) * 1) + ((17 - 7) * 2) + ((fin - 17) * 1);
			System.out.println(((7 - debut) + (fin - 17)) + " heure(s) au tarif horaire de 1.0 franc(s)");
			System.out.println((17 - 7) + " heure(s) au tarif horaire de 2.0 franc(s)");
		} else if (fin >= 17 && (debut >= 7 && debut < 17)) {
			sommeTotale = ((17 - debut) * 2) + ((fin - 17) * 1);
			System.out.println((fin - 17) + " heure(s) au tarif horaire de 1.0 franc(s)");
			System.out.println((17 - debut) + " heure(s) au tarif horaire de 2.0 franc(s)");
		} else if (fin >= 17 && debut >= 17) {
			sommeTotale = (fin - debut) * 1;
			System.out.println((fin - debut) + " heure(s) au tarif horaire de 1.0 franc(s)");
		}
		System.out.print("Le montant total à payer est de " + sommeTotale + " franc(s).\n");

		/*******************************************
		 * Ne rien modifier apres cette ligne.
		 *******************************************/
		clavier.close();
	}
}
