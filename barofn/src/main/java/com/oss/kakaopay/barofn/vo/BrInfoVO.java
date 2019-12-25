package com.oss.kakaopay.barofn.vo;

/**
 * 관리점정보VO
 *
 * @author  : OH
 * @since	  : 2019. 12. 21.
 * @version : 1.0
 *
 * << 개정이력(Modification Information) >>
 *
 *  수정일		     수정자		    수정내용
 *  -------    	--------    ---------------------------
 * 2019.12.22	오성식			최초생성
 * 
 */ 
public class BrInfoVO {
	
	private String brCode;	//관리점코드
	private String brNm;	//관리점명
	private String year;	//년도
	private String sumAmt;	//금액합산
	
	public String getBrCode() {
		return brCode;
	}
	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}
	public String getBrNm() {
		return brNm;
	}
	public void setBrNm(String brNm) {
		this.brNm = brNm;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getSumAmt() {
		return sumAmt;
	}
	public void setSumAmt(String sumAmt) {
		this.sumAmt = sumAmt;
	}
	@Override
	public String toString() {
		return "BrInfoVO [brCode=" + brCode + ", brNm=" + brNm + ", year=" + year + ", sumAmt=" + sumAmt + "]";
	}

	
}
