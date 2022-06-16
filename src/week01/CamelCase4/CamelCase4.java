package week01.CamelCase4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class CamelCase4 {

    public static String splitMethod(String text){
        int length = text.length();
        if(text.endsWith("()")){
            length = text.length()-2;
        }
        String loop1 = text.substring(0,1);
        for(int i = 1; i<length; i++){
            if(text.substring(i, i+1).equals(text.substring(i, i+1).toUpperCase())){
                loop1 = loop1 + " ";
            }
            loop1 = loop1 + text.charAt(i);
        }
        return loop1.toLowerCase();
    }

    public static String toMethod(String text){
        int length = text.length();
        String loop1 = text.substring(0,1).toLowerCase();
        for(int i = 1; i<length; i++){
            if(text.substring(i, i+1).equals(" ")){
                loop1 = loop1 + text.substring(i+1, i+2).toUpperCase();
                i++;
            } else {
                loop1 = loop1 + text.charAt(i);
            }
        }
        return loop1+"()";
    }

    public static String toVariable(String text){
        int length = text.length();
        if(text.endsWith("()")){
            length = text.length()-2;
        }
        String loop1 = text.substring(0,1).toLowerCase();
        for(int i = 1; i<length; i++){
            if(text.substring(i, i+1).equals(" ")){
                loop1 = loop1 + text.substring(i+1, i+2).toUpperCase();
                i++;
            } else {
                loop1 = loop1 + text.charAt(i);
            }
        }
        return loop1;
    }

    public static String toClass(String text){
        int length = text.length();
        if(text.endsWith("()")){
            length = text.length()-2;
        }
        String loop1 = text.substring(0,1).toUpperCase();
        for(int i = 1; i<length; i++){
            if(text.substring(i, i+1).equals(" ")){
                loop1 = loop1 + text.substring(i+1, i+2).toUpperCase();
                i++;
            } else {
                loop1 = loop1 + text.charAt(i);
            }
        }
        return loop1;
    }



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){
            String current = scan.nextLine();
            list.add(current);
        }

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String input = iter.next();
            String text = input.substring(4).trim();
            if(input.charAt(0) == 'C'){
                switch(input.charAt(2)){
                    case 'M':
                        System.out.println(toMethod(text));
                        break;
                    case 'C':
                        System.out.println(toClass(text));
                        break;
                    case 'V':
                        System.out.println(toVariable(text));
                        break;
                }
            } else {
                System.out.println(splitMethod(text));
            }
        }
        scan.close();
    }
}
