package com.esuyolu.jspcontexts.conversion;

public class EmailAddress {
	private String user;
	private String domain;
	private String extension;
	
	public EmailAddress() {}
	
	public EmailAddress(String user, String domain, String extension) {
		this.user = user;
		this.domain = domain;
		this.extension = extension;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
}
