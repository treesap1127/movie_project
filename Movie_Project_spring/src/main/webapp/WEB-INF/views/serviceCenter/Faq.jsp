<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
 <jsp:include page="../include/header.jsp"></jsp:include>
<link href="../css/serviceCenter/faq.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="../css/style/style.css">
  <script>
       $(function(){
      const con = ".faq_box";
      const con2 =".faq_box2";
      const con3 =".faq_box3";
      const con4 =".faq_box4";     
      


      $(".area2").click(function() { 
      $(con).css('display', 'none');
      $(con3).css('display', 'none');
      $(con4).css('display', 'none');      
      $(con2).css('display', 'block');
      });

      $(".area3").click(function() { 
      $(con).css('display', 'none');
      $(con2).css('display', 'none');
      $(con4).css('display', 'none');   
      $(con3).css('display', 'block');
      });
      
      $(".area4").click(function() { 
      $(con).css('display', 'none');
      $(con2).css('display', 'none');
      $(con3).css('display', 'none');      
      $(con4).css('display', 'block');
      });
     
      $(".area").click(function() {     
      $(con4).css('display', 'none');
      $(con2).css('display', 'none');
      $(con3).css('display', 'none');
      $(con).css('display', 'block');
      });    
    });
    
</script>
<script>
$(function(){
	if(${sessionScope.member.grade}<10){
	$(".adminbtn").css("display","none");
	}
	if(${sessionScope.member.grade}>=10){
		$(".down_img").css("left","50px");
		}
});
</script>
<style>
.title_plus_text{
	position: relative;
    right: 21.36%;
    top: 16%;
    width: 400px;
    font-size: 13px;
    font-weight: 600;
    text-align: right;
    float: right;
        line-height: 22px;
}
.title_right{
	top: 65%;
    right: 18%;
    left: auto;
}
</style>
</head>

<body>
  <div class="box_case">
    <!--좌우크기조절-->
    <div class="title">
      <a href="../../../../../../../../" class="main_back">
        <img src="../../../../../../../../img/root/메인아이콘_흰.jpg" alt="메인아이콘" />
        <div class="title_name">Minor Cinema</div>
      </a>
    </div>
<div class="title_right">
	                <div class="login_link"><a href="../../../../../../../../../../serviceCenter/CenterService" >고객센터</a></div>
	              	<c:if test="${sessionScope.member.grade==0}">	<div class="login_link"><a href="../../../../../../../../login">로그인</a></div></c:if>
	              	<c:if test="${sessionScope.member.grade>0}">	<div class="login_link"><a href="../../../../../../../../logout">로그아웃</a></div></c:if>
	            </div>
	            <c:if test="${sessionScope.member.grade==1}">
	             <div class="title_plus_text">${sessionScope.member.userName} 사용자님 안녕하세요<br> <a href="../../../../../../../../myPage/myPage">마이페이지</a></div>
	             </c:if>
	             <c:if test="${sessionScope.member.grade==2}">
	             <div class="title_plus_text">${sessionScope.member.userName} 영화 관리자님 안녕하세요<br><a href="../../../../../../../../myPage/myCinema">영화관 관리 페이지</a></div>
	             </c:if>
	             <c:if test="${sessionScope.member.grade>=10}">
	             <div class="title_plus_text">${sessionScope.member.userName} 웹 관리자님 안녕하세요<br><a href="../../../../../../../../webadmin/admin">웹 관리 페이지</a></div>
	             </c:if>
        </div>
  <div class="black_box">
            <ul id="main-menu">
            <li><a href="../../../../../../../../ticket/Ticketing">예매</a>
                <ul id="sub-menu">
                  <li><a href="../../../../../../../../ticket/Ticketing" aria-label="subemnu">예매하기</a></li>
                  <li><a href="../../../../../../../../ticket/TicketInformation" aria-label="subemnu">예매안내</a></li>
                </ul>
              </li>
              <li><a href="../../../../../../../../movie_info/NowPlayRank">영화 정보</a>
              </li>
              <li><a href="../../../../../../../../event/continue_Event">이벤트</a>
                <ul id="sub-menu">
                  <li><a href="../../../../../../../../event/continue_Event" aria-label="subemnu">진행중인 이벤트</a></li>
                  <li><a href="../../../../../../../../event/end_Event" aria-label="subemnu">종료된 이벤트</a></li>
                </ul>
              </li>
            </ul>
  </div>
  <!--여기까지 기본 위 배너 입니다!-->
    <!--area-->
    <div class="faqs_box">

        <div class="FAQ_seq">FAQ</div>
  
        <div class="faq_box">        
          <div class="area red">
            <div class="area_index" style="background-color: #ec6159;;">전체</div>
          </div>
  
          <div class="area2">
            <div class="area_index">영화예매</div>
          </div>
  
          <div class="area3">
            <div class="area_index">이벤트</div>
          </div>
  
          <div class="area4">
            <div class="area_index">결제/취소</div>
          </div> 
          
          <div class="faq_area drag_css">
          
            <table class="faq_table">                                 
              <thead>  
              <c:if test="${list.size() eq 0}">
               <tr>    
               	<td style="text-align: center">
               		아직 FAQ가 등록 되지 않았습니다.
               	</td>
               </tr>     
              </c:if>
               <c:forEach items="${list}" var="item">
                <tr>           
                    <td><details>
                      <summary>Q ${item.subject}<a href="FaqUpdate/${item.faqId}"><button class="btn btn-outline-success adminbtn">변경</button></a> <a href="FAQdelete/${item.faqId}"><button class="btn btn-outline-danger adminbtn">삭제</button></a>
                      <img src="/img/center_service/down_faq.png" class="down_img"></summary>
                      ${item.contents}
                    </details></td>  
                </tr>     
            </c:forEach>         
              </thead>                              
          </table>        
        </div>
         <div class="adminbtn">
    		  <a href="FaqAdd"><button class="btn btn-outline-primary adminbtn">등록</button></a>
  		 </div>   
      </div>

  
  
   <!-- 무브 2박스 -->
   <div class="faq_box2">        
    <div class="area">
      <div class="area_index">전체</div>
    </div>

    <div class="area2 red">
      <div class="area_index" style="background-color: #ec6159;;">영화예매</div>
    </div>

    <div class="area3">
      <div class="area_index">이벤트</div>
    </div>

    <div class="area4">
      <div class="area_index" >결제/취소</div>
    </div>            
  
     <div class="faq_area drag_css">
          
            <table class="faq_table">                                 
              <thead>  
               <c:forEach items="${list1}" var="item">
                <tr>           
                    <td><details>
                      <summary>Q ${item.subject}<a href="FaqUpdate/${item.faqId}"><button class="btn btn-outline-success adminbtn">변경</button></a> <a href="delete/${item.faqId}"><button class="btn btn-outline-danger adminbtn">삭제</button></a>
                      <img src="/img/center_service/down_faq.png" class="down_img"></summary>
                      ${item.contents}
                    </details></td>  
                </tr>     
            </c:forEach>        
           <c:if test="${list1.size() eq 0}">
               <tr>    
               	<td style="text-align: center">
               		아직 영화예매 관련 FAQ가 등록 되지 않았습니다.
               	</td>
               </tr>     
              </c:if> 
              </thead>                              
          </table>        
        </div>
         <div class="adminbtn">
    		  <a href="FaqAdd"><button class="btn btn-outline-primary adminbtn">등록</button></a>
  		 </div> 

