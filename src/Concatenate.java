public class Concatenate {
    String output;
    public String concatenate(String[] input){
        output = new String();
        for(String str : input){
            output+=str;
        }
        System.out.println(output);
        return output;

    }
}
