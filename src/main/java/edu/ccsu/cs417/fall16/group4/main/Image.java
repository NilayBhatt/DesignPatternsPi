package edu.ccsu.cs417.fall16.group4.main;

import java.util.Date;
import java.util.Objects;

public class Image {
	
	private String name;
	private Date created_at;

	public Image(String name) {
		this.setName(name);
		this.created_at = new Date();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public Date getCreatedAt() {
		
		return this.created_at;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(this.name, this.created_at);
	}
	
	@Override
	public boolean equals(Object image) {
		
		return false;
		
	}
}
