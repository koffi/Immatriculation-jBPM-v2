package com.rca.immatriculation.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Famille implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.String fmlCode;
	private java.lang.String fmlLibelle;

	public Famille() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getFmlCode() {
		return this.fmlCode;
	}

	public void setFmlCode(java.lang.String fmlCode) {
		this.fmlCode = fmlCode;
	}

	public java.lang.String getFmlLibelle() {
		return this.fmlLibelle;
	}

	public void setFmlLibelle(java.lang.String fmlLibelle) {
		this.fmlLibelle = fmlLibelle;
	}

	public Famille(java.lang.Long id, java.lang.String fmlCode,
			java.lang.String fmlLibelle) {
		this.id = id;
		this.fmlCode = fmlCode;
		this.fmlLibelle = fmlLibelle;
	}

}