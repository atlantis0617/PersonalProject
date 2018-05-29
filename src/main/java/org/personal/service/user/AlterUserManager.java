package org.personal.service.user;

import org.personal.model.user.AlterUser;
import org.springframework.transaction.annotation.Transactional;

public interface AlterUserManager {
	
	/**增加用户*/
	@Transactional(readOnly=false)
	void addUser(AlterUser user);
}
