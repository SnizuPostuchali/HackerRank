package week02.LonelyInteger;

public class Test1 {
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 3, 2, 1, 6, 5, 6, 5};
//        List<Integer> list = new ArrayList<>();
//        for(int j=0; j<array.length; j++){
//            list.add(array[j]);
//        }
//        Iterator<Integer> iterator = list.iterator();
//
//        while(iterator.hasNext()){
//            System.out.print(iterator.next());
//            System.out.println(iterator.next());
//        }

        double a = 1;
        for(int i=1; i<=100; i++){
            a*=i;
        }
        System.out.println(String.valueOf(a));
        System.out.println(a%10);
        int count = 0;
        while(a%10<1){
            a/=10;
            count++;
        }
        System.out.println(count);
    }
}
