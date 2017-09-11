package com.leeheungki.generic;

public class News{
	String thumb;
	String name;
	String summary;
	
	public News(String thumb, String name, String summary) {
		super();
		this.thumb = thumb;
		this.name = name;
		this.summary = summary;
	}

	public String getThumb() {
		return thumb;
	}

	public void setThumb(String thumb) {
		this.thumb = thumb;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	
}
