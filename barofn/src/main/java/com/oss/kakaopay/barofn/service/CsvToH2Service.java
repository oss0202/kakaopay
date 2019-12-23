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

	/*TB_BR_INFO	BrInfoVO
	 * TB_ACCT_INFO	AcctInfoVO
	 * TB_DE_DTLS	DeDtlsVO
	 */
	/**
	 * TB_BR_INFO insert
	 *
	 * @param BrInfoVO
	 * @throws Exception
	 * @return
	 */
	public void insertBrInfo(BrInfoVO bwrInfoVO) throws Exception;
	
	/**
	 * TB_ACCT_INFO insert
	 *
	 * @param AcctInfoVO
	 * @throws Exception
	 * @return
	 */
	public void insertAccInfo(AcctInfoVO acctInfoVO) throws Exception;
	
	/**
	 * TB_DE_DTLS insert
	 *
	 * @param DeDtlsVO
	 * @throws Exception
	 * @return
	 */
	public void insertDeDtls(DeDtlsVO deDtlsVO) throws Exception;
}
