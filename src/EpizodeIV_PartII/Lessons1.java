package EpizodeIV_PartII;

import java.io.IOException;
import java.util.Scanner;

public class Lessons1 {
    public static void main(String[] args) throws Exception {
        int[] array = initArr();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initArr() throws IOException {
       int array[] = new int[20];
        Scanner scanner = new Scanner(System.in);
       for(int i = 0; i<20;i++){
           array[i] = scanner.nextInt();
       }// создайте и заполните массив
        return array;
    }

    public static int max(int[] array) {
        int max=0;
        for (int x:array){
            if (x>max){
                max = x;
            }
        }// найдите максимальное значение
        return 0;
    }
}
