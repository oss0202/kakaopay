package com.oss.kakaopay.barofn.service;

import java.util.List;
import java.util.Map;

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
public interface BarofnService{

	 /**
	 * 각 연도별 합계 금액이 가장 많은 고객 조회
	 *
	 * @param 없음
	 * @return List<Map> 
	 * @throws Exception
	 * @return
	 */
	public List<Map> selectTotAmtMaxCtr();
	
	 /**
	 * 각 연도별 거래가 없는 고객 조회
	 *
	 * @param 없음
	 * @return List<Map> 
	 * @throws Exception
	 * @return
	 */
	public List<Map> selectDeStr();
	
	 /**
	 * 연도별 관리점별 거래금액 합계를 구하고 합계금액별로 내립차순 조회
	 *
	 * @param 없음
	 * @return List<Map>
	 * @throws Exception
	 * @return
	 */
	public List<Map> selectYearBhfDelngTotamt();
							
	 /**
	 * 해당지점 거래금액 합계 조회
	 *
	 * @param 관리점명(brName)
	 * @return Map
	 * @throws Exception
	 * @return
	 */
	public Map selectBrDeTotAmt(String brName);
}
