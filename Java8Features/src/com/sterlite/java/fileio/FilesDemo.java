package com.sterlite.java.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Stream<String> fileData = Files.lines(Paths.get("hello.txt"));
			fileData.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
