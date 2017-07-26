package com.kiran.project.euler.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.kiran.project.euler.Problem;

public class Problem22 extends Problem {

	public long solve(){
		
		
		System.out.println("NAMESCORE :: "+getNameScore("AARON"));
		String content;
		long sum = 0;
		try {
			content = new String(Files.readAllBytes(Paths.get("/Users/kkumar1/Downloads/p022_names.txt")));
			content = content.replaceAll("\"", "");
			String[] names = content.split(",");
			List<String> list = Arrays.asList(names);
			Collections.sort(list);
			int i =1;
			for(String str : list){
				System.out.println("List :: "+str);
				sum =sum + (getNameScore(str))*i;
				i++;
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sum;
		
		
	}
	
	public long getNameScore(String str){
		int a = (int)'A';
		long sum =0;
		for(char c : str.toCharArray()){
			int ch = (int)c;
			sum = sum + ch-a+1;
		}
		return sum;
	}
}
