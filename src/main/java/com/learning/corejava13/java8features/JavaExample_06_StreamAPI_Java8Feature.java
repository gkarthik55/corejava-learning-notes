package com.learning.corejava13.java8features;

import java.util.Arrays;
import java.util.List;

public class JavaExample_06_StreamAPI_Java8Feature
{
	public static void main(String[] args)
	{
		List<Integer> values = Arrays.asList(12, 42, 63, 74, 95, 88, 5, 2, 35);

		System.out.println("Using Stream API and printing the value using ForEach method.");
		// Stream API
		values.stream().forEach(val -> System.out.println(val));

		// Parallel Stream API
		// It creates different threads and process the data.
		System.out.println("\nUsing Parallel Stream API and printing the value using Method Reference.");
		values.parallelStream().forEach(System.out::println);
	}
}
