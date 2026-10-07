public class Ejercicio10 {
    public static void main(String[] args) {

        final char[] LETTERS={'A','B','C','D','A','E','F','G','H','I','J','A','C','Z','Z','L','M','N','O','P'};
        int counter;
        int moda=0;
        int freg=0;

    for (int i =0; i < LETTERS.length; i++){
        counter=0;
            for (int c =0; c< LETTERS.length; c++ ){
                if (LETTERS[i]== LETTERS[c]){
                    counter+=1;
                }
            }
            if (counter > freg) {
                moda = i;
                freg=counter;
            }
        }
        System.out.println("The first index:  "+LETTERS[moda] + "  are replay "+ freg);

    }
}
