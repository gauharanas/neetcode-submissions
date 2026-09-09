class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int [nums.length*2];
        for(int i=0,j=arr.length/2;i<nums.length;i++,j++){
            arr[i] = nums[i];
            arr[j]=nums[i];
        }
        return arr;
    }
}