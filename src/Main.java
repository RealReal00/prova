import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int[]v={0,3,0,7,4,0,1};
    static String[] input = {"ciao","come","va","?"};
    static String strings = "headmistressship";


    public static void main(String []args){
        int j=0;
        ArrayList<String> l = new ArrayList<>(Arrays.asList("Riccardo","Alessio","Marta"));

        Collections.reverse(l);
        System.out.println(l);
        for(String s : l){
            for(int i = 0; i<s.length();i++){
                int c = s.charAt(i);

            }
        }
       // BubbleSort bubbleSort = new BubbleSort();
        //MoveZerosEnd moveZerosEnd = new MoveZerosEnd();
        //Concatenate concatenate = new Concatenate();
        //concatenate.concatenate(input);
        //bubbleSort.bubbleSort(v);
        //moveZerosEnd.accodaZeri(v);
        //moveZerosEnd.stampa(v);
        //Reverse reverse = new Reverse();
        //reverse.reverse(strings);
        //reverse.stampa();
        //removeFirstTwoChars removeFirstTwoChars = new removeFirstTwoChars();
        //removeFirstTwoChars.removeFirstTwoChars(strings);
        //removeFirstTwoChars.stampa();
       // removeFirstTwoCharsIf removeFirstTwoCharsIf = new removeFirstTwoCharsIf();
        //removeFirstTwoCharsIf.removeFirstTwoCharsIf(strings);
        //duplicateChars duplicateChars = new duplicateChars();
        //duplicateChars.duplicateChars(strings);

       /* Parameters parameters = new Parameters();
        parameters.main();
        Parameters p1 = new Parameters(){
           public void stampa() {
               System.out.println("prova");
           }
        };*/

        /*String s1= new String("ciao");
        String s2 = new String("ciao");
        if(s1.equals(s2)) {
            System.out.println("ok");
        }*/
        //Parameters.process(p1);


    }
}
