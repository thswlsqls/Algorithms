package String;

import java.util.Locale;
import java.util.Scanner;

public class 문자찾기 {
    public int solution(String str, char t){
        int answer = 0;
        str=str.toUpperCase(); // 대상 문자열을 대문자로 변환함
        t=Character.toUpperCase(t); // 검색 문자를 대문자로 변환함
//        System.out.println(str + "\n" + t);

        //#1. 인덱스를 활용하기
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)==t) answer++;
//        }

        //#2. 요소를 활용하기
        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        문자찾기 T = new 문자찾기();
        Scanner kb = new Scanner(System.in);

        String str=kb.next();
        char c=kb.next().charAt(0);

        System.out.println(T.solution(str, c));
    }
}
