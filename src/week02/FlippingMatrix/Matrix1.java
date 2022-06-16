package week02.FlippingMatrix;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] array = {{112, 42, 83, 119}, {56, 125, 56, 49}, {15, 78, 101, 43}, {62, 98, 114, 108}};
        int[][] array1 = array;
        int n = array.length / 2;
        int sum = 0;
        for (int i = 0; i < 2 * n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] < array[i][2 * n - 1 - j]) {
                    array1[i][j] = array[i][2 * n - 1 - j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] < array[2 * n - 1 - i][j]) {
                    array1[i][j] = array[2 * n - 1 - i][j];
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array1[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += array1[i][j];
            }
        }
        System.out.println(sum);
    }
}


//        for(int i=0; i< array.length; i++){
//            for (int j=0; j<array[i].length; j++){
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }

