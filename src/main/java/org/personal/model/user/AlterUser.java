package org.personal.model.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.personal.base.model.BaseModel;
import org.personal.base.model.BaseStatus;
import org.personal.base.model.UpdateInfo;

@Entity
@Table(name="ALTER_USER")
public class AlterUser extends BaseModel{

	private static final long serialVersionUID = 2808850675851979205L;
	
	/**序号*/
	@Id
	@GeneratedValue(generator = "uid")
    @GenericGenerator(name = "uid", strategy = "native")
	@Column(name="UID")
	private Long uid;
	
	/**注册日期*/
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REGISTER_TIME")
	private Date registerTime;
	
	@Column(name="STATUS")
	private BaseStatus status = BaseStatus.O;
	
	@Embedded
	private UpdateInfo updateInfo;

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public BaseStatus getStatus() {
		return status;
	}

	public void setStatus(BaseStatus status) {
		this.status = status;
	}

	public UpdateInfo getUpdateInfo() {
		return updateInfo;
	}

	public void setUpdateInfo(UpdateInfo updateInfo) {
		this.updateInfo = updateInfo;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}
	

}
