package com.revature.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Associate;

public class SerialLauncher {

	public static void main(String[] args) {
	
		String fileName = "src/serializedAssociates.txt";
		
		List<Associate> aList = new ArrayList<Associate>();


		aList.add(new Associate("Howard Dennis", "Lackey", -1, "Ribeye", "NoneYa"));		
		aList.add(new Associate("Peterson Etienne", "Dev", 28, "Chicken", "258-695-9658"));
		aList.add(new Associate("Alec Batson", "Trainer/Tech Analyst", 25, "Cheese", "012-34-5678"));
		aList.add(new Associate("Jeffrey Zarate", "Trainee", 23, "Curry", "007-18-1738"));
		aList.add(new Associate("Tom Kirby", "Coolest trainee", 22, "Pizza", "012-34-5678"));
		aList.add(new Associate("Brandon Slade", "Revature Associate", 32, "Sushi", "123-12-1234"));
		aList.add(new Associate("Teli Natsis", "Tech Student", 44, "Pizza", "555-33-2531"));
		aList.add(new Associate("William Brill", "Software Developer", 32, "Pizza", "333-23-0523"));
		aList.add(new Associate("Chris Copeland","Revature Associate",22,"CheeseBurger","666-22-4488"));
		aList.add(new Associate("Devin Stuart", "Trainee", 22, "Pasta With Alfredo", "555-55-5555"));
		aList.add(new Associate("Xavier Laverde", "Software Dev", 33, "Chicken Parm", "112-34-5678"));
		aList.add(new Associate("Serge Armand", "Software Dev", 64, "Buffalo wing", "112-34-5678"));
		aList.add(new Associate("Billy Joel Armstrong", "A ddev", 33, "Chicken Parm", "112-34-5678"));
		aList.add(new Associate("Breeanna Lane", "IT ", 20, "Leaning Tower of Cheese Pizza", "018-778-9990"));
		aList.add(new Associate("Peterson Etienne", "Dev ", 28, "Chicken", "018-758-6890"));
<<<<<<< HEAD
		aList.add(new Associate("Erwin Garces","Trainee", 28,"pizza","58-24-5684"));

=======
		aList.add(new Associate("Chris Copeland","Revature Associate",22,"CheeseBurger","666-22-4488"));
		aList.add(new Associate("Dwight Brown", "Trainee ", 24, "Jamaican Jerk Fish", "987-65-4321"));

		
>>>>>>> 213e8ce6523b52837036398762b6036acecbf943
		serializeToFile(fileName, aList);
		System.out.println(deserializeFromFile(fileName));
		
		
	}
	
	static void serializeToFile(String fileName, Object o) {
		
		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			
			out.writeObject(o);
			
			out.close();
			fileOut.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static Object deserializeFromFile(String fileName) {
		Object o = null;
		
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			o = in.readObject();
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return o;
	}
	

}
