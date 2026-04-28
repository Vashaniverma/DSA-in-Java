public class reverse {
    public static void rev(int nums[]){
        int star=0;
        int end=nums.length-1;
        int temp;
        while (star<end) {
            temp=nums[star];
            nums[star]=nums[end];
            nums[end]=temp;
            star++;
            end--;

        }
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        rev(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        
    }
}
