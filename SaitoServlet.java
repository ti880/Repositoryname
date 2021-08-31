import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaitoServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("inputtext");
        req.setAttribute("text", name);

        RequestDispatcher dis = req.getRequestDispatcher("saitoresult.jsp");
        dis.forward(req, res);
	}
}
