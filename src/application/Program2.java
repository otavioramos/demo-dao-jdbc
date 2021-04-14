package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 7: department findById ===");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("\n=== TEST 8: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department dep : list) {
            System.out.println(dep);
        }

        System.out.println("\n=== TEST 9: department update ===");
        departmentDao.update(new Department(3, "Foods"));
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 10: department insert ===");
        Department newDept = new Department(null,"Softwares");
        departmentDao.insert(newDept);
        System.out.println("Inserted! New id = " + newDept.getId());

        System.out.println("\n=== TEST 11: department deleteById ===");
        departmentDao.deleteById(newDept.getId());
        System.out.println("Delete completed!");
    }
}
