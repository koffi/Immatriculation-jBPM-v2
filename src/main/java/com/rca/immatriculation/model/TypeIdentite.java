package com.rca.immatriculation.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TypeIdentite implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.String typIdentiteCode;
	private java.lang.String typIdentiteLibelle;

	public TypeIdentite() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getTypIdentiteCode() {
		return this.typIdentiteCode;
	}

	public void setTypIdentiteCode(java.lang.String typIdentiteCode) {
		this.typIdentiteCode = typIdentiteCode;
	}

	public java.lang.String getTypIdentiteLibelle() {
		return this.typIdentiteLibelle;
	}

	public void setTypIdentiteLibelle(java.lang.String typIdentiteLibelle) {
		this.typIdentiteLibelle = typIdentiteLibelle;
	}

	public TypeIdentite(java.lang.Long id, java.lang.String typIdentiteCode,
			java.lang.String typIdentiteLibelle) {
		this.id = id;
		this.typIdentiteCode = typIdentiteCode;
		this.typIdentiteLibelle = typIdentiteLibelle;
	}

}