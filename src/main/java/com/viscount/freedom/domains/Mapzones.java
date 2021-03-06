package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Mapzones generated by hbm2java
 */
@Entity
@Table(name = "mapzones", schema = "public")
public class Mapzones implements java.io.Serializable {

	private long id;
	private Maps maps;
	private Integer x;
	private Integer y;
	private String zoneid;
	private String status;

	public Mapzones() {
	}

	public Mapzones(long id, Maps maps) {
		this.id = id;
		this.maps = maps;
	}

	public Mapzones(long id, Maps maps, Integer x, Integer y, String zoneid, String status) {
		this.id = id;
		this.maps = maps;
		this.x = x;
		this.y = y;
		this.zoneid = zoneid;
		this.status = status;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mapid", nullable = false)
	public Maps getMaps() {
		return this.maps;
	}

	public void setMaps(Maps maps) {
		this.maps = maps;
	}

	@Column(name = "x")
	public Integer getX() {
		return this.x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	@Column(name = "y")
	public Integer getY() {
		return this.y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Column(name = "zoneid", length = 200)
	public String getZoneid() {
		return this.zoneid;
	}

	public void setZoneid(String zoneid) {
		this.zoneid = zoneid;
	}

	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
