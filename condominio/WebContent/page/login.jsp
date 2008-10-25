<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login Edifício Porto Seguro</title>
<link href="<s:url value="/css/main.css"/>" rel="stylesheet"
	type="text/css" />
</head>
<body>
<s:form action="acao" method="POST"><br><br><br><br><br><br><br><br><br><br><br><br>
<table width="411"  border="1" cellpadding="0" cellspacing="0"  bordercolor="#000000" align="center">
  <tr bordercolor="#FFFFFF"> 
    <td width="10" height="30" colspan="1" valign="middle" bordercolor="#FFFFFF" bgcolor="#FFFFFF"> 
      <div align="center"><img src="/condominio/imagens/caixa.jpg" width="64" height="80"></div></td>
    <td colspan="3" valign="middle" bordercolor="#FFFFFF" bgcolor="#FFFFFF"> <div align="center">
        <p><font color="#666666" size="1" face="Verdana, Arial, Helvetica, sans-serif">Por Favor entre com<br>
                   nome e senha para entrar no sistema<br></font></p>
      </div></td>
  </tr>
  <tr> 
    <td width="87" height="26" bordercolor="#FFFFFF">&nbsp;</td>
    <td width="198" bordercolor="#FFFFFF"></td>
    <td width="148" bordercolor="#FFFFFF"></td>
    <td width="68"></td>
  </tr>
  <tr> 
    <td height="240"></td>
    <td colspan="2" valign="top" bgcolor="#FFFFFF"> <table width="100%" border="0" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
        <!--DWLayoutTable-->
        <tr> 
          <td height="28" colspan="2" valign="middle" bgcolor="#0099CC"> <div align="center"><b><font size="2" face="Verdana, Arial, Helvetica, sans-serif" color="#FFFFFF">Login 
              de Usuário</font></b></div></td>
        </tr>

	<tr>
		<td>
			<s:actionerror />
			<s:fielderror />
	</td>
	</tr>
	<s:textfield name="login" label="Nome" />
	<s:password name="password" label="Senha" />
	<s:submit value="Login" align="center" />
	
</s:form>
</table>
</body>
</html>
