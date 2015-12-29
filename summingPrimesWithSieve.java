import java.util.*;
public class javaCup{

    public static void main(String args[]){
        double total = 0d;
        boolean[] range = new boolean[2000000];
        Arrays.fill(range, Boolean.TRUE); //unecessary
        List<Integer> primeList = new ArrayList<Integer>();
        
        for(int l=2;l<range.length;l++){ //sieve of eratosthenes!
            if(range[l]){
                for(int i=2;l*i<range.length;i++){
                    range[l*i]=false;
                }
            }
        }

        for(int i=2;i<range.length;i++){ //populate primeList
            if(range[i]){
                primeList.add(i);
            }
        }

        for(int i: primeList){
            total +=i;
        }

        System.out.println(total);
    }

}
