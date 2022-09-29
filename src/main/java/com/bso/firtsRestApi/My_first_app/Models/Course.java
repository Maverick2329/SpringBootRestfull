package com.bso.firtsRestApi.My_first_app.Models;

public class Course {
	private long id;
	private String name;
	private String author;
	
	public Course(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
}
