package com.oracle2.java.application.main.nio2.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AppPathMethods {

	public static void main(String[] args) {
		resolve();
		System.out.println("");
		relativize();
		
		System.out.println(Paths.get("f.txt").toAbsolutePath()); // C:\GitHub\oracleCertification\f.txt (but file does not exist)
	}
	
	private static void resolve() {
		Path p1 = Paths.get("C://test//mytest//file1.java");
		Path p2 = Paths.get("C://test//mytest//file2.java");
		System.out.println(p1.resolve(p2)); // C:\test\mytest\file2.java
		System.out.println(p2.resolve(p1)); // C:\test\mytest\file1.java
		
		p1 = Paths.get("C://test//mytest//dirs//dir1"); // C:\test\mytest\newdirs\dir2
		p2 = Paths.get("C://test//mytest//newdirs//dir2"); // C:\test\mytest\dirs\dir1
		System.out.println(p1.resolve(p2)); // C:\test\mytest2\newdirs\dir2
		System.out.println(p2.resolve(p1)); // C:\test\mytest1\..\dirs\dir1
				
		p1 = Paths.get("C://test//mytest1//..//dirs//dir1"); 
		p2 = Paths.get("C://test//mytest2//newdirs//dir2"); 
		System.out.println(p1.resolve(p2)); // ..\file2.java
		System.out.println(p2.resolve(p1)); // ..\file1.java
	}
	
	private static void relativize() {
		Path p1 = Paths.get("C://test//mytest//file1.java");
		Path p2 = Paths.get("C://test//mytest//file2.java");
		System.out.println(p1.relativize(p2)); // ..\..\newdirs\dir2
		System.out.println(p2.relativize(p1)); // ..\..\dirs\dir1
		
		p1 = Paths.get("C://test//mytest//dirs//dir1");
		p2 = Paths.get("C://test//mytest//newdirs//dir2");
		System.out.println(p1.relativize(p2)); // ..\..\..\..\mytest2\newdirs\dir2
		System.out.println(p2.relativize(p1)); // ..\..\..\mytest1\..\dirs\dir1
				
		p1 = Paths.get("C://test//mytest1//..//dirs//dir1");
		p2 = Paths.get("C://test//mytest2//newdirs//dir2");
		System.out.println(p1.relativize(p2));
		System.out.println(p2.relativize(p1));
	}

}
