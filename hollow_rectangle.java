public class hollow_rectangle {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                if(j==0 || j==4 || i==0 || i==3){
                    System.err.print(" x");
                }
                else{
                    System.err.print("  ");
                }    
            }
            System.err.println();
        }
    }
}
