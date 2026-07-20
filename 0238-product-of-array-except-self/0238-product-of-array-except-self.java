class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] finalArr = new int[nums.length];
        int prefix = 1 , suffix = 1 ;
        


        // prefix array 
        for( int i = 0 ; i < nums.length ; i++){
            finalArr[i] = prefix;
            prefix*=nums[i];
        }

        //suffix * prefix 

        for( int i = nums.length-1 ; i >= 0 ; i-- ) 
        {
            finalArr[i] *= suffix;
            suffix*=nums[i]; 
        }

        return finalArr;
    }
}