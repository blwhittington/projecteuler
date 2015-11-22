class javaCup{
	public static void main(String[] args) {
		upperFibLimit=4000000; //setting our upper limit param at four million
		int num1=1; 
		int num2=2; 
		int ithFib=0; //to test fib value for even-odd and sum its numerical val 
		int evenFibSum=2; //start sum at 2 to include number 2 as the first even fib 
		//starting evenFibSum=0 neglects 2 in the evenFibSum -- the first ithFib val is 3
		while(ithFib<=upperFibLimit){
			ithFib=num1+num2; //creating and assigning current loop's fib iteration
			if(ithFib<=upperFibLimit && ithFib%2==0){ 
				evenFibSum+=ithFib; //include ithFib if in within param and even
			}
			System.out.println(ithFib);
			num1=num2; //re-assigning num vars to compute next-iteration's fib
			num2=ithFib; //re-assigning num vars to compute next-iteration's fib
		}
		System.out.println(evenFibSum);
	}
}	
