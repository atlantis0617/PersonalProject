package org.personal.service.user.impl;

import org.personal.base.dao.CommDao;
import org.personal.model.user.AlterUser;
import org.personal.service.user.AlterUserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlterUserManagerImpl implements AlterUserManager{
	
	@Autowired
    private CommDao commonDao;

	@Override
	public void addUser(AlterUser user) {
		
		commonDao.save(user);
		
	}

}
