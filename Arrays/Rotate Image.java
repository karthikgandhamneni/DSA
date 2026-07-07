48. Rotate Image

class Solution {
    static void reverse(int arr[]){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void transpose(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums[i].length;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
        
    }
}