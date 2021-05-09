package roverNode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * @author Noah Jaussi
 *
 */

public class TreeCorrection {

	/*
	 * TODO
	 * read input file into array list
	 * scan array like binary heap
	 * swap when necessary and record swaps
	 */
	
	private HashMap<Integer, Integer> swapped;
	
	public static void correctTree(String fileName) throws IOException {
		ArrayList<Integer> unchecked = read(fileName);
		
	}
	/**
	 * create arrayList to represent
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static ArrayList<Integer> read (String file) throws IOException{
		BufferedReader scan = new BufferedReader(new FileReader(file));
		ArrayList<Integer> tree = new ArrayList<>();
		String line = scan.readLine();
		tree.add(0);
		
		int amount = Integer.parseInt(line);
		for(int i = 0; i < amount; i++) {
			line = scan.readLine();
			if(line == "empty")
				tree.add(null);
			else
				tree.add(Integer.parseInt(line));
			
		}
		return tree;
	}
	
	public static void findNode(ArrayList<Integer> tree) {
		
	}

}
