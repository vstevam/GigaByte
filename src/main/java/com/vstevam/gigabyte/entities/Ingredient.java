package com.vstevam.gigabyte.entities;

import java.io.Serializable;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author vstevam
 */
@Entity
@Table(name = "ingredient")
public class Ingredient implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue
	@Column
	private Long id;

	@Column
	private String description;

	@Column
	private Double price;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		return hash;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Ingredient other = (Ingredient) obj;
		if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
			return false;
		}
		if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
			return false;
		}
		if (this.price != other.price && (this.price == null || !this.price.equals(other.price))) {
			return false;
		}
		return true;
	}

}
