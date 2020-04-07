import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// () ->  represents Lambda expression

		// Predicates - One arg as input, boolean as ouput
		
		Predicate <String> strLen = (s) -> s.length() < 10;
		System.out.println(strLen.test("Apples") + "  Apples is less than 10 ");
		
		Predicate<Integer> oddNum = (n) -> n.compareTo(9) == 0;
		System.out.println(oddNum.test(9) + " 9 is equal to 9");
		System.out.println(oddNum.test(5) + "5 is not equal to 9");
		
		// Consumer - One arg, no returns
		Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
		consumerStr.accept("RISHMA SANKARBABU");
		
		// Supplier - no arg, returns value
		Supplier<String> s = () -> "Supplier Functional Interface";
		System.out.println(s.get());
		
		// Function -  Arg of one type, returns another type
		
		Function<Integer,String> converter = (num) -> Integer.toString(num);
		System.out.println("Length of 34455 is "+ converter.apply(34455).length());
		
		
		//BinaryOperator
		BinaryOperator<Integer> bOperator = (a,b) -> a+b ;
		System.out.println("The addition of 10 +35::"+bOperator.apply(10, 35));
		
		// UnaryOperator - 
		
	    UnaryOperator<String> uOperator = (msg)-> msg.toUpperCase();
	    System.out.println(uOperator.apply("rishma"));
	}

}
