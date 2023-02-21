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

	public List<NoticeDTO> getNoticeList(Pager1 pager1)throws Exception{

		pager1.makeRow();
		Long totalCount = noticeDAO.getNoticeCount(pager1);
		pager1.makeNum(totalCount);
		
		return noticeDAO.getNoticeList(pager1);
	}

	public NoticeDTO getNoticeDetail (NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.getNoticeDetail(noticeDTO);
	}

	public int setNoticeAdd(NoticeDTO noticeDTO)throws Exception{;
	    return noticeDAO.setNoticeAdd(noticeDTO);
	}
	
	public int setNoticeUpdate(NoticeDTO noticeDTO)throws Exception{;
    return noticeDAO.setNoticeUpdate(noticeDTO);
	}

	public int setNoticeDelete(NoticeDTO noticeDTO)throws Exception{;
    return noticeDAO.setNoticeDelete(noticeDTO);
    }
	
}
