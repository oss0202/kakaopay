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
import java.util.Iterator;
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
	 * 폴더에 있는 CSV파일 H2에 Insert
	 *
	 * @param 
	 * @throws Exception
	 * @return
	 */
	public void insertCsvtoH2() throws Exception{
		readAllExample();
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
		
		if(fileNm.equals("데이터_관리점정보.csv")||fileNm=="데이터_관리점정보.csv") {
			BrInfoVO brInfoVO;
			//데이터_관리점정보
			for (String[] strings : list) {
				brInfoVO = new BrInfoVO();
				brInfoVO.setBrCode(strings[0]);
				brInfoVO.setBrNm(strings[1]);
				sqlSession.insert("CsvToH2.insertTbBrinfo",brInfoVO);
			}
		}else if(fileNm.equals("데이터_계좌정보.csv")||fileNm=="데이터_계좌정보.csv") {
			//AcctInfoVO
			AcctInfoVO acctInfoVO;
			for (String[] strings : list) {
				acctInfoVO = new AcctInfoVO();
				acctInfoVO.setAcctNo(strings[0]);
				acctInfoVO.setAcctNm(strings[1]);
				acctInfoVO.setBrCode(strings[2]);
				sqlSession.insert("CsvToH2.insertTbAcctinfo",acctInfoVO);
			}
		}else if(fileNm.equals("데이터_거래내역.csv")||fileNm=="데이터_거래내역.csv") {
			//DeDtlsVO
			DeDtlsVO deDtlsVO;
			for (String[] strings : list) {
				deDtlsVO = new DeDtlsVO();
				deDtlsVO.setDeDm(strings[0]);
				deDtlsVO.setAcctNo(strings[1]);
				deDtlsVO.setDeNo(strings[2]);
				deDtlsVO.setAmt(strings[3]);
				deDtlsVO.setFee(strings[4]);
				deDtlsVO.setCanAt(strings[5]);
				sqlSession.insert("CsvToH2.insertTbDedtls",deDtlsVO);
			}
		}
	}

	public void readAllExample() throws Exception {
		String fileName = null;
		Reader reader;
		for (File string : new File(ClassLoader.getSystemResource("static/csv/").toURI()).listFiles()) {
			fileName = string.getName();
			reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("static/csv/" + fileName).toURI()));
			readAll(reader, fileName);
		}
	}
}
