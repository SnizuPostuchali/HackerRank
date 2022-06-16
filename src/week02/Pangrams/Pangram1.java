package week02.Pangrams;

public class Pangram1 {
    public static void main(String[] args) {
        String s = "          We promptly judged antique ivory buckles for the prize        ";
        s = s.toLowerCase().replaceAll(" ", "");
        boolean isPangram = true;

        for(char i='a'; i<='z'; i++){
            if(!s.contains(String.valueOf(i))){
                isPangram = false;
                break;
            }
        }
        if(isPangram){
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}
