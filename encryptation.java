import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";
        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

char [] alpha = new char [26];

    for (int i = 0; i < alpha.length; i++)
    {
        alpha[i] = ALPHABET.charAt(i); 
}
    for (int j = 0; j < s.length(); j++) {
        char a = s.charAt(j);
        if (Character.isLetter(a) || a == ' ') {
            aCoder += a;
        }
    }
    for (int i = 0; i < aCoder.length(); i++) {
        char f = aCoder.charAt(i);
        if (Character.isLetter(f)) {
            int aide = ALPHABET.indexOf(aCoder.charAt(i));
            if (aide < 21) {
                char ajout = ALPHABET.charAt(aide + DECALAGE);
                chaineCodee = chaineCodee + ajout;
            } else {
                char ajout2 = ALPHABET.charAt(aide - 22);
                chaineCodee = chaineCodee + ajout2;
            }
        } else {
            chaineCodee = chaineCodee + " ";
        }
    }
    /*******************************************
     * Ne rien modifier apres cette ligne.
     *******************************************/
    System.out.format("La chaine initiale etait : '%s'\n", s);

    if (aCoder.isEmpty()) {
        System.out.println("La chaine a coder est vide.\n");
    } else {
        System.out.format("La chaine a coder est : '%s'\n", aCoder);
        System.out.format("La chaine codee est : '%s'\n", chaineCodee);
    }
}
}
