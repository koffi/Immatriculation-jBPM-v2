package com.rca.immatriculation.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class InfoGeneral implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long id;
	private java.lang.String nif;
	private java.lang.String rcm;
	private java.lang.String npRs;
	private java.lang.String sigle;
	private java.util.Date datCreat;
	private java.lang.String lieuNais;
	private java.lang.String bp;
	private java.lang.String tel;
	private java.lang.String fax;
	private java.lang.String courriel;

	public InfoGeneral() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getNif() {
		return this.nif;
	}

	public void setNif(java.lang.String nif) {
		this.nif = nif;
	}

	public java.lang.String getRcm() {
		return this.rcm;
	}

	public void setRcm(java.lang.String rcm) {
		this.rcm = rcm;
	}

	public java.lang.String getNpRs() {
		return this.npRs;
	}

	public void setNpRs(java.lang.String npRs) {
		this.npRs = npRs;
	}

	public java.lang.String getSigle() {
		return this.sigle;
	}

	public void setSigle(java.lang.String sigle) {
		this.sigle = sigle;
	}

	public java.util.Date getDatCreat() {
		return this.datCreat;
	}

	public void setDatCreat(java.util.Date datCreat) {
		this.datCreat = datCreat;
	}

	public java.lang.String getLieuNais() {
		return this.lieuNais;
	}

	public void setLieuNais(java.lang.String lieuNais) {
		this.lieuNais = lieuNais;
	}

	public java.lang.String getBp() {
		return this.bp;
	}

	public void setBp(java.lang.String bp) {
		this.bp = bp;
	}

	public java.lang.String getTel() {
		return this.tel;
	}

	public void setTel(java.lang.String tel) {
		this.tel = tel;
	}

	public java.lang.String getFax() {
		return this.fax;
	}

	public void setFax(java.lang.String fax) {
		this.fax = fax;
	}

	public java.lang.String getCourriel() {
		return this.courriel;
	}

	public void setCourriel(java.lang.String courriel) {
		this.courriel = courriel;
	}

	public InfoGeneral(java.lang.Long id, java.lang.String nif,
			java.lang.String rcm, java.lang.String npRs,
			java.lang.String sigle, java.util.Date datCreat,
			java.lang.String lieuNais, java.lang.String bp,
			java.lang.String tel, java.lang.String fax,
			java.lang.String courriel) {
		this.id = id;
		this.nif = nif;
		this.rcm = rcm;
		this.npRs = npRs;
		this.sigle = sigle;
		this.datCreat = datCreat;
		this.lieuNais = lieuNais;
		this.bp = bp;
		this.tel = tel;
		this.fax = fax;
		this.courriel = courriel;
	}

}