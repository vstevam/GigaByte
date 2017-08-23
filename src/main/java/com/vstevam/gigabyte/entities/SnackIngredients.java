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
@Table(name = "snack_ingredients")
public class SnackIngredients implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id	
	@GeneratedValue
	@Column
	private Long id;

	@Column
	private Long idIngredient;


	@Column
	private Long idSnack;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the idIngredient
	 */
	public Long getIdIngredient() {
		return idIngredient;
	}

	/**
	 * @param idIngredient the idIngredient to set
	 */
	public void setIdIngredient(Long idIngredient) {
		this.idIngredient = idIngredient;
	}

	/**
	 * @return the idSnack
	 */
	public Long getIdSnack() {
		return idSnack;
	}

	/**
	 * @param idSnack the idSnack to set
	 */
	public void setIdSnack(Long idSnack) {
		this.idSnack = idSnack;
	}


}
