
public class pairs {
    public static void pair(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(j>i){
                    System.out.print("("+nums[i]+","+nums[j]+")");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        pair(nums);
    }
}
