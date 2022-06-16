package week04.anagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//public class Anagram {
//    public static void main(String[] args) {
//        String s = "xaxbbbxx";
//        int minLetters1 = s.length() / 2;
//        int minLetters2 = minLetters1;
//
//        if (s.length() % 2 != 0) {
//            System.out.println("-1");
//        } else {
//            String subString1 = s.substring(0, s.length() / 2);
//            String subString2 = s.substring(s.length() / 2);
//
//            for (int i = 0; i < subString1.length(); i++) {
//                char abc = Character.forDigit(i, 10);
//                if (subString1.contains(s.substring(s.length() / 2).substring(i, i + 1))) {
//                    minLetters1--;
//                    subString1 = subString1.replace(s.substring(s.length() / 2).charAt(i), abc);
//                }
//                if (subString2.contains(s.substring(0, s.length() / 2).substring(i, i + 1))) {
//                    minLetters2--;
//                    subString2 = subString2.replace(s.substring(0, s.length() / 2).charAt(i), abc);
//                }
//            }
//
//            System.out.println(minLetters1);
//            System.out.println(minLetters2);
//        }
//    }
//}


public class Anagram {
    public static void main(String[] args) {
        String s = "xaxbbbxx";
        int minLetters = s.length()/2;


        if (s.length() % 2 != 0) {
            System.out.println("-1");
        } else {

            char [] ch1 = s.substring(0, s.length() / 2).toCharArray();
            Arrays.sort(ch1);
            char [] ch2 = s.substring(s.length() / 2).toCharArray();
            Arrays.sort(ch2);

            int i = 0, j = 0;
            while(i<ch1.length && j<ch1.length) {
                if(ch1[i]!=ch2[j]){
                    if(ch1[i]>ch2[j]){
                        j++;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                    j++;
                    minLetters--;
                }
            }
            System.out.println(minLetters);
        }
    }
}
