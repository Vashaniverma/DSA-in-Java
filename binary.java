public class binary {
    public static int binar(int nums[],int search){
        int start=0;
        int end=nums.length-1;;

        while(start<=end){
            int mid=(start+end)/2;
            if(search<nums[mid]){
                end=mid+1;
            }if(search>nums[mid]){
                start=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,12,14};
        int search=10;
        System.out.println("binary search : "+binar(nums,search));
    }
}
