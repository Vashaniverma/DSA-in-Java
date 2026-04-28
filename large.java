public class large {
    public static int findlarger(int nums[]) {
        int larger=0;
        int small=0;
        for(int i=0;i<nums.length;i++){
            if(larger<nums[i]){
                larger=nums[i];
            }

            if(small>nums[i]){
                small=nums[i];
            }
        }
        System.out.println(small);
        return larger;
    }
    public static void main(String[] args) {
        int nums[]={1,2,6,3,5};
        int larger_num=findlarger(nums);
        System.out.println(larger_num);
    }
}
