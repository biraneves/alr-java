package com.biraneves.bb.bank.test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("contas.csv"));
		
		while (scanner.hasNextLine()) {
			
			String line = scanner.nextLine();
//			System.out.println(line);
			
//			String[] values = line.split(",");
//			System.out.println(Arrays.toString(values));
			
			Scanner lineScanner = new Scanner(line);
			lineScanner.useLocale(Locale.US);
			lineScanner.useDelimiter(",");
			
			String accountType = lineScanner.next();
			int agency = lineScanner.nextInt();
			int accountNumber = lineScanner.nextInt();
			String accountHolder = lineScanner.next();
			double balance = lineScanner.nextDouble();
			
//			System.out.println(value1 + value2 + value3 + value4 + value5);
			
			System.out.format(new Locale("pt", "br"),"%s: agency %d, acc. number %d - %-18s - balance: $%,10.2f%n", accountType,
					agency, accountNumber, accountHolder, balance);
			
			lineScanner.close();
			
		}
		
		scanner.close();

	}

}
