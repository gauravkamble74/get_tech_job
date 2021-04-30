package myservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import myentities.Job;

/**
 * Servlet implementation class ModifyJob
 */
@WebServlet("/ModifyJob")
public class ModifyJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String jnm, jcat, jloc, jgen, jcnt, jappdt, jqal, jcmp,jid;
		
		
		try
		{
			jnm=request.getParameter("jnm");
			jcat=request.getParameter("agcat");
			jloc=request.getParameter("jloc");
			jgen=request.getParameter("jgen");
			jcnt=request.getParameter("jcon");
			jappdt=request.getParameter("appdt");
			jqal=request.getParameter("qual");
			jcmp=request.getParameter("cid");
			jid=request.getParameter("jid");
			
			HttpSession s=request.getSession(true);
			
			Session ses;
			Configuration cfg=new Configuration().configure();
			SessionFactory sf=cfg.addAnnotatedClass(Job.class).buildSessionFactory();
			ses=sf.getCurrentSession();
			ses.beginTransaction();
			
			Job obj=new Job();
			obj.setJobnm(jnm);
			obj.setAgecat(jcat);
			obj.setJobloc(jloc);
			obj.setJobgen(jgen);
			obj.setContact(jcnt);
			obj.setApplydate(jappdt);
			obj.setQualification(jqal);
			obj.setJobcmp(jcmp);
			obj.setJid(jid);
			
			ses.save(obj);
			ses.getTransaction().commit();
			
			//out.println("<h3>New Show Registered Successfully</h3>");
			s.setAttribute("msg", "New Job Registered Successfully");
			response.sendRedirect("Success.jsp");
		}
		catch(Exception e)
		{
			out.print(e);
		}


	}

}
