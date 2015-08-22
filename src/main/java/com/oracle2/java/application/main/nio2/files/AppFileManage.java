package com.oracle2.java.application.main.nio2.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import com.mytest.files.FileService;

public class AppFileManage {

	static Path path = Paths.get(FileService.pathOutputFor("test.txt"));
	
	public static void main(String[] args) throws IOException {
		deleteFile();
		checkFile();
		createFile();
		checkFile();
		copyFile();
		moveFile();
		
		readLinesFile();
	}
	
	private static void createFile() throws IOException {
		boolean isCreated = path.toFile().createNewFile();
		System.out.println("File is created: " + isCreated);
	}
	
	private static void checkFile() {
		boolean exists = Files.exists(path, new LinkOption[]{ LinkOption.NOFOLLOW_LINKS});
		System.out.println("File is exists: " + exists);
	}
	
	private static void deleteFile() {
		boolean isDelete = path.toFile().delete();
		System.out.println("File is deleted: " + isDelete);
	}
	
	private static void copyFile() throws IOException {
		Path target = Paths.get(path.getParent().toString(), "new.txt");
		Files.copy(path, target, StandardCopyOption.REPLACE_EXISTING); // StandardCopyOption.REPLACE_EXISTING - for override file
		System.out.println("File is copy to: " + target);
	}
	
	private static void moveFile() throws IOException {
		Path target = Paths.get(path.getParent().toString(), "move.txt");
		Files.move(path, target, StandardCopyOption.REPLACE_EXISTING);  // StandardCopyOption.REPLACE_EXISTING - for override file
		System.out.println("File is moved to: " + target);
	}
	
	private static void readLinesFile() throws IOException {
		System.out.println("Lines: ");
		Files.readAllLines(Paths.get(FileService.FILE_WITH_LINES)).stream().limit(5).forEach(System.out::println);
	}

}
