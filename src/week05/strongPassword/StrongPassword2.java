package week05.strongPassword;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password = "A8#+";

        int num = 1, spec = 1, low=1, cap=1, rest = 2;

        for(int i = 0; i<password.length(); i++){
            if(num!=0 && password.charAt(i)>='0' && password.charAt(i)<='9'){
                num--;
            } else if(low!=0 && password.charAt(i)>='a' && password.charAt(i)<='z'){
                low--;
            } else if(cap!=0 && password.charAt(i)>='A' && password.charAt(i)<='Z'){
                cap--;
            } else if(spec!=0 && password.substring(i,i+1).matches("[!@#$%^&*()+-]")){
                spec--;
            } else if(rest!=0){
                rest--;
            } else if(num==0 && cap==0 && spec==0 &&rest==0)
                break;
        }
        System.out.println(num+spec+low+cap+rest);
    }
}
