package laboration1;

public class Prog5 {

//-------------------------------Problem 9------------------------------- Add rec_raise.
	private static int rec_raise_Counter = 0;
	private static int rec_raise_eff_Counter = 0;
	
	public static void main(String[] args) {				//Print both rec_raise & rec_raise_eff
		
//		for(int i=0;i<args.length; i++){					//Prints main arguments.
//			System.out.print(args[i]);
//			System.out.print(" ");
//		}
//		System.out.println(" ");
//		
//		int first = Integer.parseInt(args[0]);
//		int second = Integer.parseInt(args[1]);
//		
//		System.out.println("raise: "+first+"^"+second+" = "+rec_raise(first,second)+" ("+rec_raise_Counter+" loops)");
//		System.out.println("raise_eff: "+first+"^"+second+" = "+rec_raise_eff(first,second)+" ("+rec_raise_eff_Counter+" loops)");
		
		//-----Problem 10-----
		n1();
		n2();
		//--------------------
	}
	
	public static double rec_raise(double x, int k){		//Given i pdfen.
		rec_raise_Counter++;
		if(k==0){
			return 1.0;
		}else{
			return x*rec_raise(x,k-1);
		}
	}
		
	static double rec_raise_eff(double a, int k){
		rec_raise_eff_Counter++;
		double x;
		int kDivided = k/2;
		
		if(k==0){
			return 1;
		}
		if(k%2==0){
			x = rec_raise_eff(a,kDivided);
			return x*x;
		}else{
			x = rec_raise_eff(a,kDivided);
			return a*x*x;
		}
	}
	
//-------------------------------Problem 10-------------------------------
	static void n1(){				//Recursive calls to be made by rec_raise
//		for(int i=1;i<=50;i++){
//			//System.out.println("rec_raise: "+rec_raise(1.0001,i)+" ("+rec_raise_Counter+" loops)"+" k="+i);
//			rec_raise_Counter = 0;		
//			System.out.println(rec_raise(1.0001,i));
//		}
		
		for(int i=0;i<=1000;i++){
			System.out.println("rec_raise: "+rec_raise(1.0001,i)+" ("+rec_raise_Counter+" loops)"+" k="+i);
			rec_raise_Counter = 0;
			//System.out.println(rec_raise(1.0001,i));
		}
//		for(int i=1;i<=1000;i++){
//			//System.out.println("rec_raise: "+rec_raise(1.0001,i)+" ("+rec_raise_Counter+" loops)"+" k="+i);
//			
//			//rec_raise(1.0001,i);
//			//System.out.println(rec_raise_Counter);
//			//rec_raise_Counter = 0;
//			
//			//System.out.println(i);	//k
//		}
		for(int i=0;i<=10000;i++){
			//System.out.println("rec_raise: "+rec_raise(1.0001,i)+" ("+rec_raise_Counter+" loops)"+" k="+i);
			
			//rec_raise(1.0001,i);
			//System.out.println(rec_raise_Counter);
			//rec_raise_Counter = 0;
			
			//System.out.println(i);	//k
		}
	System.out.println("END");
	}
	static void n2(){				//Recursive calls to be made by rec_raise_eff
//		for(int i=1;i<=50;i++){
//			//System.out.println("rec_raise_eff: "+rec_raise_eff(1.0001,i)+" ("+rec_raise_eff_Counter+" loops)"+" k="+i);
//			rec_raise_eff_Counter = 0;		
//			System.out.println(rec_raise_eff(1.0001,i));
//		}
		
		for(int i=0;i<=1000;i++){
			System.out.println("rec_raise_eff: "+rec_raise_eff(1.0001,i)+" ("+rec_raise_eff_Counter+" loops)"+" k="+i);
			
			//System.out.println(rec_raise_eff(2,i));
			//rec_raise_eff(2,i);
			//rec_raise_eff(1.0001,i);
			//System.out.println(rec_raise_eff_Counter);
			rec_raise_eff_Counter = 0;
			
			//System.out.println(rec_raise_eff(1.0001,i));
			//System.out.println(i);
		}
		for(int i=0;i<=1000;i++){
			//System.out.println("rec_raise_eff: "+rec_raise_eff(1.0001,i)+" ("+rec_raise_eff_Counter+" loops)"+" k="+i);
			
			//rec_raise_eff(1.0001,i);
			//System.out.println(rec_raise_eff_Counter);
			//rec_raise_eff_Counter = 0;
			
			//System.out.println(rec_raise_eff(1.0001,i));
			//System.out.println(i);
		}
	System.out.println("END");
	}
}
