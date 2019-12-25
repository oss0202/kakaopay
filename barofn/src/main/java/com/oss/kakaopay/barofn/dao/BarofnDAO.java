package com.oss.kakaopay.barofn.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
@Repository
public class BarofnDAO {
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * 폴더에 있는 CSV파일 H2에 Insert
	 *
	 * @param 
	 * @throws Exception
	 * @return
	 */
	public List<AcctInfoVO> selectTotAmtMaxCtr(){
		return sqlSession.selectList("Barofn.selectTotAmtMaxCtr");
	}
	
	/**
	 * 년도별 거래 계정 조회
	 *
	 * @param 
	 * @throws Exception
	 * @return
	 */
	public List<AcctInfoVO> selectYearDeUser(){
		return sqlSession.selectList("Barofn.selectYearDeUser");
	}
	
	/**
	 * 년도별 미거래 계정 조회
	 *
	 * @param 
	 * @throws Exception
	 * @return
	 */
	public List<AcctInfoVO> selectYearNotDeUser(List<String> value){
		return sqlSession.selectList("Barofn.selectYearNotDeUser", value);
	}
	
	/**
	 * 년도별 지점별 매출액 조회
	 * 
	 * @param 
	 * @throws Exception
	 * @return
	 */
	public List<AcctInfoVO> selectYearBhfDelngTotamt(){
		return sqlSession.selectList("Barofn.selectYearBhfDelngTotamt");
	}
	
	/**
	 * 관리점 거래 총금액 조회
	 * 
	 * @param brName(관리점명)
	 * @throws Exception
	 * @return
	 */
	public AcctInfoVO selectBrDeTotAmt(String brName){
		return sqlSession.selectOne("Barofn.selectBrDeTotAmt", brName);
	}
}
