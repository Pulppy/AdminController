package com.pulppy.user.actionTest;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.pulppy.user.bean.MusicDTO;
import com.pulppy.user.model.InteractiveAccount;
import com.pulppy.user.model.InteractiveMusic;

public class TestFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// -----------------------------------------------
		/*System.out.println("Enter Your Username");
		String username = sc.nextLine();

		System.out.println("Enter Your Password");
		String password = sc.nextLine();

		System.out.println("Enter Your Email");
		String email = sc.nextLine();

		sc.close();

		InteractiveAccount test = new InteractiveAccount();
		String a = test.createAccount(email, password, username);
		System.out.println(a);*/
		
		// -----------------------------------------------
		//		Create Music With DTO Music
		/*System.out.println("Enter Your Music Name");
		String musicName = sc.nextLine();

		System.out.println("Enter Your Image");
		String musicImage = sc.nextLine();

		System.out.println("Enter Your Link");
		String musicLink = sc.nextLine();
		
		System.out.println("Enter Your Album");
		String musicalbum = sc.nextLine();

		sc.close();
		
		InteractiveMusic testMusic = new InteractiveMusic();
		String a = testMusic.createMusic(musicName,musicImage,musicLink,musicalbum);
		System.out.println(a);*/
		
		// -----------------------------------------------
		//	Update Music With DTO Music
		/*MusicDTO music = new MusicDTO();
		music.setMusicID("AAA");
		music.setMusicName("Name");
		music.setMusicAlbum("Album");
		music.setMusicImage("Image");
		music.setMusicLink("Music Link");
		InteractiveMusic testMusic = new InteractiveMusic();
		try {
			testMusic.updateMusic(music);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/* DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); */
	}

}
