
import java.util.Arrays;

public class Test001 {
    public static void main(String[] args) {
        String password = "#+89A";

        int lettersToAdd=0;
        if(!password.matches("(.*)([abcdefghijklmnopqrstuvwxyz])")){
            lettersToAdd++;
        }
        System.out.println(lettersToAdd);

    }
}

