package com.ssm.dao;

import com.ssm.entity.Detail;

public interface AboutDetailInterface {
	Detail findDetailInfoByUsername(String username);
	/**
	 * 
	 */
	int saveDetailInfo(Detail detail);

}
