package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Department> list = new ArrayList<>();
		
		Department dep;
		
		String name;
		
		int id;
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Find By Id ===");
		
		System.out.print("Digite o Id do Departamento a ser apresentado: ");
		
		id = sc.nextInt();
		sc.nextLine();
		
		dep = departmentDao.findById(id);
		
		System.out.println(dep);
		
		System.out.println("----------------------");
		
		System.out.println("=== Find All ===");
		
		list = departmentDao.findAll();
		
		list.forEach(System.out::println);
		
		System.out.println("---------------------");
		
		System.out.println("=== Insert ===");
		
		System.out.print("Digite o nome do novo setor: ");
		
		name = sc.nextLine();
		
		dep = new Department(null, name);
		
		departmentDao.insert(dep);
		
		System.out.println("---------------------");
		
		list = departmentDao.findAll();
		
		list.forEach(System.out::println);
		
		System.out.println("---------------------");
		
		System.out.println("=== Update ===");
		
		System.out.print("Qual o Id do setor que será alterado: ");
		
		id = sc.nextInt();
		sc.nextLine();
		
		dep = departmentDao.findById(id);
		
		System.out.print("Digite o novo nome do departamento: ");
		
		name = sc.nextLine();
		
		dep.setName(name);
		
		departmentDao.update(dep);
		
		System.out.println("---------------------");
		
		list = departmentDao.findAll();
		
		list.forEach(System.out::println);
		
		System.out.println("---------------------");
		
		System.out.println("=== Delete Department ===");
		
		System.out.print("Id do departamento a ser excluído: ");
		
		id = sc.nextInt();
		
		departmentDao.deleteById(id);
		
		System.out.println("Operação concluída com sucesso!");
		
		System.out.println("-----------------------------");
				
		list = departmentDao.findAll();
		
		list.forEach(System.out::println);
		
		sc.close();
	}
}
