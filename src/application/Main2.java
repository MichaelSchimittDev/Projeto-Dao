package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Main2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test 1 Deparment Insert ===");
		Department newDepartment = new Department(null, "Foods");
		departmentDao.insert(newDepartment);
		System.out.println("Insert is Done! New Id: " + newDepartment.getId());
		
		System.out.println();
		System.out.println("=== Test 2 Department Update ===");
		

	}

}
