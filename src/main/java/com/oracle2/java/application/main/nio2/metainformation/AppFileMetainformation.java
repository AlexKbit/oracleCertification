package com.oracle2.java.application.main.nio2.metainformation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.mytest.files.FileService;

public class AppFileMetainformation {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(FileService.FILE_WITH_LINES);
		System.out.println("Files.isDirectory = "+Files.isDirectory(path));
		System.out.println("Files.isExecutable = "+Files.isExecutable(path));
		System.out.println("Files.isHidden = "+Files.isHidden(path));
		System.out.println("Files.isReadable = "+Files.isReadable(path));
		System.out.println("Files.isWritable = "+Files.isWritable(path));
		System.out.println("Files.getLastModifiedTime = "+Files.getLastModifiedTime(path));
		System.out.println("Files.getOwner = "+Files.getOwner(path));
		System.out.println("Files.size = "+Files.size(path));
		//change attribute: Files.setAttribute(path, "dos:hidden", false);
	}

}
