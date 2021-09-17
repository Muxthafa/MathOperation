
@FunctionalInterface
public interface IMathFunction {
	int calculate(int a,int b);
	
	static void display(String op,int i,int j,IMathFunction ref) {
		System.out.println(op+" : "+ref.calculate(i,j));
	}
}
