package com.nitin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.github.javafaker.File;
import com.mifmif.common.regex.util.Iterator;
import com.opencsv.CSVWriter;

public class SortTestdata {
	
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		try {
	         BufferedReader br = new BufferedReader(new FileReader("testdata\\users.csv"));
	         String line = "";
	         while((line = br.readLine()) != null) {
	        	String result = line.replaceAll("\"", "");
	        	list.add(line);
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
		Collections.sort(list);
		List<String[]> mylist = new ArrayList<String[]>();
		String[] arr = new String[list.size()];
		for(int i=0;i<list.size();i++) {
			arr = list.get(i).split(",");
			mylist.add(arr);
		}
		CSVWriter w = new CSVWriter(new FileWriter("testdata\\Users-sorted-Alphabatically.csv"));
		w.writeAll(mylist);
		
		w.flush();
	}	
}
