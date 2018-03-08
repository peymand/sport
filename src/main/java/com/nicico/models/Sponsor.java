package com.nicico.models;

import javax.persistence.*;

@Entity
public class Sponsor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true)
	private int id;

	private String name;

	private String phone;

	private String email;
	@OneToOne(mappedBy = "sponsor")
	private Project project;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getId() {

		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sponsor() {
	}

	public Sponsor(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Sponsor [name=" + name + ", phone=" + phone + ", email="
				+ email + "]";
	}

}
