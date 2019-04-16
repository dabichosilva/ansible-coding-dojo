/**
 * 
 */
package com.walmart.det;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mdjsilv
 *
 */
public class HelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>Hello Servlet</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("Hello Servlet");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}
