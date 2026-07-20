class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 , candidate = nums[0] , currNum;

        for (int i = 0 ; i < nums.length ; i++){
            currNum = nums[i];

             if(count == 0){
                candidate = currNum;
            }

            count += (currNum == candidate) ? 1 : -1;
            

        }
        return candidate;
    }
}