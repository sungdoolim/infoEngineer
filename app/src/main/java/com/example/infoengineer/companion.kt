package com.example.infoengineer
import android.content.Context
import android.widget.Toast

class companion(){
     companion object{

         var TitleList= arrayListOf(
             titleUrl("/34?category=845992","소프트웨어 생명주기"),
             titleUrl("/35?category=845992","스크럼 기법"),
             titleUrl("/36?category=845992","XP"),
             titleUrl("/37?category=845992","현행 시스템 파악"),
             titleUrl("/38?category=845992","개발 기술 환경 파악"),
             titleUrl("/39?category=845992","요구사항 정의"),
             titleUrl("/40?category=845992","요구사항 개발 프로세스"),
             titleUrl("/41?category=845992","요구사항 분석"),
             titleUrl("/43?category=845992","요구사항 분석 CASE와 HIPO"),
             titleUrl("/44?category=845992","UML"),
             titleUrl("/45?category=845992","다이어그램 - 구조적,행위"),
             titleUrl("/46?category=845992","다이어그램 유즈케이스,액티비티"),
             titleUrl("/47?category=845992","다이어그램 클래스,시퀀스"),
             titleUrl("/48?category=845992","다이어그램 커뮤니케이션,상태,패키지"),
             titleUrl("/49?category=845992","소프트웨어 개발 방법론"),
             titleUrl("/51?category=845992","sw공학의 발전적 추세"),
             titleUrl("/52?category=845992","비용 산정 기법"),
             titleUrl("/53?category=845992","수학적 산정 기법"),
             titleUrl("/54?category=845992","프로젝트 일정 계획"),
             titleUrl("/55?category=845992","sw개발 방법론 결정"),
             titleUrl("/56?category=845992","sw 개발 방법론 테일러링 / 프레임 워크"),
             titleUrl("/58?category=845992","데이터 전환/데이터 검증"),
             titleUrl("/59?category=845992","오류 데이터 측정 및 정제"),
             titleUrl("/60?category=845992","데이터 베이스 개요"),
             titleUrl("/61?category=845992","데이터 베이스 설계"),
             titleUrl("/62?category=845992","데이터 모델의 개념"),
             titleUrl("/63?category=845992","데이터 모델의 구성요소"),
             titleUrl("/64?category=845992","식별자"),
             titleUrl("/65?category=845992","er모델"),
             titleUrl("/66?category=845992","관계형 db구조/ 관계형 데이터 모델"),
             titleUrl("/67?category=845992","관계형 데이터베이스의 제약 조건 - key"),
             titleUrl("/68?category=845992","관계형 데이터베이스의 제약 조건 - 무결성"),
             titleUrl("/69?category=845992","관계 대수 및 관계 해석"),
             titleUrl("/72?category=845992","이상/ 함수적 종속"),
             titleUrl("/73?category=845992","정규화"),
             titleUrl("/74?category=845992","반정규화"),
             titleUrl("/75?category=845992","시스템 카탈로그"),
             titleUrl("/76?category=845992","데이터베이스 저장 공간 설계"),
             titleUrl("/80?category=845992","트랜잭션 분석 / CRUD 분석"),
             titleUrl("/81?category=845992","인덱스/뷰/클러스터"),
             titleUrl("/82?category=845992","파티션"),
             titleUrl("/83?category=845992","분산 데이터 베이스 설계"),
             titleUrl("/84?category=845992","데이터 베이스 이중화 / 서버 클러스터링"),
             titleUrl("/85?category=845992","데이터 베이스 보안"),
             titleUrl("/86?category=845992","데이터베이스 백업"),
             titleUrl("/87?category=845992","스토리지"),
             titleUrl("/88?category=845992","논리 데이터 모델의 변환 / 물리 데이터 모델 품질 검토"),
             titleUrl("/89?category=845992","자료 구조"),
             titleUrl("/90?category=845992","트리/이진트리"),
             titleUrl("/91?category=845992","정렬"),
             titleUrl("/92?category=845992","통합 구현"),
             titleUrl("/93?category=845992","xml / 연계테스트"),
             titleUrl("/94?category=845992","개발 환경 구축 / sw 아키텍처"),
             titleUrl("/95?category=845992","아키텍처 패턴"),
             titleUrl("/96?category=845992","객체 지향"),
             titleUrl("/97?category=845992","객체 지향 분석 및 설계"),
             titleUrl("/98?category=845992","모듈"),
             titleUrl("/99?category=845992","단위 모듈"),
             titleUrl("/100?category=845992","공통 모듈"),
             titleUrl("/101?category=845992","코드"),
             titleUrl("/102?category=845992","디자인 패턴"),
             titleUrl("/103?category=845992","개발 지원 도구"),
             titleUrl("/105?category=845992","서버 개발"),
             titleUrl("/106?category=845992","보안 및 API"),
             titleUrl("/107?category=845992","배치 프로그램"),
             titleUrl("/108?category=845992","패키지 소프트웨어 / 시스템 인터페이스 요구사항 분석"),
             titleUrl("/109?category=845992","인터페이스 요구사항 검증"),
             titleUrl("/110?category=845992","인터페이스 시스템 식별"),
             titleUrl("/111?category=845992","미들웨어 솔루션"),
             titleUrl("/112?category=845992","모듈 연계"),
             titleUrl("/114?category=845992","인터페이스 구현"),
             titleUrl("/115?category=845992","인터페이스 보안"),
             titleUrl("/116?category=845992","인터페이스 구현 검증"),
             titleUrl("/117?category=845992","사용자 인터페이스"),
             titleUrl("/118?category=845992","UI 설계 도구"),
             titleUrl("/119?category=845992","UI / 품질 / 설계"),
             titleUrl("/120?category=845992","HCI /UX /감성공학"),
             titleUrl("/121?category=845992","애플리 케이션 테스트"),
             titleUrl("/122?category=845992","애플리케이션 테스트의 분류"),
             titleUrl("/123?category=845992","테스트 기법에 따른 애플리케이션 테스트"),
             titleUrl("/124?category=845992","개발 단계에 따른 애플리케이션 테스트"),
             titleUrl("/125?category=845992","통합 테스트"),
             titleUrl("/126?category=845992","애플리케이션 테스트 프로세스"),
             titleUrl("/127?category=845992","테스트 자동화 도구"),
             titleUrl("/128?category=845992","결함 관리"),
             titleUrl("/129?category=845992","애플리케이션 성능 분석"),
             titleUrl("/130?category=845992","복잡도"),
             titleUrl("/131?category=845992","애플리케이션 성능 개선"),
             titleUrl("/134?category=845992","SQL -ddl"),
             titleUrl("/135?category=845992","SQL -dcl"),
             titleUrl("/136?category=845992","SQL-dml"),
             titleUrl("/137?category=845992","DML- select"),
             titleUrl("/138?category=845992","DML-select"),
             titleUrl("/139?category=845992","프로시저 / 트리거 / 함수"),
             titleUrl("/140?category=845992","PL/SQL 제어문 / 커서"),
             titleUrl("/141?category=845992","dbms 접속 / sql 테스트 / ORM"),
             titleUrl("/142?category=845992","쿼리 성능 최적화"),
             titleUrl("/143?category=845992","secure SDLC"),
             titleUrl("/144?category=845992","보안 약점/ 보안"),
             titleUrl("/147?category=845992","시간 및 상태 / 에러처리 / 코드 오류"),
             titleUrl("/148?category=845992","캡슐화/ API -보안"),
             titleUrl("/149?category=845992","암호 알고리즘"),
             titleUrl("/150?category=845992","서비스 공격 유형"),
             titleUrl("/151?category=845992","서버 인증"),
             titleUrl("/152?category=845992","보안 아키텍처/프레임워크/로그분석"),
             titleUrl("/153?category=845992","보안 솔루션"),
             titleUrl("/154?category=845992","Programming Language1"),
             titleUrl("/156?category=845992","Programminng Language2"),
             titleUrl("/157?category=845992","Programming Language3"),
             titleUrl("/158?category=845992","라이브러리/ 예외처리"),
             titleUrl("/159?category=845992","운영체제"),
             titleUrl("/160?category=845992","운영체제- 기억장치 관리"),
             titleUrl("/161?category=845992","주기억 장치 할당 기법"),
             titleUrl("/162?category=845992","페이지 교체 알고리즘"),
             titleUrl("/163?category=845992","가상 기억 장치 관리사항"),
             titleUrl("/164?category=845992","프로세스"),
             titleUrl("/165?category=845992","스케줄링"),
             titleUrl("/166?category=845992","환경 변수"),
             titleUrl("/167?category=845992","os 기본 명령어"),
             titleUrl("/168?category=845992","인터넷"),
             titleUrl("/169?category=845992","osi 모델"),
             titleUrl("/170?category=845992","네트워크 관련 장비"),
             titleUrl("/171?category=845992","tcp/ip"),
             titleUrl("/172?category=845992","네트워크 신기술"),
             titleUrl("/173?category=845992","네트워크 구축"),
             titleUrl("/174?category=845992","스위치"),
             titleUrl("/175?category=845992","경로 제어 / 트래픽 제어"),
             titleUrl("/176?category=845992","sw 관련 신기술"),
             titleUrl("/177?category=845992","HW 신기술 / sw 개발보안"),
             titleUrl("/178?category=845992","Secure OS / DB 신기술"),
             titleUrl("/179?category=845992","회복/ 병행제어"),
             titleUrl("/180?category=845992","교착상태"),
             titleUrl("/181?category=845992","데이터 표준화"),
             titleUrl("/182?category=845992","스포트웨어 패키징/ 릴리즈 노트 "),
             titleUrl("/183?category=845992","DRM - 디지털 저작권 관리 "),
             titleUrl("/184?category=845992","소프트웨어 설치 메뉴얼 작성/ 소프트웨어 사용 자 메뉴얼 작성 "),
             titleUrl("/185?category=845992","소프트웨어 버전 등록 "),
             titleUrl("/186?category=845992","소프트웨어 버전 관리도구 "),
             titleUrl("/187?category=845992","GIT/ 빌드 자동화 도구 "),
             titleUrl("","출처:시나공-정보처리기사-실기(김정준, 강윤석,김용갑,김우경,길벗알앤디외)출판사:길벗"),

         )
         val baseUrl="https://staris.tistory.com/"
     }

 }