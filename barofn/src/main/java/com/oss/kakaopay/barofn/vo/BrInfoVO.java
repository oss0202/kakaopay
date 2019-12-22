package com.oss.kakaopay.barofn.vo;

import java.util.List;

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
	private String sumAmt;//총금액
	private String year;		//년도
	private List<BrInfoVO> dataList;
	
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
	public List<BrInfoVO> getDataList() {
		return dataList;
	}
	public void setDataList(List<BrInfoVO> dataList) {
		this.dataList = dataList;
	}
	@Override
	public String toString() {
		return "ManagepntInfoVO [brCode=" + brCode + ", brName=" + brName + ", sumAmt=" + sumAmt + ", year=" + year
				+ ", dataList=" + dataList + "]";
	}
	
}
