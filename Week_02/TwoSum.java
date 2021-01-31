package src.main.java.com.cdx.algorithm.algorithm;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}
