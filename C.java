package Action;


import Dao.UserDao;
import Entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

public class LoginAction extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserDao udao = new UserDao();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8"); 
    	String imageText = request.getParameter("image"); 
		String text = (String) request.getSession().getAttribute("text");
		if (!text.equalsIgnoreCase(imageText)) {
			request.setAttribute("imageMess", "��֤���������!"); 
			request.getRequestDispatcher("index.jsp").forward(request, response); 
			return;
		}
		
		String username = request.getParameter("username"); 
		String password = request.getParameter("password"); 
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        
		// ͼƬ����֤�� 
        //text = (String) request.getSession().getAttribute("text"); 
        
        request.getSession().setAttribute("adminname", user);
        //��֤�û���������
        String result = udao.login(user);
        if(result.equals("true")){
        	request.setAttribute("adminname", user.getName());
        	response.sendRedirect("main.jsp");
           //request.getRequestDispatcher("main.jsp").forward(request, response);
        }
        else { 
			request.setAttribute("error", "�û������������!"); 
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    
    /*
    private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        HttpSession session = request.getSession();
        session.setMaxInactiveInterval(1);
        session.setAttribute("logout", "1");
        response.sendRedirect("/Library/index.jsp");
    }
    */

}