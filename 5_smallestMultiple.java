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

    public static int rootFinder(int z){ //return root of composite number 
        int root = 1;
        int counter = 1;
        int iterator = 1;
        if ((z & 1) == 1){
            for (int i =z;i>2;i--){
                if(z%i==0){
                    iterator = i;
                }
            }
            while(Math.pow(iterator,counter)<=z){
                if(Math.pow(iterator,counter)==z){
                    root = iterator;
                    break;
                }
                counter +=1;
            }
        }
        if ((z & 0) == 0){
            while(Math.pow(2,counter)<=z){
                if(Math.pow(2,counter)==z){
                    root = 2;
                    break;
                }
                counter +=1;
            }
        }
        System.out.println(z + " " + root);
        return root;
    }

    public static void main(String args[]){
        int upperLimit = 20;
        int[] range = new int[upperLimit];
        double primeProductTally = 1;
        double compositeTally =1;

        for(int i=upperLimit;i>1;i--){
            range[i-1]=i;
            if(isPrime(range[i-1])){
                primeProductTally *= range[i-1];
            }
            else{
                compositeTally *= rootFinder(range[i-1]);
            }
        }

        System.out.println(primeProductTally*compositeTally); //multiply prime factors of each number 1-20

    }
}
