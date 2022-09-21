
public class DemonstrateStaticMethodVariableBlock {

	//static variable
	static int x=10;
	
	//static method
	static void add() {
		x=x*x;
		System.out.print(x);
	}
	
	//static block
	static{
		System.out.println("First run static block");
	}
	
	public static void main(String[] args) {
		DemonstrateStaticMethodVariableBlock a=new DemonstrateStaticMethodVariableBlock();
		a.add();
	}
}
