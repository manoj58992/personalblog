package com.dto;

public class BlogDto {
	private String title;
	private String summary;
	private String sharing;
	private String bio;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSharing() {
		return sharing;
	}

	public void setSharing(String sharing) {
		this.sharing = sharing;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "BlogDto [title=" + title + ", summary=" + summary + ", sharing=" + sharing + ", bio=" + bio + "]";
	}

}
