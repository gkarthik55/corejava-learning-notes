package com.learning.corejava06.strings;

import java.util.HashMap;
import java.util.Map;

// write a program to print occurrence of word count in text file
public class JavaExample_06_StringInterview_VryImp
{
	public static void main(String[] args)
	{
		String str = "Hello world! Hello Java.!! Java is powerful...!!! Java is popular.";

		Map<String, Integer> wordCountMap = new HashMap<>();

		// Convert to lowercase and remove punctuation
		String line = str.toLowerCase().replaceAll("[^a-z0-9\\s]", "");

		// Split the line into words
		String[] words = line.split("\\s+");

		for (String word : words)
		{
			if (!word.isEmpty())
			{
				wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
				
				/* Otherwise, You can use as below:
				 * 
				 * Integer count = wordCountMap.get(word);
				 * 
				 * if(count == null) 
				 * { wordCountMap.put(word,1); } 
				 * else 
				 * { wordCountMap.put(word,++count); }
				 */
			}
		}

		// Print the word counts
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet())
		{
			System.out.println(entry.getKey() + " → " + entry.getValue());
		}
	}
}
