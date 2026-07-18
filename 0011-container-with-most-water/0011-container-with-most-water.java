class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int Maxarea = 0;
        while(left < right){
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

           
            Maxarea = Math.max(Maxarea, area);

            if(height[left] > height[right]){
                right--;
            } else{
                left++;
            }

        }
        return Maxarea;

        
    }
}