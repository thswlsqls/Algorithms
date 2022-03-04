package Array;

import java.sql.Array;
import java.util.Scanner;

public class 격자판_최대합 {
    public int solution(int n, int[][] arr){
        int answer=Integer.MIN_VALUE;
        int sum1, sum2;
        for(int i=0; i<n; i++){
            sum1=sum2=0;
            for(int j=0; j<n; j++){
                sum1 = sum1 + arr[i][j]; // i행의 합을 저장함
                sum2 = sum2 + arr[j][i]; // i열의 합을 저장함
            }
            answer=Math.max(answer, sum1);
            answer=Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i]; // 우하향 대각선의 합을 저장함
            sum2+=arr[i][n-i-1]; // 우상향 대각선의 합을 저장함
        }
        answer=Math.max(answer, sum1);
        answer=Math.max(answer, sum2);
        return answer;
    }

    public static void main(String[] args) {
        격자판_최대합 T = new 격자판_최대합();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
