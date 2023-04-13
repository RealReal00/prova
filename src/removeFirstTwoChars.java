public class removeFirstTwoChars {
    StringBuilder r = new StringBuilder();
    public String removeFirstTwoChars(String s){
        r.append(s);
        r.delete(0,2);
        return r.toString();
    }
    public void stampa(){
        System.out.println(r);
    }


}
