package com.oss.kakaopay.barofn.vo;

/**
 * 계좌정보VO
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
public class AcnutInfoVO {
/*ACNUT_NO	ACNUT_NM	MANAGEPNT_CODE sumAmt year
 * 계좌번호	계좌명	관리점코드 
*/
	private String acctNo;	//계좌번호
	private String acctNm;	//계좌명
	private String brCode;	//관리점코드
	private String sumAmt;//총금액
	private String year;		//년도
	
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getAcctNm() {
		return acctNm;
	}
	public void setAcctNm(String acctNm) {
		this.acctNm = acctNm;
	}
	public String getBrCode() {
		return brCode;
	}
	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}
	public String getSumAmt() {
		return sumAmt;
	}
	public void setSumAmt(String sumAmt) {
		this.sumAmt = sumAmt;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "AcnutInfoVO [acctNo=" + acctNo + ", acctNm=" + acctNm + ", brCode=" + brCode + ", sumAmt=" + sumAmt
				+ ", year=" + year + "]";
	}
	
}
