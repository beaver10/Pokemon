package com.iu.s2.pokemon;

import java.sql.Date;


public class NoticeDTO {
	
	private Long noticeNum;
	private String noticeName;
	private String noticeDetail;
	private String id;
	private Date day;
	private Long viewTotal;
	private TrainerDTO trainerDTO;
	

	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TrainerDTO getTrainerDTO() {
		return trainerDTO;
	}
	public void setTrainerDTO(TrainerDTO trainerDTO) {
		this.trainerDTO = trainerDTO;
	}
	public Long getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Long noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getNoticeName() {
		return noticeName;
	}
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	public String getNoticeDetail() {
		return noticeDetail;
	}
	public void setNoticeDetail(String noticeDetail) {
		this.noticeDetail = noticeDetail;
	}

	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public Long getViewTotal() {
		return viewTotal;
	}
	public void setViewTotal(Long viewTotal) {
		this.viewTotal = viewTotal;
	}
	
	
	
	

}
