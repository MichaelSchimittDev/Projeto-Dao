package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller find by id ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();
		
		System.out.println("=== TEST 2: Seller find by Department ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		System.out.println("=== TEST 3: Seller find by Department ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		//System.out.println();
		//System.out.println("=== TEST 4: Seller insert ===");
		//Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		//sellerDao.insert(newSeller);
		//System.out.println("Insert! New id = " + newSeller.getId());
		
		System.out.println();
		System.out.println("=== TEST 5: Seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("=== TEST 6: Seller delete ===");
		sellerDao.deleteById(10);
		System.out.println("Delete completed");
	}

}
