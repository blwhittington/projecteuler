import java.util.*;
public class javaCup{
public static void main(String[] args) {
	
long upperLimit=600851475143l;
int sqrUpperLimit = (int) Math.sqrt(upperLimit);
boolean prime = true;

List<Long> factors = new ArrayList<Long>();

for(int i=sqrUpperLimit;i>0;i--){
  if(upperLimit%i==0){
  factors.add((long) (upperLimit/i)); // i is a factor. divide the upperLimit by i to obtain the other factor.
  factors.add((long) i);}}
  
Collections.sort(factors);

for(int l=factors.size()-2;l>0;l--){
  for(int c=2;c<(Math.sqrt(factors.get(l)));c++){
    prime = true; // reset to true if set to false by preceeding tests.
    if(factors.get(l)%c==0){
    prime = false;
    break;}}
  if(prime){
  System.out.println(factors.get(l));
  break;}}
  
 }
}
