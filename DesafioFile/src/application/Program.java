package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Produto> listProds = new ArrayList<>();

		String filePath = "C:\\temp\\dados.CSV";
		String fileOutput = "C:\\temp\\summary.CSV";

		try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
			String line = buffer.readLine();
			while (line != null) {
				String[] items = line.split(",");
				
				//Forma 1 => estanciar o produto e setar os atributos
				Produto prod = new Produto();
				prod.setName(items[0]);
				prod.setPrice(Double.parseDouble(items[1]));
				prod.setQuantity(Integer.parseInt(items[2]));
				
				listProds.add(prod);
				
				//Forma2 utilizando apenas 1 linha
				//listProds.add(new Produto(items[0], Double.parseDouble(items[1]), Integer.parseInt(items[2])));
				// System.out.println(line);
				line = buffer.readLine();
			}			
			try (BufferedWriter bufferWrite = new BufferedWriter(new FileWriter(fileOutput))) {
			
				for (Produto prod: listProds) {
					bufferWrite.write(prod.getName()  + "," + prod.total());
					bufferWrite.newLine();
				}
				
				System.out.println("Finalizado com sucesso....");	
			
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}	
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
