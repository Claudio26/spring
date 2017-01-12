package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="departaments")
public class Departament {
	@Id @GeneratedValue
	private Long id;
	@Column(length =50)
	private String name;
	@Column(length =20)
	private int departamentId;
	@Column(length =50)
	private String budget;
	@Column(length =50)
	private String stardate;
	@Column(length =50)
	private String instructor;
	
	
	public Departament(String name, int departamentId,String budget,String stardate, String instructor) {
		super();
		this.name =name;
		this.departamentId = departamentId;
		this.budget=budget;
		this.stardate=stardate;
		this.instructor=instructor;
	}
	
	public Departament() {
		this("",0,"","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartamentId() {
		return departamentId;
	}

	public void setDepartamentId(int departamentId) {
		this.departamentId = departamentId;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	public String getStardate() {
		return stardate;
	}

	public void setStardate(String stardate) {
		this.stardate = stardate;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Departament [id=" + id + ", name=" + name + ", departamentId=" + departamentId + ", budget=" + budget + ",stardate=" +stardate+ ",stardate=" +instructor+  "]";
	}
	
}
