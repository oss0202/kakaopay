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
	private String brName;	//관리점명
	
	public String getBrCode() {
		return brCode;
	}
	public void setBrCode(String brCode) {
		this.brCode = brCode;
	}
	public String getBrName() {
		return brName;
	}
	public void setBrName(String brName) {
		this.brName = brName;
	}
	@Override
	public String toString() {
		return "BrInfoVO [brCode=" + brCode + ", brName=" + brName + "]";
	}
	
}
