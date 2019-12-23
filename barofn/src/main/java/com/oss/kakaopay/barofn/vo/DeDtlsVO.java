package com.oss.kakaopay.barofn.vo;

/**
 * 거래내역VO
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
public class DeDtlsVO {

	private String deDm;	//거래일자
	private String acctNo; //계좌번호
	private String deNo;	//거래번호
	private String amt;		//금액
	private String fee;		//수수료
	private String canAt;	//취소여부
	
	public String getDeDm() {
		return deDm;
	}
	public void setDeDm(String deDm) {
		this.deDm = deDm;
	}
	public String getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}
	public String getDeNo() {
		return deNo;
	}
	public void setDeNo(String deNo) {
		this.deNo = deNo;
	}
	public String getAmt() {
		return amt;
	}
	public void setAmt(String amt) {
		this.amt = amt;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public String getCanAt() {
		return canAt;
	}
	public void setCanAt(String canAt) {
		this.canAt = canAt;
	}
	@Override
	public String toString() {
		return "DelngDtlsVO [deDm=" + deDm + ", acctNo=" + acctNo + ", deNo=" + deNo + ", amt=" + amt + ", fee=" + fee
				+ ", canAt=" + canAt + "]";
	}
	
	
}
