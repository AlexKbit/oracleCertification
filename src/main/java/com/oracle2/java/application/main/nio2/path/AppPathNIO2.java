package com.oracle2.java.application.main.nio2.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppPathNIO2 {

	public static void main(String[] args) {
		// using an absolute path
		Path p1 = Paths.get("c:\\file.txt");
		// using a relative path to construct the path c:\data\examples\file.txt
		Path p2 = Paths.get("c:\\data", "examples\\file.txt");
		
		p1 = Paths.get("c:\\data\\.\\file.txt"); // refers to c:\data\file.txt
		p2 = Paths.get("c:\\data\\examples\\..\\file.txt"); // refers to c:\data\file.txt
		
		// relative path to absolute path
		p1 = Paths.get("file.txt");
		p2 = p1.toAbsolutePath(); // refers for example to c:\data\file.txt
		
		System.out.println(p1 + " and " + p2);
		
		// File to Path and Path to File
		File f = Paths.get("file.txt").toFile();
		Path p = new File("file.txt").toPath();
		
		System.out.println(f + " and " + p);
		
		String str = "c:\\users\\admin\\file.txt";
		System.out.println(str);
		
		Path path = Paths.get(str); 
		System.out.println(path.getFileName()); // returns file.txt
		System.out.println(path.getName(0)); // returns users
		System.out.println(path.getNameCount()); // returns 3 (users, admin and file.txt)
		System.out.println(path.subpath(0, 2)); // returns users\admin
		System.out.println(path.getParent()); // returns c:\ users\ admin
		System.out.println(path.getRoot()); // returns c:\ (if we were in a unix filesystem, it would return \)
	}
}
