// 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0,j=0,i=0;
        int b[]=new int[m+n];

        while(k<m && j<n){
            if(nums1[k]<=nums2[j]){
                b[i]=nums1[k];
                k++;
            }
            else{
                b[i]=nums2[j];
                j++;
            }
            i++;
        }

        if(k==m){
            for(int s=j;s<n;s++){
                b[i]=nums2[s];
                i++;
            }
        }
        else if(j==n){
            for(int s=k;s<m;s++){
                b[i]=nums1[s];
                i++;
            }
        }

        for(i=0;i<b.length;i++){
            nums1[i]=b[i];
        }

        
        
    }
}
