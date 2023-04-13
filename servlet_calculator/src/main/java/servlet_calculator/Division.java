package servlet_calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/div")
public class Division extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int a= Integer.parseInt(req.getParameter("num1"));
		int b= Integer.parseInt(req.getParameter("num2"));
		
		PrintWriter printWriter=res.getWriter();
		
		printWriter.print("The division of"+ a +" and "+ b +" is "+ (a/b) +" ");
		
	}

}
