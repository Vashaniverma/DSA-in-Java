public class diamond_pattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=n;j>0;j--){
                if(j>i){
                    System.out.print("  ");
                }
            }
            for(int j=1;j<=(n*2);j++){
                if(j<=((i+1)*2)-1){
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=j){
                    System.out.print("  ");
                }
            }
            for(int j=(n*2)-1;j>=1;j--){
                if(j>=(i*2)-1){
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}
