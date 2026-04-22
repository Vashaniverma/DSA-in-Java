public class palindromic_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=(n-1);j>=1;j--){
                if(j>=i){
                    System.out.print(" ");
                }               
            }
            int num=i;
            int num1=2;
            for(int j=1;j<(n*2);j++){
                if(j<=(i*2)-1){
                    if(num!=0){
                        System.out.print(num);
                        num--;
                    }
                    else{
                        System.out.print(num1);
                        num1++;
                    }
                }
             }
            System.out.println("");
        }
    }
}
