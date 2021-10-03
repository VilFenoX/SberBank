package EpizodeIV_PartII;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lesson3 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[20];
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
            arr[i] = Integer.parseInt(buff.readLine());
        for (int i = 0; i < 20; i++){
            if (i < 10){
                arr1[i] = arr[i];
            sum1 += arr1[1];
            }
            else{
                arr2[j] = arr[i];
                System.out.println(arr2[j]);
                j++;
                sum2 += arr1[1];
            }
        }
        if(sum1>sum2) {
            System.out.println(arr1);
        } else System.out.println(arr2);
    }
}
