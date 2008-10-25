<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link href="<s:url value="/css/main2.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body background="/condominio/imagens/fundook.jpg">
<center>
 
	<table width=600 align=center>
	 	
    <s:form action="consultarPessoa"><br><br><br><br><br><br><br><br><br><br>
     <table align="center" >
     	 
         <tr><td class="tdLabel"><s:text name="label.P_cpf"/></td>
         	        <td><s:textfield name="cpf" size="11"/></td>
         </tr>
    
    </table>
    		 <br/>
    <table> 
    	     <tr>
    		    <td><s:submit action="consultarPessoa" key="button.label.submit2" cssClass="butStnd"/></td>
    	        <td><s:reset key="button.label.cancel" cssClass="butStnd"/></td>
    		 <tr>
    </table> 		  		 
    	</s:form>
</center>		
</body>
</html>
