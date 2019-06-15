package com.bridgelabz.login;

public class MailModel {

	private String body;
	private String to;
	private String from;
	private String subject;

	public MailModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "MailModel [body=" + body + ", to=" + to + ", from=" + from + ", subject=" + subject + "]";
	}

}
