package com.oss.kakaopay.barofn.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oss.kakaopay.barofn.vo.AcctInfoVO;
import com.oss.kakaopay.barofn.vo.BrInfoVO;
import com.oss.kakaopay.barofn.vo.DeDtlsVO;

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
 *  2019.12.23 오성식			최초생성
 */
@Repository
public class CsvToH2DAO {
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * TB_BR_INFO insert
	 *
	 * @param BrInfoVO
	 * @throws Exception
	 * @return
	 */
	public void insertBrInfo(BrInfoVO bwrInfoVO) throws Exception{
		System.out.println("dao insertBrInfo호출");
//		sqlSession.update("createSample");
		bwrInfoVO = new BrInfoVO();
		bwrInfoVO.setBrCode("E");
		bwrInfoVO.setBrName("오성식점");
		System.out.println(bwrInfoVO.getBrCode() + ", " + bwrInfoVO.getBrName());
		sqlSession.insert("CsvToH2.insertSample",bwrInfoVO);
		System.out.println(sqlSession.selectList("CsvToH2.selectSample",bwrInfoVO));
		System.out.println((BrInfoVO)sqlSession.selectOne("CsvToH2.selectSample",bwrInfoVO));
		System.out.println(sqlSession.selectList("CsvToH2.groupSample"));
		
//		sqlSession.selectList("Account.findAll");
	}
	/**
	 * TB_ACCT_INFO insert
	 *
	 * @param AcctInfoVO
	 * @throws Exception
	 * @return
	 */
	public void insertAccInfo(AcctInfoVO acctInfoVO) throws Exception{
		System.out.println("dao insertAccInfo호출");
//		sqlSession.selectList("Account.findAll");
	}
	/**
	 * TB_DE_DTLS insert
	 *
	 * @param DeDtlsVO
	 * @throws Exception
	 * @return
	 */
	public void insertDeDtls(DeDtlsVO deDtlsVO) throws Exception{
		System.out.println("dao insertDeDtls호출");
//		sqlSession.selectList("Account.findAll");
	}
}
