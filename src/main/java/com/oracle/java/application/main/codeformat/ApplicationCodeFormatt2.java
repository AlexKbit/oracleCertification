package com.oracle.java.application.main.codeformat;

public class ApplicationCodeFormatt2 {
    
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
        ((ApplicationCodeFormatt2) null).doTest(args);
    }
	
	// without static NPE!!!
	static void doTest(String[] args) {
        System.out.println(new ApplicationCodeFormatt2().$_$()[2]);
    }

	// Gets array (length = 7)
    ;short $_$()[] {{{
        return new short[007];
    }}};
};;;;;
