

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;

public class studDemo extends HttpServlet {
	
	//@WebServlet("/studDemo")
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
        
		int rno=Integer.parseInt(request.getParameter("t1"));
		String name=request.getParameter("t2");
		String cla=request.getParameter("t3");
		int marks=Integer.parseInt(request.getParameter("t4"));
		float per=marks/6;
		String g="";
		if(per>=80) 
		    g="o";
		else if(per>=70)
			g="A+";
		else if(per>=60)
			g="A";
		else if(per>=50)
			g="B+";
		else if(per>=35)
			g="B";
		else
		    g="Fail";
		pw.println("<table border=1>");
		pw.println("<tr><th>Roll No"+"<th>Name"+"<th>Class"+"<th>Total Marks"+"<th>percentage"+"<th>Grade</tr>");
		pw.println("<tr><td>"+rno+"<td>"+name+"<td>"+cla+"<td>"+marks+""+"<td>"+per+"<td>"+g+"</tr>");
		
		pw.println("</table>");
		
		pw.println("<h5>Roll NO="+rno);
		pw.println("<h5>Name="+name);
		pw.println("<h5>Class="+cla);
		pw.println("<h5>Total ="+marks);
		pw.println("<h5>Roll NO="+per);
		pw.println("<h5>Roll NO="+g);
		
		
		}
	}


