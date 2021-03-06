package com.project1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project1.controller.RequestHelper;

public class MasterServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		RequestHelper.process(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
		//System.out.println("MasterServer A");
		String targetURL = RequestHelper.process(req, res);
		//System.out.println("MasterServer B");
		req.getRequestDispatcher(targetURL).forward(req, res);
		//System.out.println("MasterServer C");
	}

}
