class Solution {
    public int maxArea(int[] height) {
       int left = 0;
       int right = height.length-1;
       int max_water=0;
       while(left < right){
        int width= right - left;
        int max_height= Math.min(height[right],height[left]);
        int area=width * max_height;
        max_water=Math.max(max_water,area);
         if(height[left] < height[right]){
            left++;
            }
            else{
                right--;
                }
       } 
       return max_water;
    }
}