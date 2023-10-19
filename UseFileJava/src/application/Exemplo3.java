package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo3 {

	public static void main(String[] args) {
		// a Partir do Java 7, temos o try-with-resources

		String filePath = "C:\\temp\\exemplo1.txt";

		try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
			String line = buffer.readLine();
			while (line != null) {
				System.out.println(line);
				line = buffer.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
