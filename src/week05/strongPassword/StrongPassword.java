package week05.strongPassword;

import java.util.Arrays;

public class StrongPassword {
    public static void main(String[] args) {
        int n = 6;
        String password = "A98#+";

//        char[] ch = password.toCharArray();
//        Arrays.sort(ch);
//        password = new String(ch);
//        System.out.println(password);

        int lettersToAdd = 0;

        if(!password.matches("(.*)[0-9]+?(.*)")){
            lettersToAdd++;
        }
        System.out.println(lettersToAdd);
        if(!password.matches("(.*)([!@#$%^&*()+-]+?)(.*)")){
            lettersToAdd++;
        }
        System.out.println(lettersToAdd);
        if(!password.matches("(.*)[A-Z]+?(.*)")){
            lettersToAdd++;
        }
        System.out.println(lettersToAdd);
        if(!password.matches("(.*)([a-z])(.*)")){
            lettersToAdd++;
        }
        System.out.println(lettersToAdd);
        if(n>password.length()){
            if(lettersToAdd>n-password.length()){
                System.out.println(lettersToAdd);
            } else {
                lettersToAdd = n - password.length();
                System.out.println(lettersToAdd);
            }
        }
        System.out.println(lettersToAdd);

    }
}
