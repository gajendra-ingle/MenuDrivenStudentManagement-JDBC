package com.StudentManagementCRUD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentOp op = new StudentOp();

		while (true) {

			System.out.println("----------------------Student Management----------------------");
			System.out.println("1 - Add Student ");
			System.out.println("2 - Display Student ");
			System.out.println("3 - Search Student ");
			System.out.println("4 - Remove Student ");
			System.out.println("5 - Update Student ");
			System.out.println("6 - Exit ");

			System.out.print("\nEnter your choice : ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Student Id : ");
				int studentId = sc.nextInt();

				System.out.print("Enter Student Name :");
				String studentName = sc.next();

				System.out.print("Enter Student Age : ");
				int studentAge = sc.nextInt();

				System.out.print("Enter Student SGPA : ");
				double sgpa = sc.nextDouble();

				System.out.print("Enter Student Phone Number : ");
				String phNumber = sc.next();

				op.addStudent(studentId, studentName, studentAge, sgpa, phNumber);
				System.out.println("Student Successfully Added.");
				break;

			case 2:
				System.out.println("All Students : ");
				op.displayStudents();
				break;

			case 3:
				System.out.print("Enter Search Student Id : ");
				int searchId = sc.nextInt();
				op.findStudent(searchId);
				break;

			case 4:
				System.out.println("Enter student Id to remove ");
				int removeId = sc.nextInt();
				op.removeStudnet(removeId);
				break;

			case 5:
				System.out.print("Enter Student Id to update: ");
				int updateId = sc.nextInt();

				System.out.print("Enter New Student Name: ");
				String newName = sc.next();

				System.out.print("Enter New Student Age: ");
				int newAge = sc.nextInt();

				System.out.print("Enter New Student CGPA: ");
				double newSgpa = sc.nextDouble();

				System.out.print("Enter New Phone Number: ");
				String newPhoneNumber = sc.next();

				op.updateStudent(updateId, newName, newAge, newSgpa, newPhoneNumber);
				break;

			case 6:
				System.out.println("Exit Successfully");
				sc.close();
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice, Please enter correct option");
			}

		}
	}
}