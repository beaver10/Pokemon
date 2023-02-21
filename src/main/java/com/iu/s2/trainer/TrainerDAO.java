package com.iu.s2.trainer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class TrainerDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.iu.s2.trainer.trainerDAO.";
	
	public int trainerJoin(TrainerDTO trainerDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"trainerJoin", trainerDTO);
		
	}
	
	public TrainerDTO getTrainerLogin(TrainerDTO trainerDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getTrainerLogin", trainerDTO);
	}
	
	public int setTrainerUpdate(TrainerDTO trainerDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setTrainerUpdate", trainerDTO);
	}
	
}
