package com.iu.s2.pokemon;

import java.sql.Date;


public class NoticeDTO {
	
	private Integer noticeNum;
	private String noticeName;
	private String noticeDetail;
	private Date day;
	private Integer viewTotal;
	private TrainerDTO trainerDTO;
	

	
	
	
	
	
	public TrainerDTO getTrainerDTO() {
		return trainerDTO;
	}
	public void setTrainerDTO(TrainerDTO trainerDTO) {
		this.trainerDTO = trainerDTO;
	}
	public Integer getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(Integer noticeNum) {
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
	public Integer getViewTotal() {
		return viewTotal;
	}
	public void setViewTotal(Integer viewTotal) {
		this.viewTotal = viewTotal;
	}
	
	
	
	

}
