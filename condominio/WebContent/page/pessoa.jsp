<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link href="<s:url value="/css/main2.css"/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.pessoas"/></title>
</head>
<body background="/condominio/imagens/fundook.jpg">
<table><div><td height="150"></td></div></table>
<h1><s:text name="Pessoa pesquisada"/></h1>		   
	<table width=600 align=center>
	    <tr> <s:url id="insert" action="consultarPessoa"/>
	         <td><s:a href="%{insert}"><b>Incluir Cadastro</s:a></td>
	     </tr>
	</table><br/>
<table align=center class="borderAll">
    <tr>
        <th><s:text name="label.P_cpf"/></th>
        <th><s:text name="label.P_nome"/></th>
        <th><s:text name="label.P_telefone"/></th>
        <th><s:text name="label.unidade"/></th>	 
        <th>&nbsp;</th>
    </tr>
   <s:iterator value="pessoas" status="status">
        <tr class="<s:if test="#status.even">even</s:if><s:else>add</s:else>">
            <td class="nowrap"><s:property value="pessoa.P_cpf"/></td>
            <td class="nowrap"><s:property value="pessoa.P_nome"/></td>
            <td class="nowrap"><s:property value="pessoa.P_telefone"/></td>
            <td class="nowrap"><s:property value="pessoa.unidade.U_numero"/></td>
        </tr>  		
	 </s:iterator>
    </table>
</body>
</html>