class javaCup{
/**adding multiples of 3 or 5 between one and one-thousand*/
public static void main(String[] args) {
	int tal=0;
	for (int num=0;num<1000;num++) {
	if(num%3==0||num%5==0){
	tal+=num;}}
	System.out.println(tal);}
}	
