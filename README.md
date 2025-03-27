프로젝트명 : THEFILM(영화 예매 사이트)

*기간 : 2025.01.21~2025.03.26

*설명 : 
THEFILM은 최신 영화 정보를 제공하고, 예매 및 리뷰 기능을 지원하는 영화 예매 웹 서비스입니다.
영화진흥위원회(Kobis)와 KMDb API를 활용하여 최신 영화 데이터를 실시간으로 반영하며,
관리자가 직접 데이터를 수정할 수 있는 관리자 페이지를 제공합니다.

*사용언어 및 기술스택 :
 1) Backend
  - Spring MVC
  - MyBatis, HikariCP
  - RESTful API 설계 및 구현
  - 트랜잭션 관리 (@Transactional), 스케줄링 (@Scheduled)
  - 포트원 결제, 카카오페이 API 연동
  - 영화데이터(Kobis, Kmdb) API
  - Daum 주소 API

 2) Frontend
 - React.js
 - HTML, CSS
 - Axios를 활용한 API 통신

 3) Database
 - Oracle

 4) Deployment
 - AWS (EC2, S3)

 5) Tools & 협업
 - Spring Tool Suite 3, Visual Studio Code
 - GitHub (버전 관리)
 - Notion (일정 및 진행 관리)
 - Figma (화면 설계)


*주요 기능
 1) 회원 관리
  - 이메일 인증을 통한 회원가입
  - Daum 주소 API 활용한 주소 입력
  - 카카오 API를 이용한 간편 로그인

 2) 메인 화면
  - React 라이브러리를 활용한 UI
  - 랭킹 TOP 5 영화 및 현재 상영 영화 리스트 표시
  - 슬라이드 이동 및 마우스 hover 시 상세보기·예매하기 버튼 표시

 3) 상세 보기
  - 영화 정보 표출 및 해당 영화의 리뷰 표시

 4) 검색 기능
  - 영화 제목, 감독, 배우 이름을 기반으로 검색

 5) 예매하기
  - 영화별 등록된 상영 날짜 및 상영관/상영시간 선택
  - 예매 좌석 선택 (예매 중/완료 좌석은 선택 불가)

 6)  결제 시스템
  - 포트원 결제 API 연동 (카카오페이 지원)
  - 결제 도중 뒤로 가기 감지 시 자동 좌석 취소 처리

 7) 예매 내역 관리
  - 예매 상태 확인 가능
  - 상영 시간 30분 전까지 예매 취소 가능
  - 상영 종료 후 리뷰 작성 버튼 활성화
  - 미결제 건은 "결제 진행" 버튼 활성화

 8) 리뷰 기능
  - 리뷰 작성 모달창 제공
  - 사용자가 남긴 모든 영화 리뷰 조회
  - 특정 영화에 대한 모든 리뷰 확인 가능

 9) 회원 정보 수정
  - 수정 메뉴 진입 시 비밀번호 재확인 (보안 강화)
  - 프로필 사진 업로드 및 삭제 (삭제 시 기본 이미지 적용)
  - ID 제외 모든 정보 수정 가능

 10) 관리자 페이지
  가) 영화 관리
   - 영화 API(Kobis·KMDB)를 통해 영화 데이터를 수집 및 DB 저장
   - 기존 데이터는 업데이트, 신규 데이터는 추가되도록 트랜잭션 처리 적용
   - 관리자가 직접 영화 데이터를 추가 및 수정 가능
   - 스케쥴링을 통한 자동 업데이트
  나) 상영 관리
   - 영화별 상영기간, 상영관, 상영시간 지정(중복 시 선택 불가)
  다) 회원 관리 / 결제 관리
   - 회원 목록과 진행된 결제 내역을 가져와 리스트화
   - 결제 취소 기능


*팀원 :
 - 소담, 성호, 영민, 호영, 창우

