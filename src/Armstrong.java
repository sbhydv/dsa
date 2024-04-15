import java.util.*;

public class Armstrong{
    
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Input the both lower and upper range to find armstrong number inbetween : ");
        int a = in.nextInt();
        int b = in.nextInt();

        //counter for how many arms num are present
        int counter = 0;

        while(a <= b){

            //finding the size of the number
            int c = a;
            int len_a = 0; 
            while(c > 0 ){
                len_a++;
                c/=10;
            }
            
            int d= a;
            int arm=0;
            while(d>0){
                int rem = d%10;
                arm = arm + (int) Math.pow(rem,len_a);
                d/=10;
            }

            if(arm == a){
                counter++;
                System.out.println("the no. is : " + a);
            }
            a+=1;
        
        }
        if(a+1 > b && counter == 0){
        System.out.println("there is just  no arms num inbetween given range");
        }
    
 }

}
