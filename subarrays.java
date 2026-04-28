public class subarrays {
    public static void sub(int nums[]){
        for(int i=0;i<nums.length;i++){
            int star=i;
            for(int j=i;j<nums.length;j++){
                int end=j;
                for(int k=star; k<=end; k++){
                    System.out.print(nums[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
       
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        sub(nums);
    }
}
