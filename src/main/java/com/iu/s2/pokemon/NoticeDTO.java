package com.iu.s2.pokemon;

import java.sql.Date;


public class NoticeDTO {
	
	private Long num;
	private String title;
	private String contents;
	private String writer;
	private Date regdate;
	private Long hit;
	private TrainerDTO trainerDTO;
	
	
	
	public String getwriter() {
		return writer;
	}
	public void setwriter(String writer) {
		this.writer = writer;
	}
	public TrainerDTO getTrainerDTO() {
		return trainerDTO;
	}
	public void setTrainerDTO(TrainerDTO trainerDTO) {
		this.trainerDTO = trainerDTO;
	}
	public Long getnum() {
		return num;
	}
	public void setnum(Long num) {
		this.num = num;
	}
	public String gettitle() {
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
