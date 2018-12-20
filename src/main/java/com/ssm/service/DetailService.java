package com.ssm.service;

import com.ssm.entity.Detail;

public interface DetailService {
	Detail getDetailService(String username);
	
	int SaveInfo(Detail detail);

}
