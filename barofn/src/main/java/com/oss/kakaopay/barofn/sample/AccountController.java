package com.oss.kakaopay.barofn.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oss.kakaopay.barofn.sampleError.ExtensionException;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	JdbcAccountRepository jdbcAccountRepository;

	@Autowired
	MybatisAccountRepository accountRepository;
	
	@GetMapping("/list") // 목록
	public List<Account> list(Model model) {
		return jdbcAccountRepository.findAll();
	}
	
	@GetMapping("/mylist") // 목록
	public List<Account> myList(Model model) {
		if(1==1) {
			throw new ExtensionException("br code not found error");
		}
		return accountRepository.findAll();
	}
}
