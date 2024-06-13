package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class arraysort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("배열길이 정하기");
        int arrayNum = sc.nextInt();
//        sc.nextLine();

        int[] array = new int[arrayNum];

        for(int i = 0; i < array.length; i++) {
//            System.out.println("정수 입력ㄱ");
            array[i] = sc.nextInt();
//            sc.nextLine();
        }

        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for(int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }
}
