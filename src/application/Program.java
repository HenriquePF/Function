package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD Case", 80.90));

		// Function map(not the data structure Map);
		// List<String> names = list.stream().map(new UpperCaseName()).sorted().collect(Collectors.toList());

		// Reference Method with static method
		// List<String> names = list.stream().map(Product::staticUpperCaseName).sorted().collect(Collectors.toList());

		// Reference Method with non static method
		// List<String> names = list.stream().map(Product::nonStaticUpperCaseName).sorted().collect(Collectors.toList());

		// Reference Method declared lambda expression
		// Function<Product, String> func = p -> p.getName().toUpperCase();
		// List<String> names = list.stream().map(func).sorted().collect(Collectors.toList());

		// Reference Method Lambda Expression Inline
		 List<String> names = list.stream().map(p -> p.getName().toUpperCase()).sorted().collect(Collectors.toList());

		
		names.forEach(System.out::println);

	}
}
