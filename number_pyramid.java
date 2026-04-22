public class number_pyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>0;j--){
                if(j>=i){
                    System.out.print("  ");
                }
            }

            for(int j=0;j<5;j++){
                if(j<i){
                    System.out.print(" "+i+" ");
                }
                System.out.print(" ");
            }     
            System.out.println("");
        }
    }
}
