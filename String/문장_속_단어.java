package String;

import java.util.Scanner;

public class 문장_속_단어 {

    public String solution(String str){
        String answer=""; // 답 문자열 초기화함
        int m=Integer.MIN_VALUE, pos; // 문자 길이 비교하기 위한 정수를 최소값으로 초기화

        // #1. split()을 활용하기
//        String[] s=str.split(" "); // 문자 배열의 각 요소를 각 단어로 초기화
//        for(String x : s){
//            int len=x.length();
//            if(len>m){
//                m=len;
//                answer=x; // 단어의 길이가 최대이면 답에 저장함
//            }
//        }

        // #2. indexOf(), substring() 을 활용하기
        while((pos=str.indexOf(' ')) != -1){ // 문자열의 첫 공백문자의 인덱스로 pos를 초기화함, 문자열에 공백문자가 없을 때까지 반복함
            String tmp=str.substring(0,pos); // 임시 문자열에 문자열의 시작부터 공백문자 전까지를 저장함
            int len=tmp.length();
            if(len>m){
                m=len;
                answer=tmp; // 임지 문자열의 길이가 최대이면 답에 저장함
            }
            str=str.substring(pos+1); // 문자열에 공백문자의 다음 인덱스부터 끝까지 문자를 저장함
        }
        if(str.length()>m) answer=str; // 공백 문자가 없는 문자열, 즉, 마지막 단어를 비교함
        return answer;
    }

    public static void main(String[] args) {
        문장_속_단어 T = new 문장_속_단어();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();
        System.out.println(T.solution(str));
    }
}
