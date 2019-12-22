package com.oss.kakaopay.barofn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oss.kakaopay.barofn.service.impl.DelngDtlsServiceImpl;
import com.oss.kakaopay.barofn.vo.AcnutInfoVO;
import com.oss.kakaopay.barofn.vo.ManagepntInfoVO;

/**
 * [설명]
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
@RestController
@RequestMapping("kakaopay/barofn/")
public class DelngDtlsController {
	@Autowired
	private DelngDtlsServiceImpl delngDtlsServiceImpl;
	
	 /**
	 * 각 연도별 합계 금액이 가장 많은 고객 조회
	 *
	 * @param 없음
	 * @return AcnutInfoVO
	 * @throws Exception
	 * @return
	 */
	@RequestMapping(value = "1", produces = "application/json")
	public String selectTotAmtMaxCtr() {
		// TODO Auto-generated method stub
		delngDtlsServiceImpl.selectTotAmtMaxCtr();
		System.out.println("selectTotAmtMaxCtr()호출");
		return "selectTotAmtMaxCtr()호출";
	}
	
	/**
	 * 각 연도별 거래가 없는 고객 조회
	 *
	 * @param 없음
	 * @return AcnutInfoVO
	 * @throws Exception
	 * @return
	 */
	@RequestMapping(value = "2", produces = "application/json")
	public String selectDeStr() {
		// TODO Auto-generated method stub
		delngDtlsServiceImpl.selectDeStr();
		System.out.println("selectDeStr()호출");
		return "selectDeStr()호출";
	}
	
	 /**
	 * 연도별 관리점별 거래금액 합계를 구하고 합계금액별로 내립차순 조회
	 *
	 * @param 없음
	 * @return AcnutInfoVO
	 * @throws Exception
	 * @return
	 */
	@RequestMapping(value = "3", produces = "application/json")
	public String selectYearBhfDelngTotamt() {
		// TODO Auto-generated method stub
		delngDtlsServiceImpl.selectYearBhfDelngTotamt();
		System.out.println("selectYearBhfDelngTotamt()호출");
		return "selectYearBhfDelngTotamt()호출";
	}
	
	 /**
	 * 해당지점 거래금액 합계 조회
	 *
	 * @param 관리점명(brName)
	 * @return ManagepntInfoVO
	 * @throws Exception
	 * @return
	 */
	@RequestMapping(value = "4", produces = "application/json")
	public ManagepntInfoVO selectBrDeTotAmt(@RequestParam(value = "brName") String  brName) {
		// TODO Auto-generated method stub
		if(brName.equals("분당점")||brName=="분당점") {
			System.out.println("분당점이누");
		}
		delngDtlsServiceImpl.selectBrDeTotAmt(brName);
		System.out.println("selectBrDeTotAmt()호출");
		ManagepntInfoVO vo = new ManagepntInfoVO();
		vo.setBrName(brName);
		List<ManagepntInfoVO> lst = new ArrayList<ManagepntInfoVO>();
		
		ManagepntInfoVO vo2 = new ManagepntInfoVO();
		ManagepntInfoVO vo3 = new ManagepntInfoVO();
		vo2.setBrName(brName+0);
		lst.add(0, vo2);
		vo3.setBrName(brName+1);
		lst.add(1, vo3);
		vo.setDataList(lst);
		return vo;
	}

}
