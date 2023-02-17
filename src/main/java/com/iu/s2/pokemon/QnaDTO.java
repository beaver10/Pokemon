package com.iu.s2.pokemon;

import oracle.sql.DATE;

public class QnaDTO {
	
	private Integer qnaNum;
	private String qnaName;
	private String qnaDetail;
	private DATE day;
	private Integer viewTotal;
	private TrainerDTO trainerDTO;
	
	
	
	public Integer getQnaNum() {
		return qnaNum;
	}
	public void setQnaNum(Integer qnaNum) {
		this.qnaNum = qnaNum;
	}
	public String getQnaName() {
		return qnaName;
	}
	public void setQnaName(String qnaName) {
		this.qnaName = qnaName;
	}
	public String getQnaDetail() {
		return qnaDetail;
	}
	public void setQnaDetail(String qnaDetail) {
		this.qnaDetail = qnaDetail;
	}
	public DATE getDay() {
		return day;
	}
	public void setDay(DATE day) {
		this.day = day;
	}
	public Integer getViewTotal() {
		return viewTotal;
	}
	public void setViewTotal(Integer viewTotal) {
		this.viewTotal = viewTotal;
	}
	public TrainerDTO getTrainerDTO() {
		return trainerDTO;
	}
	public void setTrainerDTO(TrainerDTO trainerDTO) {
		this.trainerDTO = trainerDTO;
	}

	
	

}
