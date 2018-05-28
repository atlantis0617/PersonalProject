package org.personal.base.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class UpdateInfo extends BaseModel{

	private static final long serialVersionUID = -6508066456156706098L;
	
	@Column(name="CREATOR_ID")
	private Long creatorId;
	
	@Column(name="CREATOR", length=30)
	private String creator;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_TIME")
	private Date createdTime;
	
	@Column(name="LASTOPERATOR_ID")
	private Long lastOperatorId;
	
	@Column(name="LASTOPERATOR",length=30)
	private String lastOperator;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Long getLastOperatorId() {
		return lastOperatorId;
	}

	public void setLastOperatorId(Long lastOperatorId) {
		this.lastOperatorId = lastOperatorId;
	}

	public String getLastOperator() {
		return lastOperator;
	}

	public void setLastOperator(String lastOperator) {
		this.lastOperator = lastOperator;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
