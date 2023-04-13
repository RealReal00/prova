public class MoveZerosEnd {
   //static int[] output;

    /*public int[] moveZerosEnd(int[] v) {
        //output = new int[v.length];

        int i, j = 0;
        for (i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                v[j++] = v[i];
            }
        }
        // fills with remaining zeros
        for (; j < v.length; j++) {
            v[j] = 0;
        }
        return v;
    }*/
    int tmp;
    boolean ris;
    int j;
    int i;

    public int[] accodaZeri(int[] v) {
        //System.out.print(v[2]);

        for (i = 0; i < v.length; i++) {

            if (v[i] == 0 && i!=v.length-1) {
                if(v[i]==0 && v[i+1]==0){
                    continue;
                }
                checkzeri(v);
               // System.out.print(v[i]);

                if (!ris ) {
                    tmp = v[i + 1];

                    v[i + 1] = v[i];
                    v[i] = tmp;
                    i = 0;
                    //System.out.print("ok");
                }
                else{
                    //System.out.print("cazzo");
                    return v;
                }
            }
            //System.out.print(v[i]);


        }

        return v;
    }

    public void checkzeri(int[] v) {
        for (j = i; j < v.length; j++) {
           // System.out.print(v[j]);

            if (v[j] == 0) {
                ris = true;
               // System.out.print("true");
            } else {
                ris = false;
                //System.out.print("false");
                break;
            }
        }

    }

    public void stampa(int[] v) {
        System.out.print("Array = [");
        for (int i=0;i<v.length;i++){
            System.out.print(v[i]);
        }
        System.out.print(" ]");
    }
}
