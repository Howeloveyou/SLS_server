package cn.howe.ujs.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Tbcontroller {
    /**
     * 长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 组内序号,短id
     */
    @Column(name = "Number")
    private Integer number;

    /**
     * 控制器名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 经度
     */
    @Column(name = "Longitude")
    private BigDecimal longitude;

    /**
     * 纬度
     */
    @Column(name = "Laitude")
    private BigDecimal laitude;

    /**
     * 所属控制器类型编号
     */
    @Column(name = "TypeID")
    private Integer typeid;

    /**
     * 所属路灯类型编号
     */
    @Column(name = "LampTypeID")
    private Integer lamptypeid;

    /**
     * 所属线路编号
     */
    @Column(name = "RouteID")
    private Integer routeid;

    /**
     * 所属集中器编号
     */
    @Column(name = "ConcentratorID")
    private String concentratorid;

    /**
     * 所属回路编号
     */
    @Column(name = "ConcentratorCircuitID")
    private Integer concentratorcircuitid;

    /**
     * 更换时间
     */
    @Column(name = "RenewTime")
    private Date renewtime;

    /**
     * 备注
     */
    @Column(name = "Remarks")
    private Integer remarks;

    /**
     * 地点
     */
    @Column(name = "Location")
    private String location;

    @Column(name = "Oma")
    private BigDecimal oma;

    /**
     * 注册标志
     */
    @Column(name = "MaxCurrent")
    private BigDecimal maxcurrent;

    @Column(name = "MaxOma")
    private BigDecimal maxoma;

    @Column(name = "IsRegist")
    private Integer isregist;

    /**
     * 获取长id
     *
     * @return ID - 长id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置长id
     *
     * @param id 长id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取组内序号,短id
     *
     * @return Number - 组内序号,短id
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置组内序号,短id
     *
     * @param number 组内序号,短id
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取控制器名称
     *
     * @return Name - 控制器名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置控制器名称
     *
     * @param name 控制器名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取经度
     *
     * @return Longitude - 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return Laitude - 纬度
     */
    public BigDecimal getLaitude() {
        return laitude;
    }

    /**
     * 设置纬度
     *
     * @param laitude 纬度
     */
    public void setLaitude(BigDecimal laitude) {
        this.laitude = laitude;
    }

    /**
     * 获取所属控制器类型编号
     *
     * @return TypeID - 所属控制器类型编号
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * 设置所属控制器类型编号
     *
     * @param typeid 所属控制器类型编号
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * 获取所属路灯类型编号
     *
     * @return LampTypeID - 所属路灯类型编号
     */
    public Integer getLamptypeid() {
        return lamptypeid;
    }

    /**
     * 设置所属路灯类型编号
     *
     * @param lamptypeid 所属路灯类型编号
     */
    public void setLamptypeid(Integer lamptypeid) {
        this.lamptypeid = lamptypeid;
    }

    /**
     * 获取所属线路编号
     *
     * @return RouteID - 所属线路编号
     */
    public Integer getRouteid() {
        return routeid;
    }

    /**
     * 设置所属线路编号
     *
     * @param routeid 所属线路编号
     */
    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    /**
     * 获取所属集中器编号
     *
     * @return ConcentratorID - 所属集中器编号
     */
    public String getConcentratorid() {
        return concentratorid;
    }

    /**
     * 设置所属集中器编号
     *
     * @param concentratorid 所属集中器编号
     */
    public void setConcentratorid(String concentratorid) {
        this.concentratorid = concentratorid;
    }

    /**
     * 获取所属回路编号
     *
     * @return ConcentratorCircuitID - 所属回路编号
     */
    public Integer getConcentratorcircuitid() {
        return concentratorcircuitid;
    }

    /**
     * 设置所属回路编号
     *
     * @param concentratorcircuitid 所属回路编号
     */
    public void setConcentratorcircuitid(Integer concentratorcircuitid) {
        this.concentratorcircuitid = concentratorcircuitid;
    }

    /**
     * 获取更换时间
     *
     * @return RenewTime - 更换时间
     */
    public Date getRenewtime() {
        return renewtime;
    }

    /**
     * 设置更换时间
     *
     * @param renewtime 更换时间
     */
    public void setRenewtime(Date renewtime) {
        this.renewtime = renewtime;
    }

    /**
     * 获取备注
     *
     * @return Remarks - 备注
     */
    public Integer getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(Integer remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取地点
     *
     * @return Location - 地点
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置地点
     *
     * @param location 地点
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return Oma
     */
    public BigDecimal getOma() {
        return oma;
    }

    /**
     * @param oma
     */
    public void setOma(BigDecimal oma) {
        this.oma = oma;
    }

    /**
     * 获取注册标志
     *
     * @return MaxCurrent - 注册标志
     */
    public BigDecimal getMaxcurrent() {
        return maxcurrent;
    }

    /**
     * 设置注册标志
     *
     * @param maxcurrent 注册标志
     */
    public void setMaxcurrent(BigDecimal maxcurrent) {
        this.maxcurrent = maxcurrent;
    }

    /**
     * @return MaxOma
     */
    public BigDecimal getMaxoma() {
        return maxoma;
    }

    /**
     * @param maxoma
     */
    public void setMaxoma(BigDecimal maxoma) {
        this.maxoma = maxoma;
    }

    /**
     * @return IsRegist
     */
    public Integer getIsregist() {
        return isregist;
    }

    /**
     * @param isregist
     */
    public void setIsregist(Integer isregist) {
        this.isregist = isregist;
    }
}