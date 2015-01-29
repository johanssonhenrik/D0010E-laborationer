package laboration1;

public class Prog3 {

	public static void main(String[] args) {

		//int first = Integer.parseInt(args[0]);			//a0
		//System.out.println(iter_life_length(first));
		
		for(int i=0;i<args.length; i++){					//Prints main arguments.
			System.out.print(args[i]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		for(int i=0;i<args.length; i+=1){
			int argInArray = Integer.parseInt(args[i]);
			System.out.println("Ite: "+iter_life_length(argInArray));
			System.out.println("Rek: The life length of "+argInArray+" is "+rec_life_length(argInArray));
			System.out.println("");
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

//-------------------------------Problem 4-------------------------------
	static String iter_life_length(int a){
		int lifeLength = 0;
		int first = a; 
		while(a!=1){
			lifeLength++;
			a = f1(a);
		}
		return ("The life length of "+first+" is "+lifeLength);
	}
	
//-------------------------------Problem 6-------------------------------	//life length of numbers 1..15. And print both iter and rec.
	static int rec_life_length(int a){
		if(a == 1)
			//return lifeLength;
			return 0;
		else{
			//lifeLength++;
			//int first = f1(a);
			return rec_life_length(f1(a))+1;
		}
	}
}
