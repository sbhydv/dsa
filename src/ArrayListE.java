//import java.collections.*;
import java.util.*;
public class ArrayListE{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // right now outer list is empty, which means we have to create ref variable which whill point to the inner list.
        
        // initializing the outer list, which will contains the ref variable which will point to the inner list.
        for(int i = 0; i < 3 ; i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i<3 ; i++){
            for(int j = 0; j < 5; j++){
                list.get(i).add(in.nextInt());
            }

        }
        
        System.out.println(list);



    }

}
