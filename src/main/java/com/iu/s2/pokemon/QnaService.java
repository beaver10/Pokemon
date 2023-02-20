package com.iu.s2.pokemon;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s2.util.Pager1;


@Service
public class QnaService { 
	
	@Autowired
	private QnaDAO qnaDAO;
//	getQnaList
	public List<QnaDTO> getQnaList(Pager1 pager1)throws Exception{

		pager1.makeRow();
		Long totalCount = qnaDAO.getQnaCount(pager1);
		pager1.makeNum(totalCount);
		
		return qnaDAO.getQnaList(pager1);
	}
	
//	getQnaDetail
	public QnaDTO getQnaDetail (QnaDTO qnaDTO)throws Exception{
		return qnaDAO.getQnaDetail(qnaDTO);
	}
///	setQnaAdd
	public int setQnaAdd(QnaDTO qnaDTO)throws Exception{;
	    return qnaDAO.setQnaAdd(qnaDTO);
	}
//	setQnaUpdate
	public int setQnaUpdate(QnaDTO qnaDTO)throws Exception{;
    return qnaDAO.setQnaUpdate(qnaDTO);
	}
//	setQnaDelete
    public int setQnaDelete(QnaDTO qnaDTO)throws Exception{;
    return qnaDAO.setQnaDelete(qnaDTO);
    }
	

	
	
	
	
	
	
	
	
	
	

}
