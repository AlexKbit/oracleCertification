package com.mytest.files;

import java.io.File;

public class FileService {
	
	public static final String INPUT_FILES = "./inputFiles";
	public static final String OUTPUT_FILES = "./outputFiles";
	
	public static final String FILE_WITH_LINES = INPUT_FILES.concat("/fileWithLines.txt");
	
	public static final boolean createOutputDirectories() {
		return (new File(OUTPUT_FILES)).mkdirs();
	}

}
