package com.iu.s2.pokemon;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s2.util.Pager1;

@Repository
public class NoticeDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.s2.pokemon.Notice.";
	
	
	public Long getNoticeCount(Pager1 pager1) {
		return sqlSession.selectOne(NAMESPACE+"getNoticeCount", pager1);
	}
	
	public List<NoticeDTO> getNoticeList(Pager1 pager1) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getNoticeList", pager1);
	}

	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception {
		 return sqlSession.selectOne(NAMESPACE+"getNoticeDetail", noticeDTO);
	 }

	public int setNoticeAdd(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setNoticeAdd", noticeDTO);
	}

	public int setNoticeUpdate(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setNoticeUpdate", noticeDTO);
	}

	public int setQnaDelete(QnaDTO qnaDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setQnaDelete",qnaDTO);
	}	
	
	

}
