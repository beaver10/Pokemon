package com.iu.s2.pokemon;

import java.sql.Date;


public class NoticeDTO {
	
	private Long num;
	private String title;
	private String contents;
	private String id;
	private Date regdate;
	private Long hit;
	private TrainerDTO trainerDTO;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String writer) {
		this.id = writer;
	}
	public TrainerDTO getTrainerDTO() {
		return trainerDTO;
	}
	public void setTrainerDTO(TrainerDTO trainerDTO) {
		this.trainerDTO = trainerDTO;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	public String getcontents() {
		return contents;
	}
	public void setcontents(String contents) {
		this.contents = contents;
	}

	public Date getregdate() {
		return regdate;
	}
	public void setregdate(Date regdate) {
		this.regdate = regdate;
	}
	public Long gethit() {
		return hit;
	}
	public void sethit(Long hit) {
		this.hit = hit;
	}
	
	
	
	

}
