package com.oss.kakaopay.barofn.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	JdbcAccountRepository jdbcAccountRepository;

	@GetMapping("/list") // 목록
	public List<Account> list(Model model) {
		return jdbcAccountRepository.findAll();
	}
}
