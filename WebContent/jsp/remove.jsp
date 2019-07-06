<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
$(function () {

	$.getJSON("../IndexServlet", findjurisdictionData);
});

function findjurisdictionData(data) {
	if(data == "资料管理员"){
		$("#head2").remove();
		$("#head3").remove();
		$("#head4").remove();
		$("#head5").remove();
	}
	else if(data == "灾情管理员"){
		$("#head1").remove();
		$("#head3").remove();
		$("#head4").remove();
		$("#head5").remove();
	}
	else if (data == "专家管理员") {
		$("#head1").remove();
		$("#head2").remove();
		$("#head4").remove();
		$("#head5").remove();
	}
	else if (data == "库房管理员") {
		$("#head1").remove();
		$("#head2").remove();
		$("#head3").remove();
		$("#head5").remove();
	}
} 