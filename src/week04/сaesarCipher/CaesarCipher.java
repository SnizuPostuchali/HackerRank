package week04.сaesarCipher;

import java.util.Locale;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "1X7T4VrCs23k4vv08D6yQ3S19G4rVP188M9ahuxB6j1tMGZs1m10ey7eUj62WV2exLT4C83zl7Q80M";
                  //1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N
        int k = 27;
        k%=26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String result = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.toLowerCase().charAt(i);

            if(ch>='a' && ch<='z'){
                int index = alphabet.indexOf(ch);
                if(index+k>25){
                    ch = (char) (s.charAt(i) - 26 + k);
                } else {
                    ch = (char) (s.charAt(i) + k);
                }
            }
            result+=ch;
            }
        System.out.println(result);
        System.out.println("1Y7U4WsDt23l4ww08E6zR3T19H4sWQ188N9bivyC6k1uNHAt1n10fz7fVk62XW2fyMU4D83am7R80N");
    }
}
