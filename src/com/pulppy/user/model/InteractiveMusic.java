package com.pulppy.user.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pulppy.user.bean.MusicDTO;
import com.pulppy.user.connection.MySQLConnUtils;
import com.pulppy.user.template.TemplateFunction;

public class InteractiveMusic {
	/*
	 * Function Name : createMusic Describe : Insert Music Return: String
	 */
	public String createMusic(String musicName, String musicImage, String musicLink, String musicAlbum) {
		try {
			if (musicName != null && !musicName.isEmpty() && musicImage != null && !musicImage.isEmpty()
					&& musicLink != null && !musicLink.isEmpty() && musicAlbum != null && !musicAlbum.isEmpty()) {
				String result = insertMusic(musicName, musicImage, musicLink, musicAlbum);
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
	 * Function Name : insertAccount Describe : Check Duplicate ID and Insert
	 * Return Value: String
	 */
	private String insertMusic(String musicName, String musicImage, String musicLink, String musicAlbum)
			throws ClassNotFoundException, SQLException {
		// Insert Acc
		// str != null && !str.isEmpty()
		if (musicName != null && !musicName.isEmpty() && musicImage != null && !musicImage.isEmpty()
				&& musicLink != null && !musicLink.isEmpty() && musicAlbum != null && !musicAlbum.isEmpty()) {
			// Query Duplicate ID
			String idGenerate = TemplateFunction.generateRandom();
			if (TemplateFunction.checkDuplicateID(idGenerate, "Music") == false) {
				String sql = "Insert into Music(id, musicName, musicImage,musicLink,musicAlbum) values(?,?,?,?,?)";
				MySQLConnUtils sqlconn = new MySQLConnUtils();
				Connection conn = sqlconn.getMySQLConnection();
				PreparedStatement pstm = conn.prepareStatement(sql);
				pstm.setString(1, idGenerate);
				pstm.setString(2, musicName);
				pstm.setString(3, musicImage);
				pstm.setString(4, musicLink);
				pstm.setString(5, musicAlbum);

				pstm.executeUpdate();
				conn.close();
				pstm.close();
				return "true";
			}
		}
		return "false";
	}

	public boolean updateMusic(MusicDTO music) throws SQLException, ClassNotFoundException {
		String sql = "Update Music set musicName =?, musicImage=?, musicLink=?,musicAlbum=? where id=? ";
		
		MySQLConnUtils sqlconn = new MySQLConnUtils();
		Connection conn = sqlconn.getMySQLConnection();
		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, music.getMusicName());
		pstm.setString(2, music.getMusicImage());
		pstm.setString(3, music.getMusicLink());
		pstm.setString(4, music.getMusicAlbum());
		pstm.setString(5, music.getMusicID());
		pstm.executeUpdate();
		conn.close();
		pstm.close();

		return false;
	}
}
