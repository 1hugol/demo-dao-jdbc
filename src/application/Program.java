package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
				
		SellerDao sellerDao = DaoFactory.createSellerDao();
						
		List<Seller> list = new ArrayList<>();
						
		System.out.println("=== TEST 1: Seller Update ===");
		
		Seller seller = sellerDao.findById(1);
		seller.setEmail("marthawaine@gmail.com");
		sellerDao.update(seller);
		System.out.println("UPDATE COMPLETED!");
		
		System.out.println("=== TEST 2: Seller Find All ===");

		list = sellerDao.findAll();

		for(Seller obj : list) {
			System.out.println(obj);
		}
	}
}
