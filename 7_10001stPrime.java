import java.util.*;
public class javaCup{

    public static boolean isPrime(int x){
        boolean prime = true;
        for(int i=((int)Math.sqrt(x));i>1;i--){
            if(x%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String args[]){
        int upperLimit = 10001;
        int primeTally = 0;
        int number = 2;

        while(primeTally<upperLimit){
            if(isPrime(number)){
                primeTally ++;
                System.out.printf("%d is a prime: %d\n",number,primeTally);
            }
            number ++;
        }

    }
}
