package com.iu.s2.pokemon;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s2.util.Pager1;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Autowired
	private ServletContext servletContext;
	
	public List<NoticeDTO> getNoticeList(Pager1 pager1) throws Exception{
		Long totalCount = noticeDAO.getNoticeCount(pager1);
		pager1.makeRow();
		pager1.makeNum(totalCount);
		return noticeDAO.getNoticeList(pager1);
	}
	
	
}
