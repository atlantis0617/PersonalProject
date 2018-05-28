package org.personal.base.model;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BaseModel implements Serializable{

	private static final long serialVersionUID = -6027475431304607789L;
	
	protected final transient Log logger;

	public BaseModel() {
		
		this.logger = LogFactory.getLog(super.getClass());
		
	}
	
	

}
