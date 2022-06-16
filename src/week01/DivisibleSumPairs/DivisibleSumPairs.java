package week01.DivisibleSumPairs;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        int [] array = {1, 3, 2, 6, 1, 2};
        int n = 6;
        int k = 3;
        int count = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if((array[i]+array[j])%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
