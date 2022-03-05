package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class 학급_회장 {

    public char solution(String s){
        char answer='a';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        System.out.println(map.containsKey('A'));
        System.out.println(map.containsKey('P'));
        System.out.println(map.size());
        System.out.println(map.remove('A'));
        System.out.println(map.size());
        return answer;
    }

    public static void main(String[] args) {

        학급_회장 T = new 학급_회장();
        Scanner kb = new Scanner(System.in);
//        int n=kb.nextInt();
        String str=kb.next();
        System.out.println("answer: "+T.solution(str));
    }
}
