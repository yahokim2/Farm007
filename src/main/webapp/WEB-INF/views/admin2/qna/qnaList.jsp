<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="../header.jsp"%>
<%@ include file="../sub_menu.jsp"%>
<script type="text/javascript">
  function go_view(qaseq) {
    var theForm = document.frm;
    theForm.qaseq.value = qaseq;
    theForm.action = "admin_qna_detail";
    theForm.submit();
  }
</script>

<article>
<h1>Q&amp;A 게시글 리스트</h1>  
<form name="frm" method="post">
<input type="hidden" name="qaseq">  
<table id="orderList">
  <tr>
    <th>번호(답변여부)</th> <th>제목</th> <th>작성자</th> <th>작성일</th>    
  </tr>
  <c:forEach items="${qnaList}" var="qnaVO">  
      <tr>
      <td>
      ${qnaVO.qaseq}  
      <c:choose>          
        <c:when test='${qnaVO.rep=="1"}'>(미처리)</c:when>
        <c:otherwise>(답변처리완료)</c:otherwise>
      </c:choose>      
      </td>
      <td> 
      <a href="#" onClick="javascript:go_view('${qnaVO.qaseq}')">
        ${qnaVO.subject} 
      </a>
      </td>
      <td> ${qnaVO.userid} </td>
      <td> <fmt:formatDate value="${qnaVO.indate}"/></td>
      </tr>
    </c:forEach>
    </table>
    </form>    
  </article>
  <%@ include file="../footer.jsp"%>
</body>
</html>