package com.rca.immatriculation.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TypePersonne implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.String typPrsCode;
	private java.lang.String typPrsLibelle;

	public TypePersonne() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getTypPrsCode() {
		return this.typPrsCode;
	}

	public void setTypPrsCode(java.lang.String typPrsCode) {
		this.typPrsCode = typPrsCode;
	}

	public java.lang.String getTypPrsLibelle() {
		return this.typPrsLibelle;
	}

	public void setTypPrsLibelle(java.lang.String typPrsLibelle) {
		this.typPrsLibelle = typPrsLibelle;
	}

	public TypePersonne(java.lang.Long id, java.lang.String typPrsCode,
			java.lang.String typPrsLibelle) {
		this.id = id;
		this.typPrsCode = typPrsCode;
		this.typPrsLibelle = typPrsLibelle;
	}

}