package entites;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department department;

	// No construtor não vou incluir a lista!!
	// A minha lista tem q ser iniciada com uma lista vazia!
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	// Income(int ano, int mes)-< retorna o salarioBase + os valores de contrato!

	public double income(int year, int month) {
		double sum = baseSalary;
		// Calendar
		Calendar calendar = Calendar.getInstance();

		for (HourContract contract : contracts) {
			// Peguei a data do contrato e setei o calendar pra ele
			calendar.setTime(contract.getDate());
			int yearContract = calendar.get(Calendar.YEAR);
			int monthContract = 1 + calendar.get(Calendar.MONTH);
			
			if(yearContract == year && monthContract == month) {
				sum = sum + contract.totalValue();
			}	
		}

		return sum;

	}

}
