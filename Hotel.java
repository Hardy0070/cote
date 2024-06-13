package baekjoon;

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 번 조회하시겠습니까?");
        int T = sc.nextInt();
        sc.nextLine();

       while(T != 0) {

           System.out.println("H(층)값을 입력해주세요.");
           int H = sc.nextInt();
           sc.nextLine();
           System.out.println("W(방갯수)값을 입력해주세요.");
           int W = sc.nextInt();
           sc.nextLine();
           System.out.println("N(방번호)값을 입력해주세요.");
           int N = sc.nextInt();
           sc.nextLine();

           int[][] arr = new int[H][W];
           // {101, 102, 103, 104}
           // {201, 202, 203, 204}
           // {301, 302, 303, 304}

           int number = 1;

           for (int floor = 0; floor < arr.length; floor++) { // 방번호 붙이기
               number = number + 100;
               if (floor >= 1) {
                   number = number - W;
               }
               for (int rooms = 0; rooms < arr[floor].length; rooms++) {
                   arr[floor][rooms] = number++;
               }
           }


           // {101, 102, 103, 104} // 1 = [1][0]
           // {201, 202, 203, 204} // 2 = [2][0]
           // {301, 302, 303, 304} // 3 = [3][0]

           int[] roomNum = new int[H * W]; // 3

           int number2 = 0; // 열 값
           int number3 = 0; // 행 값

           for (int i = 0; i < roomNum.length; i++) { // 2차원 배열 담아주는 1차원 배열

               roomNum[i] = arr[number3][number2];
               number3++;

               if (number3 == H) {
                   number2++;
                   number3 = 0;
               }

//            System.out.println(roomNum[i]); // 열 순서대로 출력되는지 확인
           }

           System.out.println(roomNum[N - 1]);  // n번째 손님 방번호

           T--;
           System.out.println();
       }


    }
}
