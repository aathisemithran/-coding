class Solution {
    public int minPartitions(String n) {
		int maxNumber = 0;
		int checkVal;
        for(int i=0; i<n.length(); i++) {
    		checkVal = Integer.parseUnsignedInt(n.charAt(i) + "");
        	if(checkVal > maxNumber) {
        		maxNumber = checkVal;
        	}
        }
		return maxNumber;
    }
}
