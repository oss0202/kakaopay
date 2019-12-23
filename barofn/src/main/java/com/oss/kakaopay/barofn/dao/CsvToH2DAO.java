package com.oss.kakaopay.barofn.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.apache.catalina.core.ApplicationContext;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Repository;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
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
@Repository
public class CsvToH2DAO {
	@Autowired
	private SqlSession sqlSession;
	
	/**
	 * TB_BR_INFO insert
	 *
	 * @param BrInfoVO
	 * @throws Exception
	 * @return
	 */
	public void insertBrInfo(BrInfoVO bwrInfoVO) throws Exception{
		System.out.println("dao insertBrInfo호출");
		/*
		 * CSV호출
		 */
		
		readAllExample();
		
		//sqlSession.insert("CsvToH2.insertSample",bwrInfoVO);
		//System.out.println(sqlSession.selectList("CsvToH2.selectSample",bwrInfoVO));
		//System.out.println(sqlSession.selectList("CsvToH2.selectSampleAll",bwrInfoVO));
		//System.out.println(sqlSession.selectList("CsvToH2.groupSample"));
		
//		sqlSession.selectList("Account.findAll");
	}
	/**
	 * TB_ACCT_INFO insert
	 *
	 * @param AcctInfoVO
	 * @throws Exception
	 * @return
	 */
	public void insertAccInfo(AcctInfoVO acctInfoVO) throws Exception{
		System.out.println("dao insertAccInfo호출");
//		sqlSession.selectList("Account.findAll");
	}
	/**
	 * TB_DE_DTLS insert
	 *
	 * @param DeDtlsVO
	 * @throws Exception
	 * @return
	 */
	public void insertDeDtls(DeDtlsVO deDtlsVO) throws Exception{
		System.out.println("dao insertDeDtls호출");
//		sqlSession.selectList("Account.findAll");
	}
	
	
	 /**
	 * CSV to List
	 *
	 * @param reader, fileNm
	 * @throws Exception
	 * @param reader
	 * @return
	 * @throws Exception
	 */
	
	public void readAll(Reader reader, String fileNm) throws Exception {
		CSVParser parser = new CSVParserBuilder()
			    .withSeparator(',')
			    .withIgnoreQuotations(true)
			    .build();
		 
		CSVReader csvReader = new CSVReaderBuilder(reader)
		    .withSkipLines(1)
		    .withCSVParser(parser)	
		    .build();
		
		List<String[]> list = new ArrayList<>();
		list = csvReader.readAll();
		reader.close();
		csvReader.close();
		
		if(fileNm.equals("데이터_거래내역")||fileNm=="데이터_거래내역") {
		}else if(fileNm.equals("데이터_계좌정보")||fileNm=="데이터_계좌정보") {
		}else {
			BrInfoVO brInfoVO;
			//데이터_관리점정보
			for (String[] strings : list) {
				brInfoVO = new BrInfoVO();
				brInfoVO.setBrCode(strings[0]);
				brInfoVO.setBrName(strings[1]);
				sqlSession.insert("CsvToH2.insertSample",brInfoVO);
				System.out.println(brInfoVO.toString());
			}
			System.out.println(sqlSession.selectList("CsvToH2.selectSampleAll"));
		}
	}

	public void readAllExample() throws Exception {
		String fileName = null;
		Reader reader;
		for (File string : new File(ClassLoader.getSystemResource("static/csv/").toURI()).listFiles()) {
			System.out.println(string.getName());
			fileName = string.getName();
		}
		reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("static/csv/" + fileName).toURI()));
		readAll(reader, fileName);
	}
	/*public static void main(String[] args) throws Exception {
		CsvToH2DAO s = new CsvToH2DAO();
		s.readAllExample();
	}*/

}
