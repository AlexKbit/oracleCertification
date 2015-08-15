package com.oracle2.java.application.main.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.mytest.files.FileService;

public class AppSerialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		serialize();
		deserialize();
	}
	
	private static void serialize() throws IOException {
		ObjectOutputStream output = new ObjectOutputStream(
				new FileOutputStream(FileService.pathOutputFor("object")));
		Message msg = new Message();
		msg.setValue("Hello");
		output.writeObject(msg);
		output.close();
	}
	
	private static void deserialize() throws ClassNotFoundException, IOException {
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(FileService.pathOutputFor("object")));
		Message msg = (Message) input.readObject();
		input.close();
		System.out.println(msg.getValue());
	}

}

class Message implements Serializable {
	
	private static final long serialVersionUID = 7235128483110180304L;
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
