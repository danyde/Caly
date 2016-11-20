package be.caly.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product  implements Serializable {
	

	private static final long serialVersionUID = 2989258062279506879L;

	@Id
	@Column(name = "PRT_TEC_IDE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
    @SequenceGenerator(name = "SEQ_GEN", allocationSize = 1, sequenceName = "SRC_FLE_SEQ")
	public Long id;

	@Column(name = "PRT_IDE")
	public String productIdentifier;

	@Column(name = "CLI_IDE")
	public String clientIdentifier;

	@Column(name = "AUS_IDE")
	public String autoIdentifier;

	@Column(name = "DAT_DTE")
	public Date dataDate;

	@Column(name = "TLK_CDE")
	public String telekursCode;

	@Column(name = "SEC_ISN_CDE")
	public String codeIsin;

	@Column(name = "ACC_NBR_IDE")
	public String accountNumber;

	@Column(name = "SEC_NME")
	public String secuName;

	
	@Column(name = "NOM_CUR")
	public String nominalCurrency;
	
	@Column(name = "FRN_OFF_DEA_IDE")
	public String frontOfficeId;

	@Column(name = "BCK_OFF_DEA_IDE")
	public String backOfficeId;

	@Column(name = "UDL_TLK_CDE")
	public String udlTldCde;

	@Column(name = "UDL_ISN_CDE")
	public String udlIsnCde;

	@Column(name = "UDL_NME")
	public String udlName;

	@Column(name = "UDL_TYP_DES_LAB")
	public String udltypdeslab;

	@Column(name = "LAS_UDL_CLN_PRI")
	public String lasudflCln;

	@Column(name = "UDL_CUR")
	public String udlCurreny;

	@Column(name = "FAM_PRT_TYP_CDE")
	public String famprtTyp;

	@Column(name = "PRT_TYP_CDE")
	public String famprtCde;

	@Column(name = "ASS_TYP_DES_LAB")
	public String assType;

	@Column(name = "STC_PRT_FLG")
	public String stcPrtFlg;

	@Column(name = "STC_PRT_NME")
	public String stcPrtName;

	@Column(name = "HDG_FND_FLG")
	public String hdgFndFlag;

	@Column(name = "VAL_DTE")
	public Date valDate;

	@Column(name = "MAT_DTE")
	public Date matarutyDate;

	@Column(name = "RTG_SNP")
	public String rateSnp;

	@Column(name = "RTG_FCH")
	public String rateFch;

	@Column(name = "RTG_MDY")
	public String rateMdy;

	@Column(name = "GAR_FND_PCT")
	public String garFndPct;

	@Column(name = "CNT_AMT")
	public String cntAmount;

	@Column(name = "CNT_SZE")
	public String cntSize;

	@Column(name = "SRK_AMT")
	public BigDecimal srkAmount;

	@Column(name = "FAC_SQU_VAL")
	public BigDecimal facVal;


	@Column(name="FRG_CUR_NOM_AMT", nullable = true, unique = false, scale = 15, precision = 15)
	public BigDecimal frgCurrenyAmount;

	@Column(name = "FRG_CUR")
	public String frgCurreny;

	@Column(name = "DMC_CUR")
	public String dmcCurreny;

	@Column(name = "UPR_LIM_AMT")
	public BigDecimal upperLimitAmount;

	@Column(name = "LWR_LIM_AMT")
	public BigDecimal lowerLimitAmount;

	@Column(name = "ORN_PRD_AMT")
	public BigDecimal ornAmount;

	@Column(name = "GAT_AMT")
	public BigDecimal gatAmount;

	@Column(name = "LVG_VAL")
	public BigDecimal lvgValue;

	@Column(name = "PUT_CLD_IND")
	public String putCld;

	@Column(name = "EXE_TYP")
	public String exerciceType;

	@Column(name = "TOT_HLD_QTE")
	public BigDecimal totalHld;

	@Column(name = "LTS_AVB_PRI")
	public BigDecimal ltsBri;

	@Column(name = "ORI_MKT_VAL_AMT")
	public BigDecimal oriMktAmount;

	@Column(name = "MTN_ORN_AMT")
	public BigDecimal mntOrn;

	@Column(name = "MTN_CUR")
	public String mntCurrency;

	@Column(name = "CRY_WGT_IDX")
	public Integer cryWigt;

	@Column(name = "COL_FLG")
	public String colFlag;

	@Column(name = "MKT_TYP_CDE")
	public String marketType;

	@Column(name = "SEC_EXM_WGT_PCT")
	public BigDecimal secPct;

	@Column(name = "IMR_PCT")
	public BigDecimal imrPct;

	@Column(name = "SEC_WGT_PCT")
	public BigDecimal secWgtPct;

	@Column(name = "LTV_20")
	public BigDecimal ltv20;

	@Column(name = "LTV_100")
	public BigDecimal ltv100;

	@Column(name = "PCE_PCP_ATY")
	public String pcePcpAty;

	@Column(name = "CRY_RTG")
	public BigDecimal cryRating;

	@Column(name = "CAT_DES_LAB")
	public String catDesLab;

	@Column(name = "ATY_DES_LAB")
	public String atyDesLab;

	@Column(name = "SER_DES_LAB")
	public String serDesLab;

	@Column(name = "SUB_SER_NME")
	public String subSerName;

	@Column(name = "CAP_STK_EXG_AMT")
	public BigDecimal capAmount;

	@Column(name = "CAP_STK_EXG_CAT")
	public String capCategory;

	@Column(name = "AVG_DAI_TRN")
	public Integer avgDai;

	@Column(name = "SEC_RTG_VAL")
	public String secRatingVal;

	@Column(name = "RTE_FNL")
	public Integer rteFnl;

	@Column(name = "BND_SPL_FLG")
	public String bndFlag;

	@Column(name = "BND_INO_FLG")
	public String inoFlag;

	@Column(name = "BND_RFN_FLG")
	public String rfnFlag;

	@Column(name = "BDM_BND_FLG")
	public String bdmFlag;

	@Column(name = "SUS_SHE_FLG")
	public String susFlag;

	@Column(name = "FLG_DVS")
	public String dvsFlag;

	@Column(name = "ORN_APL_NME")
	public String originApplication;

	@Column(name = "ACN_FLG")
	public String action;

	@Column(name = "MOD_DTE")
	public Date modificationDate;
	
	
	public Product(){
		
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductIdentifier() {
		return productIdentifier;
	}

	public void setProductIdentifier(String productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	public String getClientIdentifier() {
		return clientIdentifier;
	}

	public void setClientIdentifier(String clientIdentifier) {
		this.clientIdentifier = clientIdentifier;
	}

	public String getAutoIdentifier() {
		return autoIdentifier;
	}

	public void setAutoIdentifier(String autoIdentifier) {
		this.autoIdentifier = autoIdentifier;
	}

	public Date getDataDate() {
		return dataDate;
	}

	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}

	public String getTelekursCode() {
		return telekursCode;
	}

	public void setTelekursCode(String telekursCode) {
		this.telekursCode = telekursCode;
	}

	public String getCodeIsin() {
		return codeIsin;
	}

	public void setCodeIsin(String codeIsin) {
		this.codeIsin = codeIsin;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSecuName() {
		return secuName;
	}

	public void setSecuName(String secuName) {
		this.secuName = secuName;
	}

	public String getNominalCurrency() {
		return nominalCurrency;
	}

	public void setNominalCurrency(String nominalCurrency) {
		this.nominalCurrency = nominalCurrency;
	}

	public String getFrontOfficeId() {
		return frontOfficeId;
	}

	public void setFrontOfficeId(String frontOfficeId) {
		this.frontOfficeId = frontOfficeId;
	}

	public String getBackOfficeId() {
		return backOfficeId;
	}

	public void setBackOfficeId(String backOfficeId) {
		this.backOfficeId = backOfficeId;
	}

	public String getUdlTldCde() {
		return udlTldCde;
	}

	public void setUdlTldCde(String udlTldCde) {
		this.udlTldCde = udlTldCde;
	}

	public String getUdlIsnCde() {
		return udlIsnCde;
	}

	public void setUdlIsnCde(String udlIsnCde) {
		this.udlIsnCde = udlIsnCde;
	}

	public String getUdlName() {
		return udlName;
	}

	public void setUdlName(String udlName) {
		this.udlName = udlName;
	}

	public String getUdltypdeslab() {
		return udltypdeslab;
	}

	public void setUdltypdeslab(String udltypdeslab) {
		this.udltypdeslab = udltypdeslab;
	}

	public String getLasudflCln() {
		return lasudflCln;
	}

	public void setLasudflCln(String lasudflCln) {
		this.lasudflCln = lasudflCln;
	}

	public String getUdlCurreny() {
		return udlCurreny;
	}

	public void setUdlCurreny(String udlCurreny) {
		this.udlCurreny = udlCurreny;
	}

	public String getFamprtTyp() {
		return famprtTyp;
	}

	public void setFamprtTyp(String famprtTyp) {
		this.famprtTyp = famprtTyp;
	}

	public String getFamprtCde() {
		return famprtCde;
	}

	public void setFamprtCde(String famprtCde) {
		this.famprtCde = famprtCde;
	}

	public String getAssType() {
		return assType;
	}

	public void setAssType(String assType) {
		this.assType = assType;
	}

	public String getStcPrtFlg() {
		return stcPrtFlg;
	}

	public void setStcPrtFlg(String stcPrtFlg) {
		this.stcPrtFlg = stcPrtFlg;
	}

	public String getStcPrtName() {
		return stcPrtName;
	}

	public void setStcPrtName(String stcPrtName) {
		this.stcPrtName = stcPrtName;
	}

	public String getHdgFndFlag() {
		return hdgFndFlag;
	}

	public void setHdgFndFlag(String hdgFndFlag) {
		this.hdgFndFlag = hdgFndFlag;
	}

	public Date getValDate() {
		return valDate;
	}

	public void setValDate(Date valDate) {
		this.valDate = valDate;
	}

	public Date getMatarutyDate() {
		return matarutyDate;
	}

	public void setMatarutyDate(Date matarutyDate) {
		this.matarutyDate = matarutyDate;
	}

	public String getRateSnp() {
		return rateSnp;
	}

	public void setRateSnp(String rateSnp) {
		this.rateSnp = rateSnp;
	}

	public String getRateFch() {
		return rateFch;
	}

	public void setRateFch(String rateFch) {
		this.rateFch = rateFch;
	}

	public String getRateMdy() {
		return rateMdy;
	}

	public void setRateMdy(String rateMdy) {
		this.rateMdy = rateMdy;
	}

	public String getGarFndPct() {
		return garFndPct;
	}

	public void setGarFndPct(String garFndPct) {
		this.garFndPct = garFndPct;
	}

	public String getCntAmount() {
		return cntAmount;
	}

	public void setCntAmount(String cntAmount) {
		this.cntAmount = cntAmount;
	}

	public String getCntSize() {
		return cntSize;
	}

	public void setCntSize(String cntSize) {
		this.cntSize = cntSize;
	}

	public BigDecimal getSrkAmount() {
		return srkAmount;
	}

	public void setSrkAmount(BigDecimal srkAmount) {
		this.srkAmount = srkAmount;
	}

	public BigDecimal getFacVal() {
		return facVal;
	}

	public void setFacVal(BigDecimal facVal) {
		this.facVal = facVal;
	}

	public BigDecimal getFrgCurrenyAmount() {
		return frgCurrenyAmount;
	}

	public void setFrgCurrenyAmount(BigDecimal frgCurrenyAmount) {
		this.frgCurrenyAmount = frgCurrenyAmount;
	}

	public String getFrgCurreny() {
		return frgCurreny;
	}

	public void setFrgCurreny(String frgCurreny) {
		this.frgCurreny = frgCurreny;
	}

	public String getDmcCurreny() {
		return dmcCurreny;
	}

	public void setDmcCurreny(String dmcCurreny) {
		this.dmcCurreny = dmcCurreny;
	}

	public BigDecimal getUpperLimitAmount() {
		return upperLimitAmount;
	}

	public void setUpperLimitAmount(BigDecimal upperLimitAmount) {
		this.upperLimitAmount = upperLimitAmount;
	}

	public BigDecimal getLowerLimitAmount() {
		return lowerLimitAmount;
	}

	public void setLowerLimitAmount(BigDecimal lowerLimitAmount) {
		this.lowerLimitAmount = lowerLimitAmount;
	}

	public BigDecimal getOrnAmount() {
		return ornAmount;
	}

	public void setOrnAmount(BigDecimal ornAmount) {
		this.ornAmount = ornAmount;
	}

	public BigDecimal getGatAmount() {
		return gatAmount;
	}

	public void setGatAmount(BigDecimal gatAmount) {
		this.gatAmount = gatAmount;
	}

	public BigDecimal getLvgValue() {
		return lvgValue;
	}

	public void setLvgValue(BigDecimal lvgValue) {
		this.lvgValue = lvgValue;
	}

	public String getPutCld() {
		return putCld;
	}

	public void setPutCld(String putCld) {
		this.putCld = putCld;
	}

	public String getExerciceType() {
		return exerciceType;
	}

	public void setExerciceType(String exerciceType) {
		this.exerciceType = exerciceType;
	}

	public BigDecimal getTotalHld() {
		return totalHld;
	}

	public void setTotalHld(BigDecimal totalHld) {
		this.totalHld = totalHld;
	}

	public BigDecimal getLtsBri() {
		return ltsBri;
	}

	public void setLtsBri(BigDecimal ltsBri) {
		this.ltsBri = ltsBri;
	}

	public BigDecimal getOriMktAmount() {
		return oriMktAmount;
	}

	public void setOriMktAmount(BigDecimal oriMktAmount) {
		this.oriMktAmount = oriMktAmount;
	}

	public BigDecimal getMntOrn() {
		return mntOrn;
	}

	public void setMntOrn(BigDecimal mntOrn) {
		this.mntOrn = mntOrn;
	}

	public String getMntCurrency() {
		return mntCurrency;
	}

	public void setMntCurrency(String mntCurrency) {
		this.mntCurrency = mntCurrency;
	}

	public Integer getCryWigt() {
		return cryWigt;
	}

	public void setCryWigt(Integer cryWigt) {
		this.cryWigt = cryWigt;
	}

	public String getColFlag() {
		return colFlag;
	}

	public void setColFlag(String colFlag) {
		this.colFlag = colFlag;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public BigDecimal getSecPct() {
		return secPct;
	}

	public void setSecPct(BigDecimal secPct) {
		this.secPct = secPct;
	}

	public BigDecimal getImrPct() {
		return imrPct;
	}

	public void setImrPct(BigDecimal imrPct) {
		this.imrPct = imrPct;
	}

	public BigDecimal getSecWgtPct() {
		return secWgtPct;
	}

	public void setSecWgtPct(BigDecimal secWgtPct) {
		this.secWgtPct = secWgtPct;
	}

	public BigDecimal getLtv20() {
		return ltv20;
	}

	public void setLtv20(BigDecimal ltv20) {
		this.ltv20 = ltv20;
	}

	public BigDecimal getLtv100() {
		return ltv100;
	}

	public void setLtv100(BigDecimal ltv100) {
		this.ltv100 = ltv100;
	}

	public String getPcePcpAty() {
		return pcePcpAty;
	}

	public void setPcePcpAty(String pcePcpAty) {
		this.pcePcpAty = pcePcpAty;
	}

	public BigDecimal getCryRating() {
		return cryRating;
	}

	public void setCryRating(BigDecimal cryRating) {
		this.cryRating = cryRating;
	}

	public String getCatDesLab() {
		return catDesLab;
	}

	public void setCatDesLab(String catDesLab) {
		this.catDesLab = catDesLab;
	}

	public String getAtyDesLab() {
		return atyDesLab;
	}

	public void setAtyDesLab(String atyDesLab) {
		this.atyDesLab = atyDesLab;
	}

	public String getSerDesLab() {
		return serDesLab;
	}

	public void setSerDesLab(String serDesLab) {
		this.serDesLab = serDesLab;
	}

	public String getSubSerName() {
		return subSerName;
	}

	public void setSubSerName(String subSerName) {
		this.subSerName = subSerName;
	}

	public BigDecimal getCapAmount() {
		return capAmount;
	}

	public void setCapAmount(BigDecimal capAmount) {
		this.capAmount = capAmount;
	}

	public String getCapCategory() {
		return capCategory;
	}

	public void setCapCategory(String capCategory) {
		this.capCategory = capCategory;
	}

	public Integer getAvgDai() {
		return avgDai;
	}

	public void setAvgDai(Integer avgDai) {
		this.avgDai = avgDai;
	}

	public String getSecRatingVal() {
		return secRatingVal;
	}

	public void setSecRatingVal(String secRatingVal) {
		this.secRatingVal = secRatingVal;
	}

	public Integer getRteFnl() {
		return rteFnl;
	}

	public void setRteFnl(Integer rteFnl) {
		this.rteFnl = rteFnl;
	}

	public String getBndFlag() {
		return bndFlag;
	}

	public void setBndFlag(String bndFlag) {
		this.bndFlag = bndFlag;
	}

	public String getInoFlag() {
		return inoFlag;
	}

	public void setInoFlag(String inoFlag) {
		this.inoFlag = inoFlag;
	}

	public String getRfnFlag() {
		return rfnFlag;
	}

	public void setRfnFlag(String rfnFlag) {
		this.rfnFlag = rfnFlag;
	}

	public String getBdmFlag() {
		return bdmFlag;
	}

	public void setBdmFlag(String bdmFlag) {
		this.bdmFlag = bdmFlag;
	}

	public String getSusFlag() {
		return susFlag;
	}

	public void setSusFlag(String susFlag) {
		this.susFlag = susFlag;
	}

	public String getDvsFlag() {
		return dvsFlag;
	}

	public void setDvsFlag(String dvsFlag) {
		this.dvsFlag = dvsFlag;
	}

	public String getOriginApplication() {
		return originApplication;
	}

	public void setOriginApplication(String originApplication) {
		this.originApplication = originApplication;
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
	
	

}
