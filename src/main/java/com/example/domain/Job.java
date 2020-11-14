package com.example.domain;

public class Job {
	
	private Integer id;
	
	private String siteName;
	
	private String companyName;
	
	private String jobType;
	
	private String codingLanguages;
	
	private String location;
	
	private String phoneNumber;
	
	private String businessDetails;
	
	private String url;
	
	private String published;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getCodingLanguages() {
		return codingLanguages;
	}

	public void setCodingLanguages(String codingLanguages) {
		this.codingLanguages = codingLanguages;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBusinessDetails() {
		return businessDetails;
	}

	public void setBusinessDetails(String businessDetails) {
		this.businessDetails = businessDetails;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", siteName=" + siteName + ", companyName=" + companyName + ", jobType=" + jobType
				+ ", codingLanguages=" + codingLanguages + ", location=" + location + ", phoneNumber=" + phoneNumber
				+ ", businessDetails=" + businessDetails + ", url=" + url + ", published=" + published + "]";
	}
	
}
