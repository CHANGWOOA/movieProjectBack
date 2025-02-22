영화 예매 사이트

*기간 : 2025.02~

*설명 : 
영화 예매 서비스를 제공하며 메인 페이지와 관리자 페이지로 구성됩니다.  
영화진흥위원회(Kobis)와 KMDB API를 통해 최신 영화 데이터를 수집해 데이터베이스에 저장합니다.  
관리자 페이지에서는 영화관리에 이어 회원 관리, 상영 관리, 결제 관리 기능을 제공할 예정입니다.

*사용언어 및 기술스택 :
 - Backend : Java (Spring MVC), MyBatis, HikariCP
 - Frontend : React.js, JavaScript, HTML, CSS
 - Database : Oracle
 - Tools : Spring Tool Suite 3, Visual Studio Code, GitHub, Notion
 - API : Kobis·KMDB API를 통한 데이터 수집 및 DB 저장

*주요 기능
 - 영화 API(Kobis·KMDB)를 통해 영화 데이터를 수집 및 DB 저장
 - 기존 데이터는 업데이트, 신규 데이터는 추가되도록 트랜잭션 처리 적용
 - 관리자 페이지를 통해 회원, 상영, 결제 관리 기능 제공 예정

*팀원 :
 - 소담, 성호, 영민, 호영, 창우

*담당 역할 (관리자 페이지 담당)
 - 플로우차트 작성 : 관리자 페이지의 흐름 정의 및 추후 수정 예정  
 - 기본 코드 작성 : `DTO`, `mapper.xml`, `mapper`, `service`, `serviceimpl`, `controller` 작성 (호영님과 협업)  
 - API 데이터 수집 : Kobis·KMDB API를 통해 영화 데이터를 가져와 데이터베이스에 저장  
 - 트랜잭션 처리 : 기존 데이터는 업데이트, 신규 데이터는 추가되도록 트랜잭션 어노테이션 적용  
 - 코드 리팩토링 : 유지보수와 가독성을 위해 `serviceimpl`과 `movieutils`로 기능 분리  
 - 앞으로의 계획 : 회원 관리, 상영 관리, 결제 관리 기능 구현 및 React.js를 통한 프론트엔드 개발 담당
