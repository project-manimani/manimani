<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>ManiMani!</title>
  
  <!-- 모바일 -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- ----- -->
  
  <!-- 부트스트랩 및 jquery -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <!-- ------- -->
  
  <!-- Vue -->
  <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.min.js"></script>
  <script src="http://unpkg.com/axios/dist/axios.min.js"></script>
  <!-- ------- -->
  
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"/>
  <!-- ------- -->
  
  <link rel="stylesheet" type="text/css" href="../css/util.css"> <!-- util css 파일 -->
  <link rel="stylesheet" type="text/css" href="../css/main.css"> <!-- 공용 css 파일 -->
</head>
<body>
  <jsp:include page="side.jsp"/>
  <jsp:include page="content.jsp"/>
  <jsp:include page="../main/footer.jsp"/>
</body>
</html>