package LEETCODE.Array;

import java.util.*;

public class ThreeNum {

    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> threeNum(int[] nums) {

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        set.add(list1);
                    }
                }
            }
        }
        List<List<Integer>> list2 = new ArrayList(set);

        return list2;
    }

}
