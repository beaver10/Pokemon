package com.iu.s2.pokemon;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s2.util.Pager1;


@Repository
public class QnaDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.s2.pokemon.QnaDAO.";
	
	public Long getQnaCount(Pager1 pager1)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getQnaCount", NAMESPACE);
	}
	
	
	//getQnaList
	public List<QnaDTO> getQnaList(Pager1 pager1)throws Exception {
		return sqlSession.selectList(NAMESPACE+"getQnaList",pager1);
	}
	//getQnaDetail
	public QnaDTO getQnaDetail(QnaDTO qnaDTO) throws Exception {
		 return sqlSession.selectOne(NAMESPACE+"getQnaDetail", qnaDTO);
	 }
	//setQnaAdd
	public int setQnaAdd(QnaDTO qnaDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"setQnaAdd",qnaDTO );
	}
	//setQnaUpdate
	public int setQnaUpdate(QnaDTO qnaDTO)throws Exception{
		return sqlSession.update(NAMESPACE+"setQnaUpdate", qnaDTO);
	}
	//setQnaDelete
	public int setQnaDelete(QnaDTO qnaDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setQnaDelete",qnaDTO);
	}
	
}
