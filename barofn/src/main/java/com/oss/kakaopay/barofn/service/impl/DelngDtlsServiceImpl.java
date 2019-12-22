package com.oss.kakaopay.barofn.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oss.kakaopay.barofn.service.DelngDtlsService;
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
@Service
public class DelngDtlsServiceImpl implements DelngDtlsService{

	 /**
		 * 각 연도별 합계 금액이 가장 많은 고객 조회
		 *
		 * @param 없음
		 * @return AcnutInfoVO
		 * @throws Exception
		 * @return
		 */
	@Override
	public AcctInfoVO selectTotAmtMaxCtr() {
		System.out.println("service selectTotAmtMaxCtr");
		//연도별 합계 금액 추출
		
		//제일 높은 금액 추출
		return null;
	}

	/**
	 * 각 연도별 거래가 없는 고객 조회
	 *
	 * @param 없음
	 * @return AcnutInfoVO
	 * @throws Exception
	 * @return
	 */
	@Override
	public AcctInfoVO selectDeStr() {
		System.out.println("service selectDeStr");
		return null;
	}

	 /**
		 * 연도별 관리점별 거래금액 합계를 구하고 합계금액별로 내립차순 조회
		 *
		 * @param 없음
		 * @return AcnutInfoVO
		 * @throws Exception
		 * @return
		 */
	@Override
	public List<BrInfoVO> selectYearBhfDelngTotamt() {
		System.out.println("service selectYearBhfDelngTotamt");
		return null;
	}

	 /**
		 * 해당지점 거래금액 합계 조회
		 *
		 * @param 관리점명(brName)
		 * @return ManagepntInfoVO
		 * @throws Exception
		 * @return
		 */
	@Override
	public BrInfoVO selectBrDeTotAmt(String brName) {
		System.out.println("파라미터 : " + brName);
		System.out.println("service selectBrDeTotAmt");
		return null;
	}
	
}
