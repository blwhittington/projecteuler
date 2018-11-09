class javaCup{
	public static void main(String[] args) {
		upperFibLimit=4000000;
		int num1=1; 
		int num2=2; 
		int ithFib=0;
		int evenFibSum=2; 

		while(ithFib<=upperFibLimit){
			ithFib=num1+num2; 
			if(ithFib<=upperFibLimit && ithFib%2==0){ 
				evenFibSum+=ithFib; 
			}
			System.out.println(ithFib);
			num1=num2;
			num2=ithFib;
		}
		System.out.println(evenFibSum);
	}
}	
