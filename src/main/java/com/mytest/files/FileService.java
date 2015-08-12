package com.mytest.files;

import java.io.File;

public class FileService {
	
	private static final String INPUT_FILES = "./inputFiles";
	private static final String OUTPUT_FILES = "./outputFiles";
	
	public static final String FILE_WITH_LINES = INPUT_FILES.concat("/fileWithLines.txt");
	
	public static final boolean createOutputDirectories() {
		return (new File(OUTPUT_FILES)).mkdirs();
	}
	
	public static void main(String[] args) {
		System.out.println(createOutputDirectories());		
	}
}
