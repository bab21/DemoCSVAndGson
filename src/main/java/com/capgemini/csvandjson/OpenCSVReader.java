package com.capgemini.csvandjson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class OpenCSVReader {
	private static final String OBJECT_LIST = "./object-csv-file.csv";

	public static void main(String[] args) throws IOException {

		try (Reader reader = Files.newBufferedReader(Paths.get(OBJECT_LIST));) {
			
			CsvToBean<CSVUser> csvToBean=new CsvToBeanBuilder(reader).withType(CSVUser.class)
					.withIgnoreLeadingWhiteSpace(true)
					.build();

			Iterator<CSVUser> csvUserIterator = csvToBean.iterator();

			while (csvUserIterator.hasNext()) {
				CSVUser csvUser = csvUserIterator.next();
				System.out.println("Name : " + csvUser.getName());
				System.out.println("Email : " + csvUser.getEmail());
				System.out.println("PhoneNumber : " + csvUser.getPhoneNo());
				System.out.println("Country : " + csvUser.getCountry());
				System.out.println("**********************************");
			}

		}

	}
}
