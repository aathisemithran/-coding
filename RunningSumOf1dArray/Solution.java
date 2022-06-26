class Solution {
    public int[] runningSum(int[] nums) {
        int[] outputArr = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
        	outputArr[i] = 0;
        	for(int j=0; j<= i ; j++) {
        		outputArr[i] += nums[j]; 
        	}
        }
        /*Uncomment this to print and see results
        for(int k = 0; k< nums.length; k++) {
        	System.out.println(outputArr[k]);
        }*/
        return outputArr;
    }
}
