package functionalInterfaces;
import java.util.function.Supplier;

public class SupplierCheck {

	public static void main(String[] args) {
		int n =10;
		Supplier<Integer> supply = () -> n + 100;
		System.out.println(supply.get());
	}

}
