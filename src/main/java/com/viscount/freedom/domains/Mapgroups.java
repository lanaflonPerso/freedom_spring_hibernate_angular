package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Mapgroups generated by hbm2java
 */
@Entity
@Table(name = "mapgroups", schema = "public")
public class Mapgroups implements java.io.Serializable {

	private int id;
	private String name;

	public Mapgroups() {
	}

	public Mapgroups(int id) {
		this.id = id;
	}

	public Mapgroups(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
