import java.util.ArrayList;
import java.util.Scanner;

public class 두_배열_합치기 {

    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        } // 두 배열의 원소를 순서대로 방문해 더 큰값을 answer 배열 요소로 저장함
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]); // 어느 한 배열의 순회가 끝났으면, 다른 배열의 나머지 요소를 answer 배열에 더함
        return answer;
    }

    public static void main(String[] args) {
        두_배열_합치기 T = new 두_배열_합치기();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=kb.nextInt();
        }
        int m=kb.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=kb.nextInt();
        }
        for(int x : T.solution(n, m, a, b)) {
            System.out.println(x+"");
        }
    }
}
