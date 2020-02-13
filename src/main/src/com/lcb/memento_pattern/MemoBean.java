package com.lcb.memento_pattern;
/*
 * 
 * 用于备录的属性类
 * 
 * */
public class MemoBean {
	
    private int useTime;//使用时间
    private String deviceName;//设备名称
    private int stateLevel;//状态
    
    public int getUseTime() {
        return useTime;
    }
    
    public void setUseTime(int useTime) {
        this.useTime = useTime;
    }
    
    public String getDeviceName() {
        return deviceName;
    }
    
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    
    public int getStateLevel() {
        return stateLevel;
    }
    
    public void setStateLevel(int stateLevel) {
        this.stateLevel = stateLevel;
    }

}