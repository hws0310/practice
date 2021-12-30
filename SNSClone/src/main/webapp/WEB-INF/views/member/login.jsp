<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%-- This sources from https://blog.naver.com/home0/221956121925 --%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CloneSNS</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/login.css">
</head>
<body>
    
    <div class="contentsWrap">
        <form method="get" action="login">
        <div class="loginWindow">
            <h3 id="instaLogo">CloneSNS Login</h3>
            <input type="text" placeholder="전화번호, 사용자 이름 또는 이메일" class="inlineToBlock">
            <input type="password" placeholder="비밀번호" class="inlineToBlock">
        <button class="inlineToBlock ordinaryLogin unactivatedLoginColor" type="submit">로그인</button>
		
        <div class="horizonAndOrWrap">
            <hr class="leftHr">
            <div class="or">&nbsp;&nbsp;또는</div>
            <hr class="rightHr">
        </div>
        
		<button class="facebookLogin" onclick="window.location.href='www.facebook.com'">
            <svg xmlns="http://www.w3.org/2000/svg" width="13" height="13" fill="currentColor" class="bi bi-facebook" viewBox="0 0 16 16">
  			<path d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z"/>
			</svg>Facebook으로 로그인
    	</button>
    </div>
    </form>
    <div class="haveAccount">
        <p>계정이 없으신가요?
          <a href="signup" class="noneunderline">가입하기</a>
        </p>
    </div>
  </div>

  <script src="${pageContext.request.contextPath }/resources/js/in.js"></script>
</body>
</html>