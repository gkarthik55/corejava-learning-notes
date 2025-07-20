package com.learning.corejava06.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaExample_08_StringInterview_FileReader
{
	public static void main(String[] args)
	{
		FileReader file = null;
		BufferedReader br = null;
		
		try
		{
			file = new FileReader("sample.txt");
			br = new BufferedReader(file);
			
			String line = br.readLine();
			System.out.println(line);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				br.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
