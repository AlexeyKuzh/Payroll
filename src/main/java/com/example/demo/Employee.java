package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//Этот код нужен для опредиления сотрудника в сестеме
/*@Entity — это аннотация JPA, 
позволяющая подготовить этот объект к хранению в хранилище данных на основе JPA.*/
@Entity
public class Employee {
	/*
	 * как я понял, @GeneratedValue нужна для указания какая переменная будет ключом
	 * в таблице баз даных
	 */
	private @Id @GeneratedValue Long id;
	private String name;
	private String role;

	Employee() {
		/*
		 * Этот конструктор может быть полезен, когда вы создаете объект, но еще не
		 * имеете значений для его полей, и планируете установить их позже с
		 * использованием сеттеров или других методов.
		 */}

	Employee(String name, String role) {

		this.name = name;
		this.role = role;

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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)

			return true;

		if (!(o instanceof Employee))

			return false;

		Employee employee = (Employee) o;

		return Objects.equals(this.id, employee.id) 
				&& Objects.equals(this.name, employee.name)
				&& Objects.equals(this.role, employee.role);

	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.name, this.role);
	}

	@Override
	public String toString() {
		return "Employee [id=" + this.id + ", name=" + this.name + ", role=" + this.role + "]";
	}

}
