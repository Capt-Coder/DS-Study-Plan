class Solution {
    public static void main(String[] args){
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(intersect(nums1,nums2));
    }
  
    public int[] intersect(int[] nums1, int[] nums2) {
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    nums2[j]=-11;
                    nums1[k]=nums1[i];
                    k++;
                    break;
                }
            }
        }
        int [] list=new int[k];
        System.arraycopy(nums1,0,list,0,k);
        return list;
    }
}
