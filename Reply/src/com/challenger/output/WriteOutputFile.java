package com.challenger.output;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOutputFile {
	public File getOutPutFile(String fileName,OutputModel output)
	{
		File writeFile = new File(fileName);
	    try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(writeFile));
			generateOutPutFile(writer,output);
			writer.flush();
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return writeFile;
	}
	
	public void generateOutPutFile(BufferedWriter writer,OutputModel output) throws IOException{
		writer.write(""+output.getI());
	}
	
	
}
