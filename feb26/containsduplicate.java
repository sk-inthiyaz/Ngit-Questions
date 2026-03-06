import java.util.*;
public class containsduplicate {
    public static void main(String[] args) {
        System.out.println(Math.abs(-78));
    }
}
/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
Example 1:`
Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:
Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
*/

/*
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
0,1,2,3,4,5

*/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int j=0,i=0;
        while(j<nums.length){
            hm.put(nums[j],hm.getOrDefault(nums[j], 0)+1);
            if(Math.abs(i-j)<=k){
                if(nums[i]==nums[j]) return true;
            }
            else{
                i++;
            }
            j++;
        }
       
        return false;
    }
}
