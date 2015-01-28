package laboration1;

public class Prog2 {

	public static void main(String[] args) {

		for(int i=0;i<args.length; i++){	//Prints main arguments.
			System.out.print(args[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		for(int i=0;i<args.length; i+=2){
			int argInArray = Integer.parseInt(args[i]);
			System.out.println();
			System.out.println("> Prog2 (a0="+argInArray+" steps="+Integer.parseInt(args[i+1])+")");
			
			System.out.print(iterate_f(argInArray,Integer.parseInt(args[i+1])));
		}
	}
	
	public static int f1(int a){
		if(a==1){
			return 1;
		}
		if(a%2==0)
			return (a/2);
		else
			return ((3*a)+1);
	}

//-------------------------------Problem 3-------------------------------
	public static int iterate_f(int a,int steps){
		
		for(int i=0;i<steps;i++){
			a = f1(a);
		}
		return a;
	}
}
