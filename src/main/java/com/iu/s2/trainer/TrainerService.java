package com.iu.s2.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  

@Service
public class TrainerService {
	
	@Autowired
	private TrainerDAO trainerDAO;
	
	public int trainerJoin(TrainerDTO trainerDTO) throws Exception {
		int result = trainerDAO.trainerJoin(trainerDTO);
		return result;
	}
	
	public TrainerDTO getTrainerLogin(TrainerDTO trainerDTO)throws Exception{
		//trainerDTO: Client에서 입력한 ID,PW
		TrainerDTO result = trainerDAO.getTrainerLogin(trainerDTO);
		//result = ID와 일치하는 모든 정보
		
		//pw check
		if(result!=null && trainerDTO.getPw().equals(result.getPw())) {
			trainerDTO.setPw(null);
			return trainerDTO;
		}else {
			return null;
		}
		
	}
	
	
	public TrainerDTO getTrainerPage(TrainerDTO trainerDTO)throws Exception{
		return trainerDAO.getTrainerLogin(trainerDTO);
	}

	public int setTrainerUpdate(TrainerDTO trainerDTO)throws Exception{
		int result = trainerDAO.setTrainerUpdate(trainerDTO);
		return result;
	}
}
