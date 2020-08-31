/*
 * ******************************************************************
 *  Copyright (c)  2018
 *  project_name:ECI6005A_AND_APP_V1
 *  创建时间：18-3-19 下午5:55
 *  作者：Administrator
 *  四川翊晟芯科信息技术有限公司
 *  版权所有 违法必究
 * ******************************************************************
 */

package com.eci.eci6005a.sqlite;

import net.tsz.afinal.annotation.sqlite.Transient;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	@Transient
	private static final long serialVersionUID = -7973706948996920305L;

	private int id;
    private String Ceshi_ID;
	private Date Ceshi_Time;
	private String Ceshi_Data;

	/////////////getter and setter///////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getCeshi_ID() {
        return Ceshi_ID;
    }
    public void setCeshi_ID(String ceshi_ID) {
        this.Ceshi_ID = ceshi_ID;
    }
	public Date getCeshi_Time() {
		return Ceshi_Time;
	}
	public void setCeshi_Time(Date ceshi_Time) {
		this.Ceshi_Time = ceshi_Time;
	}
	public String getCeshi_Data() {
		return Ceshi_Data;
	}
	public void setCeshi_Data(String ceshi_Data) {
		this.Ceshi_Data = ceshi_Data;
	}

}
