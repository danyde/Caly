package be.caly.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENT")
public class Client  implements Serializable{
	

	private static final long serialVersionUID = 7923228034150564829L;


	@Id
	@Column(name = "CLI_TEC_IDE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    @SequenceGenerator(name = "SEQ_GEN", allocationSize = 1, sequenceName = "SRC_FLE_SEQ")
	public Long id;

	
	@Column(name = "IDE_CLE_PK")
	public String clientIdentifierWithLGT;

	@Column(name = "DAT_DTE")
	public Date datadate;

	@Column(name = "ETY_CDE")
	public String entityCode;

	@Column(name = "LEG_ETY")
	public String legalEntity;

	@Column(name = "CLI_CUR")
	public String clientCurrency;
	

	@Column(name = "CLI_IDE")
	public String clientIdentifier;

	@Column(name = "GEO_RES_CRY_CDE")
	public String location;

	@Column(name = "CLI_TYP_FLG")
	public String clientType;

	@Column(name = "GRP_CLI_PCP")
	public String groupClient1;

	@Column(name = "GRP_CLI_SDY")
	public String groupClient2;

	@Column(name = "ACN_FLG")
	public String action;

	@Column(name = "MOD_DTE")
	public Date modificationDate;
	
	Client(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClientIdentifierWithLGT() {
		return clientIdentifierWithLGT;
	}

	public void setClientIdentifierWithLGT(String clientIdentifierWithLGT) {
		this.clientIdentifierWithLGT = clientIdentifierWithLGT;
	}

	public Date getDatadate() {
		return datadate;
	}

	public void setDatadate(Date datadate) {
		this.datadate = datadate;
	}

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getLegalEntity() {
		return legalEntity;
	}

	public void setLegalEntity(String legalEntity) {
		this.legalEntity = legalEntity;
	}

	public String getClientCurrency() {
		return clientCurrency;
	}

	public void setClientCurrency(String clientCurrency) {
		this.clientCurrency = clientCurrency;
	}

	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getGroupClient1() {
		return groupClient1;
	}

	public void setGroupClient1(String groupClient1) {
		this.groupClient1 = groupClient1;
	}

	public String getGroupClient2() {
		return groupClient2;
	}

	public void setGroupClient2(String groupClient2) {
		this.groupClient2 = groupClient2;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	public boolean isPMA(){
		if(this.clientType.equals(Boolean.TRUE)){
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

}
