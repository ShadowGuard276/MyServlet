package Com.avinash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out =res.getWriter();
		out.print("hi ");
	/*	ServletContext ctx = getServletContext(); //context
		String str=ctx.getInitParameter("phone");*/
		ServletConfig cg =getServletConfig();
		String str = cg.getInitParameter("name");//config
		out.print(str);
		
	}

}
