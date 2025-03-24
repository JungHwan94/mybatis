package com.mybatis.board.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

import com.mybatis.board.vo.Reply;

public class ReplyInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int boardNo = Integer.parseInt(request.getParameter("bno"));
		
		ArrayList<Reply> list = bService.selectReplyList(boardNo);
		
		response.setContentType("application/json");
		// response.getWriter().print(new Gson().toJson(reply)); << 여기 문장 == 밑에 3줄짜리 문장
		Gson gson = new Gson();
		String json = gson.toJson(gson);
		response.getWriter().print(json);
	}

}
