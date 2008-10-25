<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link href="<s:url value="/css/main2.css"/>" rel="stylesheet" type="text/css"/>
    <title><s:text name="label.pessoas"/></title>
</head>
<body background="/condominio/imagens/fundook.jpg">
<table><div><td height="150"></td></div></table>
<h1><s:text name="Pessoas Cadastradas"/></h1>		   
	<table width=600 align=center>
	    <tr> <s:url id="insert" action="setUpForInsertOrUpdate"/>
	         <td><s:a href="%{insert}"><b>Incluir Cadastro</s:a></td>
	         <td><a href="principal.action"><b>Retornar ao Menu Principal</a></td>
	          
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
        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
            <td class="nowrap"><s:property value="P_cpf"/></td>
            <td class="nowrap"><s:property value="P_nome"/></td>
            <td class="nowrap"><s:property value="P_telefone"/></td>
            <td class="nowrap"><s:property value="unidade.U_numero"/></td>
                      <td class="nowrap">
                        <s:url id="delete" action="delete">
		       		   <s:param name="pessoa.P_cpf" value="P_cpf"/>
		       		   </s:url>
		       		   <s:a href="%{delete}">Apagar</s:a>
		       		  
            </td>
            
    </tr>
    </s:iterator>
	
    </table>
</body>
</html>