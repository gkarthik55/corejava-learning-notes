package com.learning.corejava08.interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.Collections;

//A class 'Movie' that implements Comparable 
class Movie implements Comparable<Movie>
{
	private String name;
	private int year;
	private double rating;

	public Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int compareTo(Movie m)
	{
		if(this.year < m.year)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class JavaExample_07_ComparableInterface
{
	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 2008));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		
		for (Movie movie : list)
		{
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}
}
