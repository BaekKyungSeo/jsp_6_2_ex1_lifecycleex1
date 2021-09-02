package com.siyeon.ex;

import java.io.IOException;
import javax.annotation.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleEx
 */
@WebServlet("/LifeCycleEx")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycleEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("���� ��ü�� ������ �� init �ż��尡 ȣ��Ǿ����ϴ�!");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("�ڿ��� �����Ǿ� destroy �޼��尡 ȣ��Ǿ����ϴ�!");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doGet �޼��尡 ȣȣ��Ǿ����ϴ�!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("doPost �޼��尡 ȣȣ��Ǿ����ϴ�!");
		
	}
	@PostConstruct
	private void initPostConstruct() {
		// TODO Auto-generated method stub
		System.out.println("initPostConstruct �޼ҵ尡 ȣ��Ǿ����ϴ�.");
	}
	@PreDestroy
	private void destoryPreDestroy() {
		// TODO Auto-generated method stub
		System.out.println("destoryPreDestroy");
	}
	
}
