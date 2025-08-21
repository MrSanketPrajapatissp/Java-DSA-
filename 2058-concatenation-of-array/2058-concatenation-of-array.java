class Solution {
    public int[] getConcatenation(int[] nums) {
      
        int size = nums.length * 2;
        int arr[] = new int[size];
        int len = nums.length;
        for(int i = 0, j=0; i<size; i++)
        {   
            if(i < nums.length)
            { 
                  arr[i] = nums[i];
            }else{
                arr[len++] = arr[j++];        
            }
            
        }
        return arr;
    }
}