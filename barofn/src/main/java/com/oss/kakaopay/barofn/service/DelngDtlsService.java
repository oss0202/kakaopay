package com.oss.kakaopay.barofn.service;

import java.util.List;

import com.oss.kakaopay.barofn.vo.AcctInfoVO;
import com.oss.kakaopay.barofn.vo.BrInfoVO;

/**
 *
 * @author  : OH
 * @since	  : 2019. 12. 22.
 * @version : 1.0
 *
 * << 개정이력(Modification Information) >>
 *
 *  수정일		     수정자		    수정내용
 *  -------    	--------    ---------------------------
 *  2019.12.22 오성식			최초생성
 */
public interface DelngDtlsService{

	/*
	TOTAMT MXMM(MaX) CSTMR(CTR)
	selectTotAmtMaxCtr
	총금액 최고 고객 (연도 리스트 -> 파라미터)
	selectTotamtMxmmCstmr
	parameter 사용자 입력 X (년도list)
	return AcnutInfoVO(년도, 계좌명, 계좌번호, 총금액

	DELNG(DE) CSTMR(CTR)
	selectDeStr
	거래 고객(연도, 여부 -> 파라미터)
	selectDelngCstmr
	parameter 사용자 입력 X (년도list, 취소여부)
	return AcnutInfoVO(년도, 계좌명, 계좌번호)
	
	YEAR BHF(BR) DELNG(DE) TOTAMT
	selectYesrBrDeTotAmt
	연도 관리점 거래 총금액
	selectYearBhfDelngTotamt
	parameter 사용자 입력 X (년도list, 취소여부)
	return 년도, List<ManagepntInfoVO>(관리점면, 관리점코드, 총금액)

	BHF(BR) DELNG(DE) TOTAMT
	selectBrDeTotAmt
	관리점 거래 총금액 
	selectBhfDelngTotamt
	parameter 사용자 입력(관리점명) (취소여부)
	return ManagepntInfoVO(관리점명, 관리점코드, 총금액)
	exception : 분당점 출력 시 http status : 404 -> code : 404 메세지 br code not found error;
*/
	 /**
	 * 각 연도별 합계 금액이 가장 많은 고객 조회
	 *
	 * @param 없음
	 * @return AcnutInfoVO
	 * @throws Exception
	 * @return
	 */
	public AcctInfoVO selectTotAmtMaxCtr();
	
	 /**
	 * 각 연도별 거래가 없는 고객 조회
	 *
	 * @param 없음
	 * @return AcnutInfoVO
	 * @throws Exception
	 * @return
	 */
	public AcctInfoVO selectDeStr();
	
	 /**
	 * 연도별 관리점별 거래금액 합계를 구하고 합계금액별로 내립차순 조회
	 *
	 * @param 없음
	 * @return AcnutInfoVO
	 * @throws Exception
	 * @return
	 */
	public List<BrInfoVO> selectYearBhfDelngTotamt();
	
	 /**
	 * 해당지점 거래금액 합계 조회
	 *
	 * @param 관리점명(brName)
	 * @return ManagepntInfoVO
	 * @throws Exception
	 * @return
	 */
	public BrInfoVO selectBrDeTotAmt(String brName);
}
