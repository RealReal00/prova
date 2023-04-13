public class Reverse {
    String ris;
    int j=-1;
    StringBuilder stringBuilder = new StringBuilder();

    public String reverse(String s){
        for(int i=s.length()-1; i>=0; i--,j++){
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
    public void stampa(){
        System.out.println(stringBuilder.toString());
    }
}
