package cybersoft.java11.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cybersoft.java11.controller.AuthController;

public class RegisterServlet extends HttpServlet{
	AuthController authController;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/HTML");
		String format = "<form method=\"POST\" action=\"\">\n"
				+ "		<label for=\"userName\">userName: </label>\n"
				+ "		<input type=\"text\" name=\"userName\" id=\"userID\">\n"
				+ "		<label for=\"passWord\">passWord: </label>\n"
				+ "		<input type=\"password\" name=\"passWord\" id=\"passWord\">\n"
				+ "		<label for=\"name\">name: </label>\n"
				+ "		<input type=\"text\" name=\"userName\" id=\"user\">\n"
				+ "		<label for=\"age\">age: </label>\n"
				+ "		<input type=\"text\" name=\"age\" id=\"userAge\">\n"
				+ "		<input type=\"submit\" value=\"resgister\">\n"
				+ "	</form>";
		pw.append(format);
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
//		super.init();
		authController = new AuthController();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/HTML");
		String userName = req.getParameter("userName");
		String password = req.getParameter("passWord");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		if(authController.register(userName, password, name, age)) {
			pw.append("Register successfully");
		} else {
			pw.append("change username");
		}
	}
}
