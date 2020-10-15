package com.capgemini.csvandjson;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class OpenCSVWriter {
	private static final String OBJECT_LIST = "./object-csv-file.csv";

	public static void main(String[] args) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {

		try (Writer writer = Files.newBufferedWriter(Paths.get(OBJECT_LIST));) {

			StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer)
					.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
					.build();

			List<CSVUser> usersList = new ArrayList<>();
			usersList.add(new CSVUser("Babli", "bab@gmail.com", "9870009966", "India"));
			usersList.add(new CSVUser("Vidya", "vidya@gmail.com", "9433388773", "US"));

			beanToCsv.write(usersList);
			System.out.println(usersList.size());
		}
	}
}
