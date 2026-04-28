//creating array
// import java.util.*;
public class app {

    public static void update(int marks[]){
        for(int i=0;i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {

        //int marks[] = new int[50]; // craate size if one time size will declared then it does not insert 51 data 

        // int numbers[]={1,2,3};
        // String fruits[]={"apply","mango","orange"};

        // int marks[]= new int[100];

        // Scanner sc = new Scanner(System.in);
        // System.out.println("length of array: "+marks.length);

        // marks[0]=sc.nextInt();//phy
        // marks[1]=sc.nextInt();//chem
        // marks[2]=sc.nextInt();//maths

        // System.out.println("phy: "+ marks[0]);
        // System.out.println("chem: "+ marks[1]);
        // System.out.println("math: "+ marks[2]);

        // marks[2]=100;
        // System.out.println("math: "+ marks[2]);

        int marks[] ={97,98,99};
        update(marks);

         for(int i=0;i<marks.length; i++){
            System.out.print(marks[i]+ " ");
        }
        //  sc.close();
    }
}
