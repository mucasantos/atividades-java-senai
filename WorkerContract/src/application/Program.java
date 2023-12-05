package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entites.Department;
import entites.HourContract;
import entites.Worker;
import entites.enums.WorkerLevel;

public class Program {
	public static void main(String[] args) throws ParseException {

		// Formatar a minha data com o padrao que precisp
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Primeira parte => dados trabalhador
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre o nome do departamento:");
		String depName = sc.next();
		System.out.println("Digite as informações do trabalhador ==>");
		System.out.print("Nome:");
		String workerName = sc.next();
		System.out.print("Nível: (1-JUNIOR/2-MID_LEVEL/3-SENIOR");
		String workerLevel = sc.next();
		System.out.print("Salário Base:");
		Double workerBaseSalary = sc.nextDouble();

		// Instanciar o Worker
		WorkerLevel level = null;
		switch (workerLevel) {
		case "1":
			level = WorkerLevel.JUNIOR;
			break;
		case "2":
			level = WorkerLevel.MID_LEVEL;
			break;
		case "3":
			level = WorkerLevel.SENIOR;
			break;
		default:
			level = WorkerLevel.JUNIOR;
		}
		Worker worker = new Worker(workerName, level, workerBaseSalary, new Department(depName));

		// 2 Parte -> Pegar os contratos
		System.out.print("Quantos contratos deseja inserir?");
		int qtdContracts = sc.nextInt();

		for (int i = 1; i <= qtdContracts; i++) {
			System.out.println("Contrato #" + i + "Data:");
			System.out.print("Data(dd/mm/yyy");
			Date contractData = sdf.parse(sc.next());

			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();

			System.out.println("Horas trabalhadas: ");
			int hours = sc.nextInt();

			// Salvar o contrato e adicionar a lista do Worker
			HourContract contract = new HourContract(contractData, valuePerHour, hours);
			worker.addContract(contract);
		}
		// Mostrar o relatório com income(year, month)
		System.out.println();
		System.out.print("Digite o mês e o ano para calcular os ganhos (MM/YYYY): ");
		String dataIncome = sc.next();
		/*
		 * Calculo para retirar o mes e ano da data digitada pelo usuario
		 */
		int mes = Integer.parseInt(dataIncome.substring(0, 2));
		int ano = Integer.parseInt(dataIncome.substring(3));

		System.out.print("Nome: " + worker.getName());
		System.out.print("Departamento: " + worker.getDepartment().getName());
		System.out.print("Ganhos de " + dataIncome + ": " + String.format("%.2f", worker.income(ano, qtdContracts)));

		
		sc.close();
	}
}
