<html>
  <h1> [파이널프로젝트] 드림랜드</h1>
  <br>

  <h2>✨ 프로젝트 개요</h2>
  가상의 놀이공원 드림랜드사 직원들의 원활한 협업을 위한 그룹웨어를 구현하는 프로젝트로<br>
  저는 이번 프로젝트에서 <strong>게시판</strong>을 담당했습니다.

  · 작업기간 : 2024. 05. 07 ~ 2024. 06. 20<br>
  · 작업인원 : 6명
  <br><br><br>
  
  <h2>✨ 사용기술</h2>
  · 개발환경 : WindowsOS / STS4 <br>
  · 개발언어: HTML5 / CSS3 /jQuery / JavaScript / JAVA<br> 
  · 프레임워크 : Spring<br>
  · 데이터베이스 : Oracle SQL Developer<br>
  · 서버 : Tomcat 9.0<br>
  · 버전관리 : Git, GitHub
  <br><br>
  <h2>✨ 기능구현</h2>
   📝<strong>게시판 공통</strong>
   <br><br>
     1. 게시판의 성격에 따라 관리자와 일반직원의 기능을 구분했습니다. <br>
  <img src="https://github.com/user-attachments/assets/276529eb-79fb-40e6-a48d-7eebb1303362" width="50%">
 <br><br>
     2. 게시글 작성시 유효성 검사를 통해 잘못된 정보 전달을 방지했습니다.<br>
   <img src="https://github.com/user-attachments/assets/b988e485-2f42-404c-97af-2e67616c3d71" width="50%"><br><br>
     3. 관리자의 편의를 위해 게시글 목록 내 수정, 삭제버튼을 구현했습니다.<br>
  
  <br><br><br>

  📝<strong>FAQ 게시판</strong>
  <br><br>
    1. 편의성을 위해 게시글 상세보기 형식이 아닌 슬라이드탭을 이용해 목록을 구현했습니다.<br>
    <img src="https://github.com/user-attachments/assets/b60785f3-c6e1-4396-b8b0-8296ffc62920" width="50%"><br><br>
    2. 각 부서별로 FAQ 내용을 확인할 수 있도록 분류하고, 검색기능을 추가했습니다.
    <img src="https://github.com/user-attachments/assets/7d375d0e-d734-4472-a58d-8b316942cbee" width="50%"> <br>

  <br><br><br>
  
   📝<strong>공지사항 게시판</strong>
   <br><br>
    1. 체크박스 선택시, 게시글 목록에서 중요 표시와 함께 게시글 상단에 고정되도록 구현했습니다.<br>
    2. 파일을 첨부할 수 있도록 input창을 활용하였고, 용량이 커질 것을 대비해 최대 5개까지로 제한을 걸어두었습니다.<br>
    3. 파일을 첨부한 경우, 게시글 제목 옆 첨부파일 아이콘을 표시했습니다.<br>
    4. 원하는 첨부파일을 클릭하거나, 모두 다운로드 버튼을 클릭하면 zip파일 형태로 한번에 다운받을 수 있도록 구현했습니다.<br>
    5. 수정시 게시글의 내용과 파일을 불러와 변경가능토록 구현했습니다.

  <strong><center>공지사항 게시글 목록▼</center></strong><br>
  <img src="https://github.com/user-attachments/assets/7af45a5c-37c7-4a62-99aa-140720fb1a7a" width="50%"><br>
  
  <strong>공지사항 게시글 작성▼</strong><br>
  <img src="https://github.com/user-attachments/assets/bc93836a-cd44-41ac-b96d-a034bbc9861a" width="50%"><br>
  
  <strong>공지사항 게시글 상세보기▼</strong><br>
  <img src="https://github.com/user-attachments/assets/2bffec4a-d8c0-4252-80ed-1ab712004a86" width="50%"><br>
   
    
  <br><br>
   📝<strong>익명 게시판</strong>
   <br><br>
    1. 무한 스크롤을 사용해서 15개씩 목록이 나타나도록 구현했습니다.<br>
    2. 게시글 작성에 summernote에디터를 이용했습니다.<br>
    3. 게시글, 댓글 작성 시 추후 본인확인을 위해 AESUtils를 이용해 비밀번호를 암호화, 복호화 처리해서 구현했습니다.<br>
    4. 게시글 수정시 비밀번호를 변경할 수 있도록 구현하고, 변경하지 않는다면 원래의 비밀번호가 DB에 들어가도록 구현했습니다.<br>
    5. 본인 삭제시 화면에는 삭제되었다는 문구가 뜨지만 DB에는 저장시켜놓았고, 관리자 삭제시 영구 삭제토록 구현했습니다.

  <strong><center>익명게시판 게시글 목록▼</center></strong><br>
  <img src="https://github.com/user-attachments/assets/226396b7-b145-499b-b28b-bfa5553d578b" width="50%"><br>
  
  <strong>익명게시판 게시글 작성▼</strong><br>
  <img src="https://github.com/user-attachments/assets/6b71e8ce-b999-4d77-bb7a-f33c992ad1e9" width="50%"><br>
  
  <strong>익명게시판 게시글 상세보기▼</strong><br>
  <img src="https://github.com/user-attachments/assets/216940d3-aee6-41b8-b085-00d40d19e976" width="50%"><br>
  
  <strong>익명게시판 게시글 상세보기 댓글▼</strong><br>
  <img src="https://github.com/user-attachments/assets/e612dd02-f1c9-4d60-a06c-65406a078ed1" width="50%"><br>

  
</html>