</div>


  <!-- 무브3박스 -->
  <div class="faq_box3">        
    <div class="area">
      <div class="area_index" >전체</div>
    </div>

    <div class="area2">
      <div class="area_index">영화예매</div>
    </div>

    <div class="area3 red">
      <div class="area_index" style="background-color: #ec6159;;">이벤트</div>
    </div>

    <div class="area4">
      <div class="area_index">결제/취소</div>
    </div> 
    
    <div class="faq_area drag_css">
          
            <table class="faq_table">                                 
              <thead>  
               <c:forEach items="${list2}" var="item">
                <tr>           
                    <td><details>
                      <summary>Q ${item.subject}<a href="FaqUpdate/${item.faqId}"><button class="btn btn-outline-success adminbtn">변경</button></a> <a href="delete/${item.faqId}"><button class="btn btn-outline-danger adminbtn">삭제</button></a>
                      <img src="/img/center_service/down_faq.png" class="down_img"></summary>
                      ${item.contents}
                    </details></td>  
                </tr>     
            </c:forEach>     
                       <c:if test="${list2.size() eq 0}">
               <tr>    
               	<td style="text-align: center">
               		아직 영화예매 관련 FAQ가 등록 되지 않았습니다.
               	</td>
               </tr>     
              </c:if>     
              </thead>                              
          </table>        
        </div>
         <div class="adminbtn">
    		  <a href="FaqAdd"><button class="btn btn-outline-primary adminbtn">등록</button></a>
  		 </div> 
  

</div>

  <!-- 무브4 박스 -->
  
  <div class="faq_box4">        
    <div class="area">
      <div class="area_index">전체</div>
    </div>

    <div class="area2">
      <div class="area_index">영화예매</div>
    </div>

    <div class="area3">
      <div class="area_index">이벤트</div>
    </div>

    <div class="area4 red">
      <div class="area_index" style="background-color: #ec6159;;">결제/취소</div>
    </div> 
    
    <div class="faq_area drag_css">
          
            <table class="faq_table">                                 
              <thead>  
               <c:forEach items="${list3}" var="item">
                <tr>           
                    <td><details>
                      <summary>Q ${item.subject}<a href="FaqUpdate/${item.faqId}"><button class="btn btn-outline-success adminbtn">변경</button></a> <a href="delete/${item.faqId}"><button class="btn btn-outline-danger adminbtn">삭제</button></a>
                      <img src="/img/center_service/down_faq.png" class="down_img"></summary>
                      ${item.contents}
                    </details></td>  
                </tr>     
            </c:forEach>    
           <c:if test="${list3.size() eq 0}">
               <tr>    
               	<td style="text-align: center"> 
               		아직 결제취소 관련 FAQ가 등록 되지 않았습니다.
               	</td>
               </tr>     
              </c:if>       
              </thead>                              
          </table>        
        </div>
         <div class="adminbtn">
    		  <a href="FaqAdd"><button class="btn btn-outline-primary adminbtn">등록</button></a>
  		 </div> 
  

</div>


 </div>



 <!-- 제일 최하단 -->

 <div class="bottom">
  <!--고객센터-->
  <hr class="lhr5"/>
  <div class="inner_case_bottom">
      <div class="bottom_text_1">고객센터</div>
      <div class="bottom_text_2">평일 08:00 ~ 19:30, 토요일,공휴일
          휴무&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;02-1234-5678&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;customer@projectCinema.co.kr</div>
      <div class="bottom_text_3">상호 : (주)프로젝트영화 &nbsp;&nbsp;&nbsp; 대표자 : 2조<br>
          주소 : 대전광역시 동구 우암로 352-21 (주)프로젝트영화

          <br><br>사업자 등록번호 : 123-45-6789<br>TEL : 02-1234-5678 Email : customer@projectCinema.co.kr
      </div>
      <div class="bottom_text_4">© ProjectCinema Co., Ltd All rights reservedv.</div>
  </div>
  </div>
    <jsp:include page="../include/body.jsp"></jsp:include>
</body>
</html>