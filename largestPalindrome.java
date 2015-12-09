import java.util.*;
public class javaCup{

    public static String palinCreator(int num1, int num2){
        String product = Integer.toString(num1*num2);
        return product;
    }

    public static String stringReverser(String s){
        String reverse = "";
        for(int q = s.length()-1; q >= 0; q--){
            reverse = reverse + s.charAt(q);
        }
        return reverse;
    }

    public static void main(String[] args){

        String forward = "";
        String backward = "";
        boolean palin = true;
        List<Integer> palinFactors = new ArrayList<Integer>();

        for(int a=999; a>100; a--){
            for(int z=999; z>100;z--){
                forward = palinCreator(a,z);
                backward = stringReverser(forward);
                palin = true;
                for(int i = forward.length()-1;i >=0 ;i--){
                    if(forward.charAt(i) != backward.charAt(i)){
                        palin=false;
                    }
                }
                if (palin) {
                    palinFactors.add(Integer.parseInt(forward));
                }
            }    
        }

        Collections.sort(palinFactors);
        System.out.println("Smallest: " + palinFactors.get(0));
        System.out.println("Largest: " + palinFactors.get(palinFactors.size()-1));

    }    
}
