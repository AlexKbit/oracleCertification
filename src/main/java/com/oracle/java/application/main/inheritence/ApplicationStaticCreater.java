package com.oracle.java.application.main.inheritence;

public class ApplicationStaticCreater {
	
	String seq = "c";
	{seq +="z";}
	
	public static void main(String[] args){
		new ApplicationStaticCreater();
		ApplicationStaticCreater a = new ApplicationStaticCreater();
		System.out.println(a.seq);
	}

}
