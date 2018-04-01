package com.pulppy.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import com.pulppy.user.bean.AccountDTO;
import com.pulppy.user.connection.MySQLConnUtils;
import com.pulppy.user.template.TemplateFunction;

public class InteractiveAccount {

	/*
	 * Function Name : createAccount 
	 * Describe : Insert Account 
	 * Return: String
	 */
	public String createAccount(String email, String password, String username) {
		try {
			if (!username.equals(null) || !username.equals("") && !password.equals(null)
					|| !password.equals("") && !email.equals(null) || !email.equals("")) {
				String result = insertAccount(username, password, email);
				if (result == "true") {
					return "true";
				}
			} else {
				return "Data Input Wrong! Checking Data Input.";
			}
		} catch (Exception ex) {
			System.out.println("Exception Handle: " + ex.getMessage());
		}
		return "false";
	}

	/*
	 * Function Name : insertAccount 
	 * Describe : Check Duplicate ID and Insert
	 * Return Value: String
	 */
	private String insertAccount(String username, String password, String email)
			throws ClassNotFoundException, SQLException {
		// Insert Acc
		if (!username.equals(null) || !username.equals("") && !password.equals(null)
				|| !password.equals("") && !email.equals(null) || !email.equals("")) {
			// Query Duplicate ID
			String idGenerate = TemplateFunction.generateRandom();
			if (TemplateFunction.checkDuplicateID(idGenerate,"Account") == false) {
				String sql = "Insert into Account(id, username, email,passwords) values(?,?,?,?)";
				MySQLConnUtils sqlconn = new MySQLConnUtils();
				Connection conn = sqlconn.getMySQLConnection();
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, idGenerate);
				pstm.setString(2, username);
				pstm.setString(3, email);
				pstm.setString(4, password);

				pstm.executeUpdate();
				conn.close();
				pstm.close();
				return "true";
			}
		}
		return "false";
	}

}
