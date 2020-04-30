package com.rana.javabeans;

public class PatientCommand {
	
	private String patName ;
	private Integer age;
	private String location ;
	private String hospital ;
	private String vflag="no";
	
	public String getVflag() {
		return vflag;
	}

	public void setVflag(String vflag) {
		this.vflag = vflag;
	}

	public PatientCommand() {
		System.out.println("PatientCommand::0 param constructor ");
	}
	
	public String getPatName() {
		return patName;
	}
	public void setPatName(String patName) {
		this.patName = patName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}
