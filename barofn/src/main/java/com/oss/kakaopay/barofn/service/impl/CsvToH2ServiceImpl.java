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
	 * 폴더에 있는 CSV파일 H2에 Insert
	 *
	 * @param 
	 * @throws Exception
	 * @return
	 */
	@Override
	public void insertCsvtoH2() throws Exception {
		csvToH2DAO.insertCsvtoH2();
	}
}
