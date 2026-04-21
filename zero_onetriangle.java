public class zero_onetriangle{
    public static void main(String[] args) {
        int k=1;
        int m=0;
        boolean num=true;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(j<=i){
                    if(num==true){
                    System.out.print(" "+k);
                    num=false;
                    }
                    else{
                    System.out.print(" "+m);
                    num=true;
                    } 
                }
                else{
                    System.out.print(" ");
                }       
            }
            if(i%2==0){
                num=false;
            }else{
                num=true;
            }
            System.out.println("");
        }
    }
}