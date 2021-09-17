import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IMathFunction add = (x,y) -> x+y;
		IMathFunction add1 = Integer::sum;
		IMathFunction multiply = (x,y) -> x*y;
		IMathFunction divide = (x,y) -> x/y;
		
		IMathFunction.display("add",5,4,add);
		IMathFunction.display("add",5,4,add1);
		IMathFunction.display("multiply",5,4,multiply);
		IMathFunction.display("divide",8,4,divide);
	}
}