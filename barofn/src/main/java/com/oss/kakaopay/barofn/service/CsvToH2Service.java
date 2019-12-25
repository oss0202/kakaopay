package com.oss.kakaopay.barofn.service;

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
public interface CsvToH2Service {

	/**
	 * 폴더에 있는 CSV파일 H2에 Insert
	 * @param BrInfoVO
	 * @throws Exception
	 * @return
	 */
	public void insertCsvtoH2() throws Exception;

}
