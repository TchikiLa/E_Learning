<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page session="true"%>
<%@ page trimDirectiveWhitespaces="true"%>
<% 
	
	String locale = "fr_FR";
%>
<fmt:setLocale value="${locale }"/>
<fmt:bundle basename="com.stock.mvc.i18n.applicationResources"/>
