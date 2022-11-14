package com.nitin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GetUserDetail {
	public static void main(String[] args) throws IOException {
		String resultRow = "";
	    BufferedReader br = new BufferedReader(new FileReader("testdata\\users.csv"));
	    String line;
	    Scanner kb = new Scanner(System.in);
	    System.out.println("Enter user 'Id'");
	    int id = kb.nextInt();
	    while ( (line = br.readLine()) != null ) {
	        String[] values = line.split(",");
	        if(Integer.parseInt(values[2].replaceAll("\"", ""))==id) {
	        	resultRow = line;
	            break;
	        }
	    }
	    br.close();
        System.out.println(resultRow);

	}
}
