package myentities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {
	
	@Column(name="job_name")
	private String jobnm;
	
	@Column(name="age_category")
	private String agecat;
	
	@Column(name="job_location")
	private String jobloc;
	
	@Column(name="job_gender")
	private String jobgen;
	
	@Column(name="contact")
	private String contact;
	
	@Column(name="apply_date")
	private String applydate;
	
	@Column(name="qualification")
	private String qualification;
	/**
	 * @return the jobnm
	 */
	public String getJobnm() {
		return jobnm;
	}
	/**
	 * @param jobnm the jobnm to set
	 */
	public void setJobnm(String jobnm) {
		this.jobnm = jobnm;
	}
	/**
	 * @return the agecat
	 */
	public String getAgecat() {
		return agecat;
	}
	/**
	 * @param agecat the agecat to set
	 */
	public void setAgecat(String agecat) {
		this.agecat = agecat;
	}
	/**
	 * @return the jobloc
	 */
	public String getJobloc() {
		return jobloc;
	}
	/**
	 * @param jobloc the jobloc to set
	 */
	public void setJobloc(String jobloc) {
		this.jobloc = jobloc;
	}
	/**
	 * @return the jobgen
	 */
	public String getJobgen() {
		return jobgen;
	}
	/**
	 * @param jobgen the jobgen to set
	 */
	public void setJobgen(String jobgen) {
		this.jobgen = jobgen;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the applydate
	 */
	public String getApplydate() {
		return applydate;
	}
	/**
	 * @param applydate the applydate to set
	 */
	public void setApplydate(String applydate) {
		this.applydate = applydate;
	}
	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}
	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
}
