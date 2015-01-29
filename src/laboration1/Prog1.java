package laboration1;

public class Prog1 {

//-------------------------------Problem 1-------------------------------
	
//	public static void main(String[] args){
//		
//		int first = Integer.parseInt(args[0]);
//		int second = Integer.parseInt(args[1]);
//		
//		System.out.println("> Prog1 "+first);
//		System.out.println(f1(first));
//		
//		System.out.println("> Prog1 "+second);
//		System.out.println(f1(second));
//	}
//	public static int f1(int a){
//		if(a==1)
//			return 1;
//		if(a%2==0){
//			return (a/2);
//		}else
//			return ((3*a)+1);
//	}
	
//-------------------------------Problem 2-------------------------------
	
	public static void main(String[] args){
		
		int first = Integer.parseInt(args[0]);			//a0
		
		System.out.println("> Prog1 "+first+" ");
		
		System.out.print("f1="+f1(first)+" ");			//a1
		System.out.print("f2="+f2(first)+" ");			//a2
		System.out.print("f4="+f4(first)+" ");			//a4
		System.out.print("f8="+f8(first)+" ");			//a8
		System.out.print("f16="+f16(first)+" ");		//a16
		System.out.println("f32="+f32(first)+" ");		//a32
		
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
	
	public static int f2(int a){
		return f1(f1(a));
	}
	public static int f4(int a){
		return f2(f2(a));
	}
	public static int f8(int a){
		return f4(f4(a));
	}
	public static int f16(int a){
		return f8(f8(a));
	}
	public static int f32(int a){
		return f16(f16(a));
	}
}
