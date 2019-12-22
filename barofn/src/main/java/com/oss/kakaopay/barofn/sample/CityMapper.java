package com.oss.kakaopay.barofn.sample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CityMapper {
	@Select("SELECT * FROM accounts")
	List<Account> selectAccountsAll();
}
