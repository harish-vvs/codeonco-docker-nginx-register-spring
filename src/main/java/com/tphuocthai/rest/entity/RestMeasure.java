package com.tphuocthai.rest.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

/**
 * RestMeasure entity
 * Created by tphuocthai on 7/9/16.
 */
@Entity
@JsonIgnoreProperties(value = { "new" })
public class RestMeasure extends AbstractPersistable<Long> {
	//private String planName;
	//private String deviceName;
	//private Integer deviceCount;
	private String serviceName;
	private String userName;
	
    /*private String restMethodName;
    private String restMethod;
    private Long timeInMilliseconds;
    private Integer createdBy;
    private Long createdAt;
    private Integer lastUpdatedBy;
    private Long lastUpdatedAt;*/

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
    /*public String getPlanName() {
    	return planName;
    }
    
    public void setPlanName(String planName) {
    	this.planName = planName;
    }
    
    public String getDeviceName() {
    	return deviceName;
    }
    
    public void setDeviceName(String deviceName) {
    	this.deviceName = deviceName;
    }
    
    public Integer getDeviceCount() {
    	return deviceCount;
    }
    
    public void setDeviceCount(Integer deviceCount) {
    	this.deviceCount = deviceCount;
    }*/
    
    /*public String getRestMethodName() {
        return restMethodName;
    }

    public void setRestMethodName(String restMethodName) {
        this.restMethodName = restMethodName;
    }

    public String getRestMethod() {
        return restMethod;
    }

    public void setRestMethod(String restMethod) {
        this.restMethod = restMethod;
    }

    public Long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public void setTimeInMilliseconds(Long timeInMilliseconds) {
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Integer lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getLastUpdatedAt() {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }*/

    @Override
    public String toString() {
        return "RestMeasure{" +
                "serviceName='" + serviceName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
