package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cameras generated by hbm2java
 */
@Entity
@Table(name = "cameras", schema = "public")
public class Cameras implements java.io.Serializable {

	private String cameraid;
	private String description;
	private String datasourcename;
	private String videosize;
	private Long framerate;
	private Long bitsperpixel;
	private String outputdirectory;

	public Cameras() {
	}

	public Cameras(String cameraid) {
		this.cameraid = cameraid;
	}

	public Cameras(String cameraid, String description, String datasourcename, String videosize, Long framerate,
			Long bitsperpixel, String outputdirectory) {
		this.cameraid = cameraid;
		this.description = description;
		this.datasourcename = datasourcename;
		this.videosize = videosize;
		this.framerate = framerate;
		this.bitsperpixel = bitsperpixel;
		this.outputdirectory = outputdirectory;
	}

	@Id

	@Column(name = "cameraid", unique = true, nullable = false, length = 20)
	public String getCameraid() {
		return this.cameraid;
	}

	public void setCameraid(String cameraid) {
		this.cameraid = cameraid;
	}

	@Column(name = "description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "datasourcename", length = 100)
	public String getDatasourcename() {
		return this.datasourcename;
	}

	public void setDatasourcename(String datasourcename) {
		this.datasourcename = datasourcename;
	}

	@Column(name = "videosize", length = 50)
	public String getVideosize() {
		return this.videosize;
	}

	public void setVideosize(String videosize) {
		this.videosize = videosize;
	}

	@Column(name = "framerate")
	public Long getFramerate() {
		return this.framerate;
	}

	public void setFramerate(Long framerate) {
		this.framerate = framerate;
	}

	@Column(name = "bitsperpixel")
	public Long getBitsperpixel() {
		return this.bitsperpixel;
	}

	public void setBitsperpixel(Long bitsperpixel) {
		this.bitsperpixel = bitsperpixel;
	}

	@Column(name = "outputdirectory", length = 100)
	public String getOutputdirectory() {
		return this.outputdirectory;
	}

	public void setOutputdirectory(String outputdirectory) {
		this.outputdirectory = outputdirectory;
	}

}
