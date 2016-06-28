package net.spring.mongo.pojo;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cheshi")
public class LogTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8328342838329389184L;
	@Id
	private String id;
	private String name;
	private String password;
	 
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
