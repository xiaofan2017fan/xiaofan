<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <%@ include file="/WEB-INF/jsp/include/header.jsp" %>
  <body>
  <div align="center">
   <h5>你好，${user.userName}</h5>
   <img alt="梦火主页" src="<%=request.getContextPath() %>/image/1.jpg">
   </div>
  </body>
</html>
