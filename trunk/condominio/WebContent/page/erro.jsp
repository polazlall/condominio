<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link href="<s:url value="/css/main2.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body background="/condominio/imagens/fundook.jpg">
<center>
   <s:if test="pessoa==null || pessoa.P_cpf == null">
	 <table><div><td height="150"></td></div></table>
	 <h1><s:text name="Cadastro de Pessoa"/></h1>  <br><br><br><br><br><br>
   </s:if>
 </h1><br><br><br><br>
	<table width=600 align=center><br><br><br><br><br><br><br>
	    <tr><td><a href="getAllPessoas.action"><b>Listar Cadastros</a></td>
	    <td><a href="setUpForInsertOrUpdate.action"><b>Tentar Novamente</a></td>
	    <td><a href="principal.action"><b> Retornar ao Menu Principal</a></td>
	     </tr>
	</table>	<br><br>
	 <table>
		<tr><td align="center" style="font:bold;color:red"> 
                <s:actionerror/>
                <s:actionmessage/></td>
     </table>		 	
