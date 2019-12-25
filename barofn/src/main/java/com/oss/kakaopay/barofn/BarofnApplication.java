package com.oss.kakaopay.barofn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oss.kakaopay.barofn.service.impl.CsvToH2ServiceImpl;

@SpringBootApplication
public class BarofnApplication implements CommandLineRunner{
	@Autowired
	CsvToH2ServiceImpl csvToH2ServiceImpl;
	
	public static void main(String[] args) {
		SpringApplication.run(BarofnApplication.class, args);
		System.out.println("===========SERVER STSRT===========");
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------------------CSV to H2------------------");
		csvToH2ServiceImpl.insertCsvtoH2();
	}

}
