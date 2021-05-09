package myservlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import myentities.*;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterUser() {
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
		
		String unm,uid,psw,dob,gen,mob,mail,aadhar,mar,lang,cocp,hadd,wadd;
		
		Part filePart = request.getPart("file"); // Retrieves <input type="file" name="file">
	    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
	    InputStream fileContent = filePart.getInputStream();
	    
	    
	    
	    
	    try
	    {
	    	uid=request.getParameter("uid");
	    	unm=request.getParameter("unm");
	    	psw=request.getParameter("psw");
	    	dob=request.getParameter("dob");
	    	gen=request.getParameter("gen");
	    	mob=request.getParameter("mob");
	    	mail=request.getParameter("email");
	    	aadhar=request.getParameter("aadharno");
	    	mar=request.getParameter("sque");
	    	cocp=request.getParameter("cocp");
	    	hadd=request.getParameter("hadd");
	    	wadd=request.getParameter("wadd");
	    	
	    	HttpSession s=request.getSession(true);
	    	
	    	Session ses;
	    	Configuration cfg=new Configuration().configure();
	    	SessionFactory sf=cfg.addAnnotatedClass(Users.class).buildSessionFactory();
	    	ses=sf.getCurrentSession();
	    	ses.beginTransaction();
	    	
	    	DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
	    	Date date = df.parse(dob);
	    	
	    	
	    	Users obj=new Users();
	    	obj.setUserid(uid);
	    	obj.setUsernm(unm);
	    	obj.setPswd(psw);
	    	obj.setDob(date);
	    	obj.setGender(gen);
	    	obj.setMobno(mob);
	    	obj.setUseremail(mail);
	    	obj.setAadharno(aadhar);
	    	obj.setMar_status(mar);
	    	obj.setCurr_occup(cocp);
	    	obj.setHomeadd(hadd);
	    	obj.setWorkadd(wadd);
	    	
	    	ses.save(obj);
	    	ses.getTransaction().commit();
	    	
	    	s.setAttribute("msg", "Your Registertion Successfully");
	    	
	    	response.sendRedirect("Success.jsp");
	    	
	    	
	    	
	    	
	    }
		catch(Exception e)
	    {
			e.printStackTrace();
	    }
		
		
	}

}
