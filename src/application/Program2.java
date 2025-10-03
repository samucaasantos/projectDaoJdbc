package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: department findById=== ");
        Department department = departmentDao.findById(4);
        System.out.println(department);

        System.out.println("\n=== Test 2: department findAll === ");
        List<Department> departments = departmentDao.findAll();
        departments.forEach(System.out::println);

        System.out.println("\n=== Test 3: department insert === ");
        Department dep = new Department(null, "Toys");
        departmentDao.insert(dep);
        System.out.println("New department inserted! New department id: " + dep.getId());

        System.out.println("\n=== Test 4: department update === ");
        department = departmentDao.findById(6);
        department.setName("Kitchen");
        departmentDao.update(department);
        System.out.println("Department updated sucessfully!");

        System.out.println("\n=== Test 5: department delete === ");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Department deleted sucessfully!");



    }
}
