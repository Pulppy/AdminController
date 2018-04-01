package com.pulppy.user.bean;

public class MusicDTO {
	private String musicID;
	private String musicName;
	private String musicImage;
	private String musicLink;
	private String musicAlbum;

	public String getMusicID() {
		return musicID;
	}

	public void setMusicID(String musicID) {
		this.musicID = musicID;
	}

	public String getMusicName() {
		return musicName;
	}

	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}

	public String getMusicImage() {
		return musicImage;
	}

	public void setMusicImage(String musicImage) {
		this.musicImage = musicImage;
	}

	public String getMusicLink() {
		return musicLink;
	}

	public void setMusicLink(String musicLink) {
		this.musicLink = musicLink;
	}

	public String getMusicAlbum() {
		return musicAlbum;
	}

	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}

	public MusicDTO(String musicID, String musicName, String musicImage, String musicLink, String musicAlbum) {
		super();
		this.musicID = musicID;
		this.musicName = musicName;
		this.musicImage = musicImage;
		this.musicLink = musicLink;
		this.musicAlbum = musicAlbum;
	}

	public MusicDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
