package com.pulppy.user.template;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import java.sql.PreparedStatement;
import com.pulppy.user.connection.MySQLConnUtils;

public class TemplateFunction {

	/*
	 * Function Name : generateRandom 
	 * Describe : Generate ID 
	 * Return: String ID
	 */

	public static String generateRandom() {
		String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; // 36 letter.
		Random rand = new Random();
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < 17; i++) {
			int randIndex = rand.nextInt(aToZ.length());
			res.append(aToZ.charAt(randIndex));
		}
		return res.toString();
	}

	/*
	 * Function Name : generateRandom 
	 * Describe : Generate ID 
	 * Return: String ID
	 */
	public static boolean checkDuplicateID(String Id) throws ClassNotFoundException, SQLException {
		if (!Id.equals(null) || Id.equals("")) {
			String query = "Select * from Account Where id=? ";
			MySQLConnUtils sqlconn = new MySQLConnUtils();
			Connection conn = sqlconn.getMySQLConnection();
			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setString(1, Id);
			ResultSet rs = pstm.executeQuery();
			if (rs.next()) {
				System.out.println("Trung ID");
				conn.close();
				pstm.close();
				return true;
			} else {
				System.out.println("Ko co ID Trung");
				conn.close();
				pstm.close();
				return false;
			}
		}
		return true;
	}
}
