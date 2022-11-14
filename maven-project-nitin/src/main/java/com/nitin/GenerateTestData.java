package com.nitin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import com.github.javafaker.Faker;
import com.opencsv.CSVWriter;

public class GenerateTestData {
	public static void main(String[] args) throws IOException {
		Faker faker = new Faker();
		String id = String.valueOf(faker.number().randomDigit());
		String fName = faker.name().firstName();
		String lName = faker.name().lastName();
		String uName = faker.name().username();
		String eMail = faker.internet().emailAddress();
		String Avatar = faker.internet().avatar();
		String Dob = String.valueOf(faker.date().birthday());
		String Address = faker.address().fullAddress();
		String s1[] = {
				fName,
				lName,
				id,
				uName,
				eMail,
				Avatar,
				Dob,
				Address
		};
		CSVWriter w = new CSVWriter(new FileWriter("testdata\\users.csv", true));
		w.writeNext(s1, true);
		System.out.println("Data Entered");
		w.close();
		
	}
}
