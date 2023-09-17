package com.example.model;

import com.example.entity.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.example.model.EmployeeSystem.operations;

class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException(String str) {
        super();
        System.out.println(str);
        EmployeeSystem.operations();
    }
}

public class EmployeeSystem {

    public static Map<Integer, Employee> map = new HashMap<Integer, Employee>();

    public static void addEmployee(String name, int age, int id) {
        Employee emp = new Employee(name, age, id);
        map.put(id, emp);

        operations();
    }

    public static void deleteEmployee(int EmpId) throws CustomException {
        if (map.containsKey(EmpId)) {
            map.remove(EmpId);
            System.out.println("Successfully Deleted from the List");
        } else {
            throw new CustomException("Not Found Exception");
        }

        operations();
    }

    public  static void searchEmployee(int EmpId) throws CustomException {
        if (map.containsKey(EmpId)) {
            System.out.println("Employee Details: - " + map.get(EmpId));
        } else {
            throw new CustomException("Not Found Exception");
        }

        operations();
    }

    public static void employeeList() {
        System.out.println(map.toString());
    }

    public static void operations() {
        System.out.println("\n******* Employee management system **********");
        System.out.println("1. Add Employee");
        System.out.println("2. Delete Employee");
        System.out.println("3. Search Employee");
        System.out.println("4. Employee List");

        Scanner scanner =  new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput==1) {
            System.out.println("Enter Employee Details(Name, age, Id)");

            String name = scanner.nextLine();
            int age = scanner.nextInt();
//            scanner.nextLine();
            int id = scanner.nextInt();

            if (!name.equals("") && age!=0 && id!=0) {
                addEmployee(name, age, id);
            }
        } else if (userInput==2) {
            System.out.println("Enter Employee Id");
            int EmpId = scanner.nextInt();
            try {
                deleteEmployee(EmpId);
            } catch (CustomException e) {
                e.printStackTrace();
            }
        } else if (userInput==3) {
            System.out.println("Enter Employee Id");
            int EmpId = scanner.nextInt();

            try {
                searchEmployee(EmpId);
            } catch (CustomException e) {
                e.printStackTrace();
            }

            operations();
        } else if (userInput==4) {
            employeeList();
            operations();
        }
    }

    public static void main(String[] args) {
        operations();
    }
}