import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test17 {

    public static void main(String[] args) {
        int a=57;
        int i=1;
        ArrayList<Integer>ar=new ArrayList<>();
        int count=0;
        while(i<a){
            if(a%i==0){
              
                
                ar.add(i);
               count++;
            }
        i++;
        
        }
        int k=count;
        Collections.sort(ar);
        int max=ar.get(k-1);
        System.out.println(max);
        }                   
        
    }

