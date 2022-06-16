package week02.MarsExploration;

public class SOS {
    public static void main(String[] args) {
        String  s = "SOSTOTSURSOSSOSNIT";
        String mes = "SOS";
        int count = 0;
        for(int i=0; i<s.length(); i+=mes.length()){
            if(s.substring(i, i+mes.length()).equals(mes)){
                continue;
            } else {
                for(int j=0; j<mes.length(); j++){
                    if(s.charAt(i+j)!=mes.charAt(j)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
