package kr.bit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.bit.model.MemberDAO;
import kr.bit.model.MemberVO;

@WebServlet("/memberList.do")
public class MemberListController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.클라이언트의 요청을 받기(memberList.do)
		// 2.회원 전체 리스트 가져오기(Model 연동)
		MemberDAO dao=new MemberDAO();
		ArrayList<MemberVO> list=dao.memberList();
		// 3. 회원 전체 리스트를 HTML로 만들어서 응답하기
		// 4...

	}

}
