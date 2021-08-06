package application;

import entity.Product;
import util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("MOuse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.90));
		list.add(new Product("Cellphone", 287.0));

		list.forEach(new PriceUpdate());

		list.forEach(Program::test);
		
	}

	private static void test(Product p) {
		System.out.println(p);
	}
}
