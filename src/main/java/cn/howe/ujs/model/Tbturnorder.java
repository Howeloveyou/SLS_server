package cn.howe.ujs.model;

import java.util.Date;
import javax.persistence.*;

public class Tbturnorder {
    /**
     * 自增长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "OrderType")
    private String ordertype;

    /**
     * 命令类型
     */
    @Column(name = "OnOrOFFType")
    private Integer onorofftype;

    /**
     * 操作时间
     */
    @Column(name = "OrderTime")
    private Date ordertime;

    /**
     * 亮度级别
     */
    @Column(name = "Lumalevel")
    private Byte lumalevel;

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

    /**
     * 发布用户id
     */
    @Column(name = "UserID")
    private Integer userid;

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
     * @return OrderType
     */
    public String getOrdertype() {
        return ordertype;
    }

    /**
     * @param ordertype
     */
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    /**
     * 获取命令类型
     *
     * @return OnOrOFFType - 命令类型
     */
    public Integer getOnorofftype() {
        return onorofftype;
    }

    /**
     * 设置命令类型
     *
     * @param onorofftype 命令类型
     */
    public void setOnorofftype(Integer onorofftype) {
        this.onorofftype = onorofftype;
    }

    /**
     * 获取操作时间
     *
     * @return OrderTime - 操作时间
     */
    public Date getOrdertime() {
        return ordertime;
    }

    /**
     * 设置操作时间
     *
     * @param ordertime 操作时间
     */
    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    /**
     * 获取亮度级别
     *
     * @return Lumalevel - 亮度级别
     */
    public Byte getLumalevel() {
        return lumalevel;
    }

    /**
     * 设置亮度级别
     *
     * @param lumalevel 亮度级别
     */
    public void setLumalevel(Byte lumalevel) {
        this.lumalevel = lumalevel;
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