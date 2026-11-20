class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Brute Force
        // int[] arr = new int[m+n];
        // for(int i=0; i<m; i++){
        //     arr[i]= nums1[i];
        // }
        // for(int i = 0; i<n; i++){
        //     arr[m+i] = nums2[i];
        // }
        // Arrays.sort(arr);
        // for(int i=0; i<m+n; i++){
        //     nums1[i] = arr[i];
        // }
        // Two pointer
        int[] result = new int[m+n]; 
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                result[k] = nums1[i];
                i++;
            }
            else{
                result[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            result[k] = nums1[i];
            i++;
            k++;
        }
        while(j<n){
            result[k]= nums2[j];
            j++;
            k++;
        }
        for(i=0; i<m+n; i++)
            nums1[i] = result[i];
    }
}