package com.challenger.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReadInputFile {
	public InputModel getInputModel(String fileName){
		InputModel input = new  InputModel();
		List<String> strlist = createListFromFile(fileName);
		input.setStrtx(Integer.parseInt(getWordList(strlist.get(0)).get(0)));
		return input;
	}
	
	public List<String> createListFromFile(String fileName){
		List<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {

			//br returns as stream and convert it into a List
			list = br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
		//list.forEach(System.out::println);
		//System.out.println(list.get(0));
		return list;
	}
	
	public ArrayList<String> getWordList(String str){
		ArrayList<String> wordArrayList = new ArrayList<String>();
		for(String word : str.split(" ")) {
		    wordArrayList.add(word);
		}
		return wordArrayList;
	}
}
