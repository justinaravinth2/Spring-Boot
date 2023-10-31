package com.javatpoint.server.main.model;





import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="boys")
public class Boys {
	
	@Id
	private int sno;
	private String name;
	private int age;
	
	@OneToOne(targetEntity = Scores.class,cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="sno")
	private Scores scores;
	
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Scores getScores() {
		return scores;
	}
	public void setScores(Scores scores) {
		this.scores = scores;
	}
	public Boys(int sno, String name, int age,Scores scores) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
		this.scores = scores;
	}
	public Boys() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
