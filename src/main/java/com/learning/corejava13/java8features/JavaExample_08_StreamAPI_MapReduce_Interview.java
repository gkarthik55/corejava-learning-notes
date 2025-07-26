package com.learning.corejava13.java8features;

import java.util.ArrayList;
import java.util.List;

public class JavaExample_08_StreamAPI_MapReduce_Interview 
{
	public static void main(String[] args) 
	{
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000));  
        productsList.add(new Product(2,"Dell Laptop",30000));  
        productsList.add(new Product(3,"Lenevo Laptop",28000));  
        productsList.add(new Product(4,"Sony Laptop",28000));  
        productsList.add(new Product(5,"Apple Laptop",90000));  
        
        // This is more compact approach for filtering data  
        Integer totalPrice = productsList
        						.stream()  
					            .map(product->product.price)			   // fetching data
					            .reduce(0, (sum, price) -> sum+price);   // accumulating data
        
        System.out.println(totalPrice);  
	}
}
