package com.oss.kakaopay.barofn.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleMybatisApplication implements CommandLineRunner {

	private CityMapper cityMapper;

	public SampleMybatisApplication(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.cityMapper.selectAccountsAll());
	}
}
