package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
						
		List<Seller> list = new ArrayList<>();
		
		System.out.println("=== TEST 1: Seller Delete ===");
		
		System.out.print("Digite o vendedor que será excluído: ");
		
		int id = sc.nextInt();
		
		sellerDao.deleteById(id);
		
		System.out.println("\nVendedor deletado com sucesso!");
		
		System.out.println("=== TEST 2: Seller Find All ===");

		list = sellerDao.findAll();

		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
}
