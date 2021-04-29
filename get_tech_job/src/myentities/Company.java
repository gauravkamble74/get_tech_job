package myentities;

import java.sql.Blob;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Company {
	@Id
	@Column(name="company_id")
	private String cmpid;
	
	@Column(name="company_name")
	private String cmpnm;
	
	@Column(name="company_email")
	private String email;
	
	@Column(name="company_pswd")
	private String pswd;
	
	@Column(name="company_logo")
	private Blob logo;
	
	@Column(name="company_id_admin")
	private String cmpid_admin;
	/**
	 * @return the cmpid
	 */
	public String getCmpid() {
		return cmpid;
	}
	/**
	 * @param cmpid the cmpid to set
	 */
	public void setCmpid(String cmpid) {
		this.cmpid = cmpid;
	}
	/**
	 * @return the cmpnm
	 */
	public String getCmpnm() {
		return cmpnm;
	}
	/**
	 * @param cmpnm the cmpnm to set
	 */
	public void setCmpnm(String cmpnm) {
		this.cmpnm = cmpnm;
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
	 * @return the pswd
	 */
	public String getPswd() {
		return pswd;
	}
	/**
	 * @param pswd the pswd to set
	 */
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	/**
	 * @return the logo
	 */
	public Blob getLogo() {
		return logo;
	}
	/**
	 * @param logo the logo to set
	 */
	public void setLogo(Blob logo) {
		this.logo = logo;
	}
	/**
	 * @return the cmpid_admin
	 */
	public String getCmpid_admin() {
		return cmpid_admin;
	}
	/**
	 * @param cmpid_admin the cmpid_admin to set
	 */
	public void setCmpid_admin(String cmpid_admin) {
		this.cmpid_admin = cmpid_admin;
	}
	
	
}
