package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


 class Product {


	String name;
	Double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
 
	
		public static void main(String[] args) {
			List<Product> searchResult = new ArrayList<Product>();
		searchResult.add(new Product("MADISON OVEREAR HEADPHONES", 25.00));
		searchResult.add(new Product("AADISON EARBUDS", 35.00));
		searchResult.add(new Product("KP3 PLAYER WITH AUDIO", 15.00));

		// Collections.sort(searchResult,(p1,p2)->p1.getPrice().compareTo(p2.getPrice()));
		List<Product> l = searchResult.stream().sorted(Comparator.comparing(Product::getPrice))
				.collect(Collectors.toList());

		// Using Java8
		l.forEach(element -> System.out.println(element.getName() + "  " + element.getPrice()));

		Product product = searchResult.stream().min(Comparator.comparing(item -> item.getPrice())).get();
		System.out.println(product.getName() + "    " + product.getPrice());

	}

}