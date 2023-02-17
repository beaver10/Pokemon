package com.iu.s2.util;

public class Pager1 {
	
	//검색 종류 (사용할 column)
	private String kind;
	//검색어
	private String search;
	
	
	//한페이지에 출력할 Row의 갯수
	private Long perPage;
	
	//한 블럭당 출력할 번호의 갯수
	private Long perBlock;
	
	//전체 페이지 갯수
	private Long totalPage;
	
	//Client가 보고싶은 페이지 번호(parameter)
	private Long page;
	
	//테이블에서 조회할 시작 번호
	private Long startRow;
	//끝 번호
	private Long lastRow;
	
	//전체 row의 갯수를 담을 변수
	private Long totalCount;
	
	private Long startNum;
	private Long lastNum;
	
	private boolean before;
	private boolean after;
	
	
	public void makeRow() {
		
		this.startRow=(this.getPage()-1)*this.getPerPage()+1;
		this.lastRow = this.getPage()*this.getPerPage();
	}
	
	public void makeNum(Long totalCount) {
		this.totalPage = totalCount/this.getPerPage();
		if(totalCount%this.getPerPage()!=0) {
			totalPage++;
		}
		if(this.getPerPage()>totalPage) {
			this.setPage(totalPage);
		}
		
		Long totalBlock = totalPage/this.getPerBlock();
		if(totalPage%perBlock!=0) {
			totalBlock++;
		}
		
		Long curBlock = this.getPage()/this.getPerBlock();
		if(this.getPage()%this.getPerBlock()!=0) {
			curBlock++;
		}
		
		this.startNum = (curBlock-1)*this.getPerBlock()+1;
		this.lastNum = curBlock*this.getPerBlock();
		
		this.after=true;
		if(curBlock==totalBlock) {
			lastNum = totalPage;
			this.after=false;
		}
		
		if(curBlock==1) {
			this.before=true;
		}
		
	}
	
	public Pager1() {
		this.perPage=10L;
	}
	
	
	
	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(search==null) {
			search="";
		}
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public Long getPerPage() {
		if(this.perPage==null || this.perPage==0) {
			this.perPage=10L;
		}
		return perPage;
	}
	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getPerBlock() {
		if(this.perBlock==null||this.perBlock<1) {
			this.perBlock=5L;
		}
		return perBlock;
	}
	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}
	public Long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getPage() {
		if(this.page==null||this.page<1) {
			this.page=1L;
		}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	public Long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public boolean isBefore() {
		return before;
	}
	public void setBefore(boolean before) {
		this.before = before;
	}
	public boolean isAfter() {
		return after;
	}
	public void setAfter(boolean after) {
		this.after = after;
	}
	
	
	
	

}
