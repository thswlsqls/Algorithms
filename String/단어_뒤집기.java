package String;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer=new ArrayList<>();
//        for(String x : str){
//            String tmp=new StringBuilder(x).reverse().toString(); // 지원하는 메서드를 사용하기 위함
//            answer.add(tmp);
//        }

        // #2.
        for(String x : str){
            char[] s=x.toCharArray(); // 문자열 단어를 문자 배열로 만듬
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp=s[lt]; // lt번째 문자와 rt번째 문자를 교환함
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++; // lt는 오른쪽으로 1칸, rt는 왼쪽으로 1칸 이동함
                rt--;
            }
            String tmp=String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        단어_뒤집기 T = new 단어_뒤집기();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String[] str=new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
