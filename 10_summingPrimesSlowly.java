import java.util.*;
public class javaCup{

    public static boolean isPrime(int l){
        boolean prime = true;
        for(int i=((int)Math.sqrt(l));i>1;i--){
            if(l%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }
    
    public static void main(String args[]){
        double total = 0d;
        for(int i=2;i<2000000;i++){
            if(isPrime(i)){
                total+=i;
            }
        }
        
        System.out.println(total);

    }
}
