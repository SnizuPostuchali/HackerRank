package week02.MarsExploration;

public class SOS1 {
    public static void main(String[] args) {
        String  s = "SOSTOTSURSOSSOSNIT";

        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='S' && i%3!=1){
                count++;
            }
            if(s.charAt(i)!='O' && i%3==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
