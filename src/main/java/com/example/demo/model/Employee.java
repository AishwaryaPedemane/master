package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NamedNativeQueries;
import org.hibernate.annotations.NamedNativeQuery;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Entity
@Getter
@EqualsAndHashCode
@Table( name = "Employee" )
//@NamedQuery(name = "Employee.findById",
//query = "select name, team_Name from Employee e where e.Id = ?1")
public class Employee  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	

	  @NotNull(message = "Empolyee name")
	  @Size(min = 3, max = 140, message = "Unable to post the data to database")
	  @EmployeeName
	  @Column(name="name")
	  private String name;
	 
	  @NotNull(message = "email of the employee")
	  @Size(min = 5, max = 140, message = "Email cannot be empty")
	  @Column(name="email")
	  private String email;
	
	    @NotNull(message = "Team name of the employee")
	    @Size(min = 5, max = 500, message = "Team name is mandatory")
		@Column(name="teamName")
	    private String teamName;
	    public Employee(int id, String name){
	        // set
	     }

	   public int getId() {
		   System.out.println(id);
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
	       System.out.println(name);

		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
	       System.out.println(email);

		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeamName() {
	       System.out.println(teamName);

		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	 public Employee() {
		 super();
	 }

	  
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", teamName=" + teamName + "]";
	}
	public Employee(int id, String name, String email, String teamName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.teamName = teamName;
    }

	public Employee(int id, String name, String teamName) {
		// TODO Auto-generated constructor stub
		    this.id = id;
	        this.name = name;
	        this.teamName = teamName;

	}

}
