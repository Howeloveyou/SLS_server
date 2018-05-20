package cn.howe.ujs.model;

import java.util.Date;
import javax.persistence.*;

public class Tborder {
    /**
     * 自增长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 发布时间
     */
    @Column(name = "ReleaseTime")
    private Date releasetime;

    /**
     * 执行时间
     */
    @Column(name = "DoneTime")
    private Date donetime;

    /**
     * 发布用户id
     */
    @Column(name = "UserID")
    private Integer userid;

    /**
     * 命令类型
     */
    @Column(name = "OrderType")
    private String ordertype;

    /**
     * 设施类型id
     */
    @Column(name = "DeviceTypeID")
    private Integer devicetypeid;

    /**
     * 设施id
     */
    @Column(name = "DeviceID")
    private String deviceid;

    @Column(name = "ConcentratorID")
    private String concentratorid;

    /**
     * 获取自增长id
     *
     * @return ID - 自增长id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增长id
     *
     * @param id 自增长id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取发布时间
     *
     * @return ReleaseTime - 发布时间
     */
    public Date getReleasetime() {
        return releasetime;
    }

    /**
     * 设置发布时间
     *
     * @param releasetime 发布时间
     */
    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    /**
     * 获取执行时间
     *
     * @return DoneTime - 执行时间
     */
    public Date getDonetime() {
        return donetime;
    }

    /**
     * 设置执行时间
     *
     * @param donetime 执行时间
     */
    public void setDonetime(Date donetime) {
        this.donetime = donetime;
    }

    /**
     * 获取发布用户id
     *
     * @return UserID - 发布用户id
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置发布用户id
     *
     * @param userid 发布用户id
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * 获取命令类型
     *
     * @return OrderType - 命令类型
     */
    public String getOrdertype() {
        return ordertype;
    }

    /**
     * 设置命令类型
     *
     * @param ordertype 命令类型
     */
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * 获取设施类型id
     *
     * @return DeviceTypeID - 设施类型id
     */
    public Integer getDevicetypeid() {
        return devicetypeid;
    }

    /**
     * 设置设施类型id
     *
     * @param devicetypeid 设施类型id
     */
    public void setDevicetypeid(Integer devicetypeid) {
        this.devicetypeid = devicetypeid;
    }

    /**
     * 获取设施id
     *
     * @return DeviceID - 设施id
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设施id
     *
     * @param deviceid 设施id
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * @return ConcentratorID
     */
    public String getConcentratorid() {
        return concentratorid;
    }

    /**
     * @param concentratorid
     */
    public void setConcentratorid(String concentratorid) {
        this.concentratorid = concentratorid;
    }
}