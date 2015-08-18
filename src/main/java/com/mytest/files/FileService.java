package com.mytest.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileService {
	
	public static final String INPUT_FILES = "./inputFiles";
	public static final String OUTPUT_FILES = "./outputFiles";
	
	public static final String FILE_WITH_LINES = Paths.get(INPUT_FILES, "fileWithLines.txt").toString();
	public static final String OUTPUT_DIRECTORY_WITH_GENERATE = Paths.get(OUTPUT_FILES, "Generate").toString();
	
	public static final boolean createOutputDirectories() {
		return (new File(OUTPUT_FILES)).mkdirs();
	}
	
	public static final String pathOutputFor(String name) {
		createOutputDirectories();
		return OUTPUT_FILES.concat("/").concat(name);
	}
	
	public static final Path generateDirWithFiles() {
		File dFile = Paths.get(OUTPUT_DIRECTORY_WITH_GENERATE).toFile();
		
		removeFiles(OUTPUT_DIRECTORY_WITH_GENERATE);
		
		dFile.mkdirs();
		Random rd = new Random();
		for (int i=0; i< rd.nextInt(5)+5; i++) {
			File file = Paths.get(dFile.getAbsolutePath().toString(), "generate" + String.valueOf(rd.nextInt(10000)+1000) + ".txt").toFile();
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return Paths.get(OUTPUT_DIRECTORY_WITH_GENERATE);
	}
	
	private static void removeFiles(String directory) {
		File dir = new File(directory);
		if (!dir.exists()) return;
		for (File file: dir.listFiles()) 
		    if (file.isFile()) file.delete();
	}

}
