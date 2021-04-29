package myentities;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@Column(name="user_id")
	private String userid;
	
	@Column(name="user_name")
	private String usernm;
	
	@Column(name="pswd")
	private String pswd;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="mob_no")
	private String mobno;
	
	@Column(name="current_occupation")
	private String curr_occup;
	
	@Column(name="martial_status")
	private String mar_status;
	
	@Column(name="intrest_scope")
	private String interest;
	
	@Column(name="aadhar_no")
	private String aadharno;
	
	@Column(name="reg_time")
	private String regtime;
	
	@Column(name="user_email")
	private String useremail;
	
	@Column(name="profile_photo")
	private Blob profile;
	
	@Column(name="home_address")
	private String homeadd;
	
	@Column(name="work_address")
	private String workadd;
	
	@Column(name="user_status")
	private int userstatus;
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the usernm
	 */
	public String getUsernm() {
		return usernm;
	}
	/**
	 * @param usernm the usernm to set
	 */
	public void setUsernm(String usernm) {
		this.usernm = usernm;
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
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
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
	 * @return the curr_occup
	 */
	public String getCurr_occup() {
		return curr_occup;
	}
	/**
	 * @param curr_occup the curr_occup to set
	 */
	public void setCurr_occup(String curr_occup) {
		this.curr_occup = curr_occup;
	}
	/**
	 * @return the mar_status
	 */
	public String getMar_status() {
		return mar_status;
	}
	/**
	 * @param mar_status the mar_status to set
	 */
	public void setMar_status(String mar_status) {
		this.mar_status = mar_status;
	}
	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}
	/**
	 * @param interest the interest to set
	 */
	public void setInterest(String interest) {
		this.interest = interest;
	}
	/**
	 * @return the aadharno
	 */
	public String getAadharno() {
		return aadharno;
	}
	/**
	 * @param aadharno the aadharno to set
	 */
	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
	/**
	 * @return the regtime
	 */
	public String getRegtime() {
		return regtime;
	}
	/**
	 * @param regtime the regtime to set
	 */
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	/**
	 * @return the useremail
	 */
	public String getUseremail() {
		return useremail;
	}
	/**
	 * @param useremail the useremail to set
	 */
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	/**
	 * @return the profile
	 */
	public Blob getProfile() {
		return profile;
	}
	/**
	 * @param profile the profile to set
	 */
	public void setProfile(Blob profile) {
		this.profile = profile;
	}
	/**
	 * @return the homeadd
	 */
	public String getHomeadd() {
		return homeadd;
	}
	/**
	 * @param homeadd the homeadd to set
	 */
	public void setHomeadd(String homeadd) {
		this.homeadd = homeadd;
	}
	/**
	 * @return the workadd
	 */
	public String getWorkadd() {
		return workadd;
	}
	/**
	 * @param workadd the workadd to set
	 */
	public void setWorkadd(String workadd) {
		this.workadd = workadd;
	}
	/**
	 * @return the userstatus
	 */
	public int getUserstatus() {
		return userstatus;
	}
	/**
	 * @param userstatus the userstatus to set
	 */
	public void setUserstatus(int userstatus) {
		this.userstatus = userstatus;
	}
	
	
}
