class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int j = 0; j<nums.length; j++) {
            int left = target - nums[j];
            if(map.containsKey(left)) {
                return new int[]{map.get(left), j};
            } else {
                map.put(nums[j], j);
            }
        }
        return new int[]{};
        // int left = 0;
        // int right = nums.length - 1;
        // int[] sortedNums = nums.clone();
        // java.util.Arrays.sort(sortedNums);
        
        // while(left < right) {
        //     int sum = sortedNums[left] + sortedNums[right];
        //     System.out.println(sum + " target check " + (sum < target));
        //     if(sum == target) {
        //         System.out.println("Inside target");
        //         return new int[]{nums[sortedNums[left]], nums[sortedNums[right]]};
        //     } else if(sum < target) {
        //         left++;
        //     } else {
        //         right--;
        //     }
        // }
        // return new int[]{};
        
    }
}
