package com.rca.immatriculation.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Banque implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.String banqCode;
	private java.lang.String banqLibelle;

	public Banque() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getBanqCode() {
		return this.banqCode;
	}

	public void setBanqCode(java.lang.String banqCode) {
		this.banqCode = banqCode;
	}

	public java.lang.String getBanqLibelle() {
		return this.banqLibelle;
	}

	public void setBanqLibelle(java.lang.String banqLibelle) {
		this.banqLibelle = banqLibelle;
	}

	public Banque(java.lang.Long id, java.lang.String banqCode,
			java.lang.String banqLibelle) {
		this.id = id;
		this.banqCode = banqCode;
		this.banqLibelle = banqLibelle;
	}

}