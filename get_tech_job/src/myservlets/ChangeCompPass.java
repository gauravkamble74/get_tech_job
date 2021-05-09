package myservlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import myentities.Job;


/**
 * Servlet implementation class ChangeAdminPass
 */
@WebServlet("/ChangeCompPass")
public class ChangeCompPass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeCompPass() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
    	
    	HttpSession session = request.getSession(true);
    	String id=String.valueOf(session.getAttribute("user_id"));
    	out.println(id);
    	
    	String eps,nps,aid;
    	
    	eps=request.getParameter("eps");
    	nps=request.getParameter("nps");
    	aid=request.getParameter("aid");
    	
    	Connection con;
		PreparedStatement pst;
		ResultSet rs;
		int cnt;
    	
    	try {
    		
    		String loc = request.getParameter("loc");
			String skill = request.getParameter("skill");

			Session ses;
			Configuration cfg = new Configuration().configure();
			SessionFactory sf = cfg.addAnnotatedClass(Job.class).buildSessionFactory();
			ses = sf.getCurrentSession();
			ses.beginTransaction();

			Query q = ses.createQuery("from Job where job_location=:loc");
			q.setParameter("loc", loc);
			List lst = q.getResultList();
			
			
    		while(rs.next()) {
    			out.print("ADMIN VERIFIED");
    			//response.sendRedirect("genWalletID.jsp");
    			
    			pst=con.prepareStatement("update admin set admin_pswd=? where admin_id=?; ");
    			pst.setString(1, nps);
    			pst.setString(2, aid);
    			pst.executeUpdate();
    			out.println("password updated");
    		}
    		
    		con.close();
    	}
    	catch(Exception ex) {
    		out.print(ex);
    	}
	}

}
