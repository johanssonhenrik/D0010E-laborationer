package lab1;

public class Prog4 {

	public static void main(String[] args) {
		
		for(int i=0;i<args.length; i++){									//Prints main arguments.
			System.out.print(args[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		System.out.println(first+"^"+second+" = "+rec_raise_eff(first,second));
		
	}
	
//-------------------------------Problem 8-------------------------------	Add rec_raise_eff
	static int rec_raise_eff(int a, int k){
		
		int x;
		int kDivided = k/2;
		
		if(k==0){
			return 1;
		}
		if(k%2==0){
			x = rec_raise_eff(a,kDivided);
			return x*x;
		}else{
			x = rec_raise_eff(a,kDivided);
			return x*x*a;
		}
	}
}
