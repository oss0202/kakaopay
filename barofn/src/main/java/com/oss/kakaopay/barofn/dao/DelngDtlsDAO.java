package com.oss.kakaopay.barofn.dao;

import java.util.ArrayList;
import java.util.List;

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
public class DelngDtlsDAO {

	public List<AcctInfoVO> selectTotAmtMaxCtr(){
		List<AcctInfoVO> lst = new ArrayList<AcctInfoVO>();
		return lst;
	}
}
