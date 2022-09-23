class Solution {
    public int maxArea(int[] height) {
        //check all cases
        int max=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                max=Math.max(max,(j-i)*(Math.min(height[i],height[j])));
            }
        }
        return max;
    }
}
--------------------------------------------------------------------------
class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int max=0;
        while(low<high){
            max=Math.max(max,(high-low)*(Math.min(height[high],height[low])));
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}