package com.challenger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem {
	static String FILE_NAME = "/Users/satishbelose/Downloads/input_1.txt";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	
	public List<String> createFileToList(String fileName){
		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(FILE_NAME))) {

			//br returns as stream and convert it into a List
			list = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
		//list.forEach(System.out::println);
		//System.out.println(list.get(0));
		return list;
	}
	
	

}
