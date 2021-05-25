class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int largest = 0;
        int k = 0;
        for (int i = 0; i < taille; i++) {
            int count = 1;
            for (int j = i + 1; j < taille; j++) {
                if (tab1[i] == tab1[j]) {
                    count++;
                }
            }
            if (count > largest) {
                k = tab1[i];
                largest = count;
            }
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(k+" ("+largest+" x)");
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
