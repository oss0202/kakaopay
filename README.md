# kakaopay
kakaopay

1. Git Repository 연동
	1) Git Repositories - Clone a Repository and add the clone to view 클릭
	2) (1), (2)입력 후 Next
		(1) Locationd
	   URL 				: https://github.com/oss0202/kakaopay.git
	   Host				:github
	   Repository path  : /oss0202/kakaopay.git
	   
		(2)Authentication
	   Git Hube 계정 입력
	3) master 선택 후 Next
	4) Directory 설정 후 Finish
	
2. 소스 내려받기
	1) 연동된 Repository 오른쪽 클릭 후 import Projects 클릭
	2) barofn 프로젝트만 클릭(kakaopay 선택 해제)
	
※ BarofnApplicationTests.java에 에러가 있을 경우
	1) BarofnApplicationTests.java로 이동
	2) @RunWith 어노테이션에 마우스 커서를 두면 밑에 뜨는 add junit 4 dependency 클릭 
	
3. 단위 테스트
	1) BarofnApplicationTests.java로 이동 후 오른쪽 클릭(또는 barofn 프로젝트 오른쪽 클릭) Run as - JUnit Test 클릭 
	(/barofn/src/test/java/com/oss/kakaopay/barofn/BarofnApplicationTests.java)
※ Could not run test(No tests found with test rennner 'JUnit 5'가 뜰 경우
	1) barofn 프로젝트 오른쪽 클릭 - Run as - Run Configurations 클릭
	2) JUnit에 있는 barofn클릭(아무 것도 없을 경우 JUnit 더블클릭후 barofn플로젝트 선택)
	3) Test runner를 JUnit 5에서 JUnit 4로 수정
	4) Apply 클릭 후 Run클릭
	
4. 프로제트 실행
	1) barofn 프로젝트 오른쪽 클릭 - Run as - Spring Boot App클릭
	2) Post Man을 이용하여 과제 URL 실행
	※ Headers(Accept : applicatoin/json) 설정
		(1) 2018년, 2019년 각 연도별 합계 금액이 가장 많은 고객을 추출하는 API 개발.
		(단, 취소여부가 ‘Y’ 거래는 취소된 거래임, 합계 금액은 거래금액에서 수수료를 차감한 금액임)
			
		URL : http://localhost/kakaopay/barofn/maxSumUser
		
		(2) 2018년 또는 2019년에 거래가 없는 고객을 추출하는 API 개발.
		(취소여부가 ‘Y’ 거래는 취소된 거래임)
		
		URL : http://localhost/kakaopay/barofn/yearNotDeUser
		
		(3) 연도별 관리점별 거래금액 합계를 구하고 합계금액이 큰 순서로 출력하는 API 개발.
		( 취소여부가 ‘Y’ 거래는 취소된 거래임)
		
		URL : http://localhost/kakaopay/barofn/yearBrSumAmt
		
		(4) 분당점과 판교점을 통폐합하여 판교점으로 관리점 이관을 하였습니다. 
		지점명을 입력하면 해당지점의 거래금액 합계를 출력하는 API 개발( 취소여부가 ‘Y’ 거래는 취소된 거래임,)
		※ Parmas 설정(KEY : brName, Value : 판교점 or 분당점 or 강남점 or 잠실점)
		URL : http://localhost/kakaopay/barofn/brDeSumAmt?brName=판교점
		
	
	
	
