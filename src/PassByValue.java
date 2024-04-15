import java.util.*;

public class PassByValue{

    public static void main(String[] args){
        
        String name = "Kunal";
        System.out.println(name);
        change(name);
        System.out.println(name);

    }

    public static void change(String name2){

        System.out.println(name2);

        name2 = "Rahul";

        System.out.println(name2);
    }





}

    
