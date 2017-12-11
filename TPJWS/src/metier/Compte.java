package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable {
private Long code;
private double solde;

@XmlTransient
private Date datecreation;

public Compte() {
	super();
	// TODO Auto-generated constructor stub
}

public Compte(Long code, double solde, Date datecreation) {
	super();
	this.code = code;
	this.solde = solde;
	this.datecreation = datecreation;
}

public Long getCode() {
	return code;
}

public void setCode(Long code) {
	this.code = code;
}

public double getSolde() {
	return solde;
}

public void setSolde(double solde) {
	this.solde = solde;
}

public Date getDatecreation() {
	return datecreation;
}

public void setDatecreation(Date datecreation) {
	this.datecreation = datecreation;
}

}
