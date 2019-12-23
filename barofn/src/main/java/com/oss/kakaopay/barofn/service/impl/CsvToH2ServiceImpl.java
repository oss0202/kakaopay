package com.oss.kakaopay.barofn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oss.kakaopay.barofn.dao.CsvToH2DAO;
import com.oss.kakaopay.barofn.service.CsvToH2Service;
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
@Service
public class CsvToH2ServiceImpl implements CsvToH2Service{
	
	@Autowired
	CsvToH2DAO csvToH2DAO;
	
	/**
	 * TB_BR_INFO insert
	 *
	 * @param BrInfoVO
	 * @throws Exception
	 * @return
	 */
	@Override
	public void insertBrInfo(BrInfoVO brInfoVO) throws Exception {
		System.out.println("service insertBrInfo호출");
		csvToH2DAO.insertBrInfo(brInfoVO);
	}
	
	/**
	 * TB_ACCT_INFO insert
	 *
	 * @param AcctInfoVO
	 * @throws Exception
	 * @return
	 */
	@Override
	public void insertAccInfo(AcctInfoVO acctInfoVO) throws Exception {
		System.out.println("service insertAccInfo호출");
		csvToH2DAO.insertAccInfo(acctInfoVO);
	}
	
	/**
	 * TB_DE_DTLS insert
	 *
	 * @param DeDtlsVO
	 * @throws Exception
	 * @return
	 */
	@Override
	public void insertDeDtls(DeDtlsVO deDtlsVO) throws Exception {
		System.out.println("service insertDeDtls호출");
		csvToH2DAO.insertDeDtls(deDtlsVO);
	}
}
