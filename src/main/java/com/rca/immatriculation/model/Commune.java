package com.rca.immatriculation.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Commune implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private SousPrefecture sousprefecture;
	private java.lang.String comCode;
	private java.lang.String comLibelle;

	public Commune() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getComCode() {
		return this.comCode;
	}

	public void setComCode(java.lang.String comCode) {
		this.comCode = comCode;
	}

	public java.lang.String getComLibelle() {
		return this.comLibelle;
	}

	public void setComLibelle(java.lang.String comLibelle) {
		this.comLibelle = comLibelle;
	}

	public com.rca.immatriculation.model.SousPrefecture getSousprefecture() {
		return this.sousprefecture;
	}

	public void setSousprefecture(
			com.rca.immatriculation.model.SousPrefecture sousprefecture) {
		this.sousprefecture = sousprefecture;
	}

	public Commune(java.lang.Long id,
			com.rca.immatriculation.model.SousPrefecture sousprefecture,
			java.lang.String comCode, java.lang.String comLibelle) {
		this.id = id;
		this.sousprefecture = sousprefecture;
		this.comCode = comCode;
		this.comLibelle = comLibelle;
	}

}