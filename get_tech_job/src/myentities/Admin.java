package myentities;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Admin {
	@Id
	@Column(name="admin_id")
	private String adminid;
	
	@Column(name="admin_name")
	private String adminnm;
	
	@Column(name="mob_no")
	private String mobno;
	
	@Column(name="email")
	private String email;
	
	@Column(name="profile_photo")
	private Blob profie;
	
	@Column(name="admin_pswd")
	private String pass;
	/**
	 * @return the adminid
	 */
	public String getAdminid() {
		return adminid;
	}
	/**
	 * @param adminid the adminid to set
	 */
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	/**
	 * @return the adminnm
	 */
	public String getAdminnm() {
		return adminnm;
	}
	/**
	 * @param adminnm the adminnm to set
	 */
	public void setAdminnm(String adminnm) {
		this.adminnm = adminnm;
	}
	/**
	 * @return the mobno
	 */
	public String getMobno() {
		return mobno;
	}
	/**
	 * @param mobno the mobno to set
	 */
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the profie
	 */
	public Blob getProfie() {
		return profie;
	}
	/**
	 * @param profie the profie to set
	 */
	public void setProfie(Blob profie) {
		this.profie = profie;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
}
