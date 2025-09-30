package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: seller findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("\n=== Test 3: seller findAll ====");
        sellers = sellerDao.findAll();
        for (Seller s : sellers) {
            System.out.println(s);
        }

        System.out.println("\n=== Test 4: seller findAll ====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("New seller inserted successfully! New seller ID: " + newSeller.getId());

        System.out.println("\n=== Test 4: seller findAll ====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Wayne");
        sellerDao.update(seller);
        System.out.println("Seller updated successfully!");
    }
}
