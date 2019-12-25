package com.oss.kakaopay.barofn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oss.kakaopay.barofn.service.impl.CsvToH2ServiceImpl;

@SpringBootApplication
public class CsvToH2Application implements CommandLineRunner{
	@Autowired
	CsvToH2ServiceImpl csvToH2ServiceImpl;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("------------------CSV to H2------------------");
		csvToH2ServiceImpl.insertCsvtoH2();
	}

}
