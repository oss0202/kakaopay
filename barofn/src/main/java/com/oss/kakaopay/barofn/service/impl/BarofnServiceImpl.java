package com.oss.kakaopay.barofn.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.kakaopay.barofn.dao.BarofnDAO;
import com.oss.kakaopay.barofn.service.BarofnService;
import com.oss.kakaopay.barofn.vo.AcctInfoVO;

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
public class BarofnServiceImpl implements BarofnService{
	@Autowired
	BarofnDAO barofnDAO;
	 /**
		 * 각 연도별 합계 금액이 가장 많은 고객 조회
		 *
		 * @param 없음
		 * @return AcnutInfoVO
		 * @throws Exception
		 * @return
		 */
	@Override
	public List<Map>  selectTotAmtMaxCtr() {
		System.out.println("service selectTotAmtMaxCtr");
		List<Map> LstMap = new ArrayList<Map>();
		Map<String, String> map;
		List<AcctInfoVO> acctInfoLst = barofnDAO.selectTotAmtMaxCtr();
		System.out.println(acctInfoLst);
		for (AcctInfoVO acctInfoVO : acctInfoLst) {
			map = new HashMap<>();
			map.put("year", acctInfoVO.getYear());
			map.put("name", acctInfoVO.getAcctNm());
			map.put("sumAmt", acctInfoVO.getSumAmt());
			LstMap.add(map);
		}
		return LstMap;
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
	public List<Map>  selectDeStr() {
		System.out.println("service selectDeStr");
		List<AcctInfoVO> acctInfoLst = barofnDAO.selectYearDeUser();//년도, 계정 조회
		System.out.println(acctInfoLst);
		
		//<년도, 계정리스트>
		Map<String, List<String>> yearDeUserMap = new HashMap<String, List<String>>();
		
		for (AcctInfoVO acctInfoVO : acctInfoLst) {
			//해당 년도키값이 없을 경우 키값 및 계정리스트 생성
			if(!yearDeUserMap.containsKey(acctInfoVO.getYear())) {
				yearDeUserMap.put(acctInfoVO.getYear(), new ArrayList<String>() );
				yearDeUserMap.get(acctInfoVO.getYear()).add(acctInfoVO.getAcctNo());
			}else {
				yearDeUserMap.get(acctInfoVO.getYear()).add(acctInfoVO.getAcctNo());
			}
		}
		
		Set set  = yearDeUserMap.entrySet();
		Iterator it = set.iterator();
		List<Map> LstMap = new ArrayList<Map>();
		Map<String, String> map;
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			String key = (String)entry.getKey();
			List<String> value = (List<String>) entry.getValue();
			
			List<AcctInfoVO> notAcctInfoLst = barofnDAO.selectYearNotDeUser(value);
			for (AcctInfoVO acctInfoVO : notAcctInfoLst) {
				map = new HashMap<>();
				map.put("year", key);
				map.put("name", acctInfoVO.getAcctNm());
				map.put("sumAmt", acctInfoVO.getAcctNo());
				LstMap.add(map);
			}
		}
		
		return LstMap;
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
	public List<Map> selectYearBhfDelngTotamt() {
		System.out.println("service selectYearBhfDelngTotamt");
		List<Map> lstMap = new ArrayList<>();
		List<AcctInfoVO> acctInfoLst = barofnDAO.selectYearBhfDelngTotamt();//년도별 지점별 매출액
		Map<String, Object> yearBrMap = new HashMap<>();//key : year, dataList
		List<Map> dataList = new ArrayList<>();//dataList
		Map<String, String> dataListMap = new HashMap<>();//dataList element
		
			for (AcctInfoVO acctInfoVO : acctInfoLst) {
				if(!yearBrMap.containsValue(acctInfoVO.getYear())) {
					yearBrMap = new HashMap<>();//초기화
					yearBrMap.put("year", acctInfoVO.getYear());
					dataList = new ArrayList<>();//초기화
					for (AcctInfoVO acctInfoVO2 : acctInfoLst) {
						if(acctInfoVO.getYear()==acctInfoVO2.getYear()) {
							dataListMap = new HashMap<>();
							dataListMap.put("brName", acctInfoVO2.getBrNm());
							dataListMap.put("brCode", acctInfoVO2.getBrCode());
							dataListMap.put("sumAmt", acctInfoVO2.getSumAmt());
							dataList.add(dataListMap);
						}
					}
					yearBrMap.put("dataList", dataList);
					lstMap.add(yearBrMap);
				}
			}
		return lstMap;
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
	public Map selectBrDeTotAmt(String brName) {
		System.out.println("파라미터 : " + brName);
		System.out.println("service selectBrDeTotAmt");
		AcctInfoVO acctInfoVO = barofnDAO.selectBrDeTotAmt(brName);//년도별 지점별 매출액
		Map<String, String> result = new HashMap<>();//dataList element
		result.put("brName", acctInfoVO.getBrNm());
		result.put("brCode", acctInfoVO.getBrCode());
		result.put("sumAmt", acctInfoVO.getSumAmt());
		return result;
	}
	
	
	public static void main(String[] args) {
		/*List<Map> lstMap = new ArrayList<Map>();
		Map<String, Object> map = new HashMap<>();
		map.put("year", "2018");
		List<Map> lstMap2 = new ArrayList<Map>();
		Map<String, String> map2 = new HashMap<>();
		map2.put("brName", "관리점명");
		map2.put("brCode", "관리점코드");
		map2.put("sumAmt", "0000");
		lstMap2.add(map2);
		Map<String, String> map3 = new HashMap<>();
		map2.put("brName", "관리점명2");
		map2.put("brCode", "관리점코드2");
		map2.put("sumAmt", "00002");
		lstMap2.add(map3);
		map.put("dataList", lstMap2);
		lstMap.add(map);*/
		
		/*List<Map> lstMap = new ArrayList<Map>();
		Map<String, Object> map = new HashMap<>();
			map.put("year", "2018");
			List<Map> lstMap2 = new ArrayList<Map>();
			Map<String, String> map2 = new HashMap<>();
			map2.put("brName", "관리점명");
			map2.put("brCode", "관리점코드");
			map2.put("sumAmt", "0000");
			lstMap2.add(map2);
		Map<String, String> map3 = new HashMap<>();
			map3.put("brName", "관리점명2");
			map3.put("brCode", "관리점코드2");
			map3.put("sumAmt", "00002");
			lstMap2.add(map3);
			map.put("dataList", lstMap2);
		lstMap.add(map);*/
	}
}