*담당 역할
 - 관리자 페이지 전체 개발 (영화, 상영, 회원, 결제 관리)
 - API 데이터 연동: Kobis·KMDb API를 활용한 데이터 수집 및 DB 저장
 - 트랜잭션 적용: 기존 데이터 업데이트 및 신규 데이터 추가를 위한 트랜잭션 관리
 - 아이디/비밀번호 찾기 기능 구현 (전화번호/이메일 활용)

*구동 이미지
1) 메인화면
![Image](https://github.com/user-attachments/assets/955866ba-5bd7-473d-b9f8-07d44e0e8fa3)

![Image](https://github.com/user-attachments/assets/c8ac5f5e-16e0-48d7-9d39-4d82d35e392d)

![Image](https://github.com/user-attachments/assets/78c6afc3-e5e7-45a7-8433-a6096e674b10)

2) 로그인
![Image](https://github.com/user-attachments/assets/af24a832-5c3a-48ea-924d-f3dc4a18f748)

3) 회원가입
![Image](https://github.com/user-attachments/assets/d227488c-d45c-453d-9f51-8bc89121b834)

![Image](https://github.com/user-attachments/assets/33559a79-4c72-4685-b023-9504b68eafa1)

![Image](https://github.com/user-attachments/assets/b0777e9a-d7c8-4e6d-b752-1522352b09a7)

4) 회원정보 수정
![Image](https://github.com/user-attachments/assets/30ac12d3-00fd-478f-9c47-a7018b7637bf)

![Image](https://github.com/user-attachments/assets/2cad1a4f-bcb3-4d0f-b469-88c96839ec3c)

![Image](https://github.com/user-attachments/assets/bc72e6f4-c01b-4f84-95f2-24f4ccd2f5c7)

![Image](https://github.com/user-attachments/assets/0292e67f-8603-4ad4-92a3-34f17a85922b)

5) 예매하기
![Image](https://github.com/user-attachments/assets/7edd1d7e-44b8-49e9-b0cc-08cbe983853b)

6) 좌석 선택
![Image](https://github.com/user-attachments/assets/3596152b-c69d-43fd-bc1a-9903d09bce26)

7) 결제하기
![Image](https://github.com/user-attachments/assets/5a029848-ad30-417a-87b8-01c4c381bc73)

![Image](https://github.com/user-attachments/assets/2c91e816-741b-4fac-9037-277b5dc709c5)

8) 결제 완료
![Image](https://github.com/user-attachments/assets/eafb4903-9290-46f9-b387-e9d48d60357a)

9) 내 예매내역
![Image](https://github.com/user-attachments/assets/b3c8a1da-3fb6-4cc5-8740-87b1141872a2)

10) 관리자페이지 - 로그인
![Image](https://github.com/user-attachments/assets/5e6d2836-fc72-4a8c-b9f0-fa3760b576d7)

11) 관리자페이지 - 영화관리
![Image](https://github.com/user-attachments/assets/596dd7d1-a347-44c6-8fc5-0654723b2bd0)

![Image](https://github.com/user-attachments/assets/8a899c70-170d-4639-8468-75ccae4bfca6)

![Image](https://github.com/user-attachments/assets/801df1c0-bc94-4a16-84e5-2127401056ff)

12) 관리자페이지 - 상영관리
![Image](https://github.com/user-attachments/assets/e995283c-ffed-409f-95cc-cd69bc8ba73c)

![Image](https://github.com/user-attachments/assets/397aa3eb-623a-477c-addf-6be1a853aea6)

![Image](https://github.com/user-attachments/assets/4569e179-fa74-4a65-8753-e3ee3e0e6ab1)

![Image](https://github.com/user-attachments/assets/6f52a2dc-f196-4208-923f-03fbe7d34423)

13) 관리자페이지 - 회원관리
![Image](https://github.com/user-attachments/assets/2a64e7a8-156a-4354-b891-dac05eae18b9)

14) 관리자페이지 - 결제관리
![Image](https://github.com/user-attachments/assets/df20fb6a-96c9-4aea-9587-ece7ade2f3da)
