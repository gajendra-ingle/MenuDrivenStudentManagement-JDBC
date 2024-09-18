package com.StudentManagementCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentOp {

	public void addStudent(int studentId, String studentName, int studentAge, double sgpa, String phNumber) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "INSERT INTO Students (studentId, studentName, studentAge, sgpa, phNumber) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, studentId);
			stmt.setString(2, studentName);
			stmt.setInt(3, studentAge);
			stmt.setDouble(4, sgpa);
			stmt.setString(5, phNumber);

			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void displayStudents() {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT * FROM Students";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("studentId"));
				System.out.println("Name: " + rs.getString("studentName"));
				System.out.println("Age: " + rs.getInt("studentAge"));
				System.out.println("CGPA: " + rs.getDouble("sgpa"));
				System.out.println("Phone Number: " + rs.getString("phNumber"));
				System.out.println("-------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void findStudent(int searchId) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "SELECT * FROM Students WHERE studentId = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, searchId);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				System.out.println("ID: " + rs.getInt("studentId"));
				System.out.println("Name: " + rs.getString("studentName"));
				System.out.println("Age: " + rs.getInt("studentAge"));
				System.out.println("CGPA: " + rs.getDouble("sgpa"));
				System.out.println("Phone Number: " + rs.getString("phNumber"));
			} else {
				System.out.println("Student not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void removeStudnet(int removeId) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "DELETE FROM Students WHERE studentId = ?";
			PreparedStatement stmt = conn.prepareStatement(query);
			stmt.setInt(1, removeId);

			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Student removed successfully.");
			} else {
				System.out.println("Student not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateStudent(int studentId, String newName, int newAge, double newSgpa, String newPhoneNumber) {
		try (Connection conn = DatabaseConnection.getConnection()) {
			String query = "UPDATE Students SET studentName = ?, studentAge = ?, sgpa = ?, phNumber = ? WHERE studentId = ?";
			PreparedStatement stmt = conn.prepareStatement(query);

			stmt.setString(1, newName); // New Name
			stmt.setInt(2, newAge); // New Age
			stmt.setDouble(3, newSgpa); // New SGPA
			stmt.setString(4, newPhoneNumber); // New Phone Number
			stmt.setInt(5, studentId); // Where studentId matches

			int rowsAffected = stmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Student details updated successfully.");
			} else {
				System.out.println("Student not found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}