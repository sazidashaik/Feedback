package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="feedback")
@RequestMapping("/feedback")

public class FeedBack {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer feedBackId;
	
	@Column
	private Integer driverRating;
	
	@Column
	private Integer serviceRating;
	
	@Column
	private Integer overallRating;
	@Column
	private String comments;
	@Column 
	
	private LocalDate feedbackdate;
	/*@Column
	private  User users;
	@Column
	private Bus bus;*/
	
	public FeedBack() {}
	
	public FeedBack(Integer feedBackId, Integer driverRating, Integer serviceRating, Integer overallRating, String comments,
			LocalDate feedbackdate) {
		super();
		this.feedBackId = feedBackId;
		this.driverRating = driverRating;
		this.serviceRating = serviceRating;
		this.overallRating = overallRating;
		this.comments = comments;
		this.feedbackdate = feedbackdate;
		//this.users = users;
		//this.bus = bus;
	}

	public Integer getFeedBackId() {
		return feedBackId;
	}

	public void setFeedBackId(Integer feedBackId) {
		this.feedBackId = feedBackId;
	}
	public int getDriverRating() {
		return driverRating;
	}

	public void setDriverRating(Integer driverRating) {
		this.driverRating = driverRating;
	}

	public Integer getServiceRating() {
		return serviceRating;
	}

	public void setServiceRating(Integer serviceRating) {
		this.serviceRating = serviceRating;
	}

	public Integer getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(Integer overallRating) {
		this.overallRating = overallRating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public LocalDate getFeedbackdate() {
		return feedbackdate;
	}

	public void setFeedbackdate(LocalDate feedbackdate) {
		this.feedbackdate = feedbackdate;
	}

	/*public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}*/

	@Override
	public String toString() {
		return "Feedback [feedBackId=" + feedBackId + ", driverRating=" + driverRating + ", serviceRating="
				+ serviceRating + ", overallRating=" + overallRating + ", comments=" + comments + ", feedbackdate="
				+ feedbackdate + "]";
	}
	
	
	

}

