package Array;

import java.util.Scanner;

public class 피보나치_수열 {
    public int[] solution(int n){
        int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;
        // #1.
//        for(int i=2; i<n; i++) {
//            answer[i] = answer[i - 2] + answer[i - 1];
//        }

        // #2.
        int a=1, b=1, c;
        int idx = 0;
//        System.out.println(a + " " + b + " ");
        for(int i=2; i<n; i++){
            c=a+b;
//            System.out.println(c + " ");
            answer[i] = c;
            a=b;
            b=c;
        }
        return answer;
    }
    public static void main(String[] args) {
        피보나치_수열 T = new 피보나치_수열();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int x : T.solution(n)) System.out.println(x+" ");
    }
}
