package servlet_calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/cal")
public class AllInOneCalculator extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		double a= Integer.parseInt(req.getParameter("num1"));
		double b= Integer.parseInt(req.getParameter("num2"));
		
		String  st=req.getParameter("btn");
		 //char sat=req.getParameter("btn").charAt(0);
		
	switch (st) {
	case "+":
PrintWriter printWriter=res.getWriter();
		
		printWriter.print("The sum of"+ a +" and "+ b +" is "+ (a+b) +" ");
		break;
   case "-":
	   PrintWriter printWriter1=res.getWriter();
		
		printWriter1.print("The difference of"+ a +" and "+ b +" is "+ (a-b) +" ");
		break;
   case "*":
	   PrintWriter printWriter2=res.getWriter();
		
		printWriter2.print("The mutiple of"+ a +" and "+ b +" is "+ (a*b) +" ");
	break;
    case "/":
PrintWriter printWriter3=res.getWriter();
		
		printWriter3.print("The division of"+ a +" and "+ b +" is "+ (a/b) +" ");
	break;

	default:
		break;
	}
		
	}

}
