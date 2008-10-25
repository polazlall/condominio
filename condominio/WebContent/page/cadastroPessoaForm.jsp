<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <link href="<s:url value="/css/main2.css"/>" rel="stylesheet" type="text/css"/>
</head>
<body background="/condominio/imagens/fundook.jpg">
<center>
  ,!-- <s:if test="pessoa==null || pessoa.P_cpf == null">
	 <table><div><td height="150"></td></div></table>-->
	 <h1><s:text name="Cadastro de Pessoa"/></h1>  <br><br><br>
   </s:if>
 </h1>
	<table width=600 align=center>
	    <tr><td><a href="getAllPessoas.action"><b>Listar Cadastros</a></td>
	    <td><a href="principal.action"><b>Retornar ao Menu Principal</a></td>
	     </tr>
	</table>	 
	  	
    <s:form action="insertOrUpdate">
     <table align="center" class="borderAll">
     	 
         <tr><td class="tdLabel"><s:text name="label.P_cpf"/></td>
         	        <td><s:textfield name="pessoa.p_cpf" size="11"/></td>
         </tr>
        <tr>
            <td class="tdLabel"><s:text name="label.P_nome"/></td>
                            <td><s:textfield name="pessoa.p_nome" size="30"/></td>
        </tr>
        <tr><td class="tdLabel"><s:text name="label.P_telefone"/></td>
        	                <td><s:textfield name="pessoa.p_telefone" size="13"/></td>
        </tr>
        
         <tr>
             <td class="tdLabel"><s:text name="label.unidade"/></td>
            <td><s:select name="unidade.U_numero" 
                list="unidades" 
                listKey="U_numero" 
                listValue="U_numero"
                />
            </td>
             <s:hidden name="unidade.U_numero"/>
        </tr>
        <tr>
        <td><b>Morador<s:checkbox name="cad_mor" value="aBoolean" fieldValue="true" /></td>
        <td><b>Proprietário<s:checkbox name="cad_prop" value="aBoolean" fieldValue="true" /></td>
        
        </tr>
    </table>
    		 <br/>
    <table> 
    	     <tr>
    		    <td><s:submit action="insertOrUpdate" key="button.label.submit" cssClass="butStnd"/></td>
    	        <td><s:reset key="button.label.cancel" cssClass="butStnd"/></td>
    		 <tr>
    </table> 		  		 
    	</s:form>
</center>		
</body>
</html>
