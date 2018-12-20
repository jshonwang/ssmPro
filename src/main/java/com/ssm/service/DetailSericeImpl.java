package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.AboutDetailInterface;
import com.ssm.entity.Detail;
@Service
public class DetailSericeImpl implements DetailService {
	@Autowired
	private AboutDetailInterface adi;

	public Detail getDetailService(String username) {
		Detail d = adi.findDetailInfoByUsername(username);
		return d;
	}

	public int SaveInfo(Detail detail) {
		String username = detail.getUsername();
		if(adi.findDetailInfoByUsername(username)!=null){
			return 1;
		}
		adi.saveDetailInfo(detail);
		return 2;
	}

}
