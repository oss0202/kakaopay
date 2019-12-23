package com.oss.kakaopay.barofn.sample;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisAccountRepository implements AccountRepository{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long save(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Account account) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		System.out.println("findAll호출");
		return sqlSession.selectList("Account.findAll");
	}

	@Override
	public Account findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
