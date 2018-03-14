package com.challenger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.challenger.input.InputModel;
import com.challenger.input.ReadInputFile;
import com.challenger.output.OutputModel;
import com.challenger.output.WriteOutputFile;

public class Problem {
	
	static String INPUT_FILE_NAME = "/Users/satishbelose/Downloads/input_1.txt";
	static String OUTPUT_FILE_NAME = "/Users/satishbelose/Downloads/output_1.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadInputFile readInputFile = new ReadInputFile();
		InputModel input = readInputFile.getInputModel(INPUT_FILE_NAME);
		OutputModel output = new OutputModel();
		output.setI(input.getStrtx());
		WriteOutputFile writeOutputFile = new WriteOutputFile();
		writeOutputFile.getOutPutFile(OUTPUT_FILE_NAME, output);
		
	}
}
