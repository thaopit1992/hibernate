package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cat {
	private Integer id;
	private String name;
	private Date date;
	private Boolean sex;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(Integer id, String name, Date date, Boolean sex) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.sex = sex;
	}

	@Id // khoa chinh
	@GeneratedValue // tu dong tang
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

}
