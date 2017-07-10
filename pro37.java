# ghb
import java.io.*;
import java.util.*;

public class pro37{
 
        public static void main(String[] args) {
               
               
                int lim = 100;
               
                System.out.println("Prime numbers between 1 and " + lim);
               
             
                for(int j=1; j < 100; j++){
                       
                        boolean isPrime = true;
                       
                     
                        for(int i=2; i < j ; i++){
                               
                                if(j % i == 0){
                                        isPrime = false;
                                        break;
                                }
                        }
                      
                        if(isPrime)
                                System.out.print(j + " ");
                }
        }
}
