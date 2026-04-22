public class solid_rhombus {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=4;j>=1;j--){
                if(i<j){
                    System.out.print(" ");
                }
            }
            for(int j=0;j<5;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
