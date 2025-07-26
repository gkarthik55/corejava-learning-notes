package com.learning.corejava13.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	int price;

	public Product(int id, String name, int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Product Id :" + this.id + " \nProduct Name :" + this.name + " \nProduct Price :" + this.price;
	}
}

public class JavaExample_07_StreamAPI_FilterMapCollect_Interview
{
	public static void main(String[] args)
	{
		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000));
		productsList.add(new Product(2, "Dell Laptop", 30000));
		productsList.add(new Product(3, "Lenevo Laptop", 28000));
		productsList.add(new Product(4, "Sony Laptop", 28000));
		productsList.add(new Product(5, "Apple Laptop", 90000));

		List<Integer> productPriceList2 = 
				productsList
				.stream()
				.filter(p -> p.price >= 30000)	// filtering data
				.map(p -> p.price) 				// fetching price
				.collect(Collectors.toList());  // collecting as list

		System.out.println(productPriceList2);

		List<Product> newProductList = 
				productsList
				.stream()
				.filter(p -> p.price > 50000)	// filtering data
				.map(p -> p)					// fetching data
				.collect(Collectors.toList());  // collecting as list

		System.out.println(newProductList.toString());
	}
}
