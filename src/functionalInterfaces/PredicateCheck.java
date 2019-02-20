package functionalInterfaces;
import java.util.function.Predicate;

public class PredicateCheck {

	public static void main(String[] args) {
		
		Predicate<String> isALongWord = t -> t.length() > 10;
		String s = "Mississippi";
		System.out.println(isALongWord.test(s));
	}

}
