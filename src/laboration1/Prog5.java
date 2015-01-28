package laboration1;

public class Prog5 {

//-------------------------------Problem 9------------------------------- Print both rec_raise & rec_raise_eff
	public static void main(String[] args) {
		
		for(int i=0;i<args.length; i++){					//Prints main arguments.
			System.out.print(args[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);
		
		System.out.println("raise: "+first+"^"+second+" = "+rec_raise(2.0,second));
		System.out.println("raise_eff: "+first+"^"+second+" = "+rec_raise_eff(first,second));
	}
	
	public static double rec_raise(double x, int k){		//Given i pdfen.
		if(k==0){
			return 1.0;
		}else{
			return x* rec_raise(x,k-1);
		}
	}
		
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
