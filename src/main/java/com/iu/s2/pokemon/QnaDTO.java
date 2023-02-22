package com.iu.s2.pokemon;

import oracle.sql.DATE;

public class QnaDTO {
	
	private Integer qnaNum;
	private String qnaName;
	private String qnaDetail;
	private String id;
	private String regdate;
	private Integer hit;
	private TrainerDTO trainerDTO;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getregdate() {
		return regdate;
	}
	public void setregdate(String regdate) {
		this.regdate = regdate;
	}
	public Integer gethit() {
		return hit;
	}
	public void sethit(Integer hit) {
		this.hit = hit;
	}
	public TrainerDTO getTrainerDTO() {
		return trainerDTO;
	}
	public void setTrainerDTO(TrainerDTO trainerDTO) {
		this.trainerDTO = trainerDTO;
	}

	
	

}
