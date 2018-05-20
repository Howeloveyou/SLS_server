package cn.howe.ujs.model;

import java.util.Date;
import javax.persistence.*;

public class Tbpolice {
    /**
     * 自增长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 组id
     */
    @Column(name = "GroupID")
    private Integer groupid;

    /**
     * 历法
     */
    @Column(name = "Calendar")
    private Integer calendar;

    /**
     * 周期类型
     */
    @Column(name = "Cycle")
    private Integer cycle;

    /**
     * 绝对、相对时间,1绝对时间、0相对时间
     */
    @Column(name = "onAbsoluteTime")
    private Integer onabsolutetime;

    /**
     * 车辆表车流
     */
    @Column(name = "OnVehicle")
    private Integer onvehicle;

    /**
     * 照度
     */
    @Column(name = "OnLuma")
    private Integer onluma;

    @Column(name = "StartMonth")
    private Integer startmonth;

    @Column(name = "EndMonth")
    private Integer endmonth;

    /**
     * 月
     */
    @Column(name = "OnMonth")
    private Integer onmonth;

    /**
     * 日
     */
    @Column(name = "OnDay")
    private Integer onday;

    /**
     * 日落前后，-1前1后
     */
    @Column(name = "onAbsolute")
    private Integer onabsolute;

    /**
     * 时间
     */
    @Column(name = "OnTime")
    private Date ontime;

    @Column(name = "offAbsoluteTime")
    private Integer offabsolutetime;

    /**
     * 月
     */
    @Column(name = "OffMonth")
    private Integer offmonth;

    /**
     * 日
     */
    @Column(name = "OffDay")
    private Integer offday;

    /**
     * 关灯前后，-1前1后
     */
    @Column(name = "offAbsolute")
    private Integer offabsolute;

    /**
     * 时间
     */
    @Column(name = "OffTime")
    private Date offtime;

    /**
     * 亮度级别
     */
    @Column(name = "Lumalevel")
    private Byte lumalevel;

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
     * 获取组id
     *
     * @return GroupID - 组id
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * 设置组id
     *
     * @param groupid 组id
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * 获取历法
     *
     * @return Calendar - 历法
     */
    public Integer getCalendar() {
        return calendar;
    }

    /**
     * 设置历法
     *
     * @param calendar 历法
     */
    public void setCalendar(Integer calendar) {
        this.calendar = calendar;
    }

    /**
     * 获取周期类型
     *
     * @return Cycle - 周期类型
     */
    public Integer getCycle() {
        return cycle;
    }

    /**
     * 设置周期类型
     *
     * @param cycle 周期类型
     */
    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    /**
     * 获取绝对、相对时间,1绝对时间、0相对时间
     *
     * @return onAbsoluteTime - 绝对、相对时间,1绝对时间、0相对时间
     */
    public Integer getOnabsolutetime() {
        return onabsolutetime;
    }

    /**
     * 设置绝对、相对时间,1绝对时间、0相对时间
     *
     * @param onabsolutetime 绝对、相对时间,1绝对时间、0相对时间
     */
    public void setOnabsolutetime(Integer onabsolutetime) {
        this.onabsolutetime = onabsolutetime;
    }

    /**
     * 获取车辆表车流
     *
     * @return OnVehicle - 车辆表车流
     */
    public Integer getOnvehicle() {
        return onvehicle;
    }

    /**
     * 设置车辆表车流
     *
     * @param onvehicle 车辆表车流
     */
    public void setOnvehicle(Integer onvehicle) {
        this.onvehicle = onvehicle;
    }

    /**
     * 获取照度
     *
     * @return OnLuma - 照度
     */
    public Integer getOnluma() {
        return onluma;
    }

    /**
     * 设置照度
     *
     * @param onluma 照度
     */
    public void setOnluma(Integer onluma) {
        this.onluma = onluma;
    }

    /**
     * @return StartMonth
     */
    public Integer getStartmonth() {
        return startmonth;
    }

    /**
     * @param startmonth
     */
    public void setStartmonth(Integer startmonth) {
        this.startmonth = startmonth;
    }

    /**
     * @return EndMonth
     */
    public Integer getEndmonth() {
        return endmonth;
    }

    /**
     * @param endmonth
     */
    public void setEndmonth(Integer endmonth) {
        this.endmonth = endmonth;
    }

    /**
     * 获取月
     *
     * @return OnMonth - 月
     */
    public Integer getOnmonth() {
        return onmonth;
    }

    /**
     * 设置月
     *
     * @param onmonth 月
     */
    public void setOnmonth(Integer onmonth) {
        this.onmonth = onmonth;
    }

    /**
     * 获取日
     *
     * @return OnDay - 日
     */
    public Integer getOnday() {
        return onday;
    }

    /**
     * 设置日
     *
     * @param onday 日
     */
    public void setOnday(Integer onday) {
        this.onday = onday;
    }

    /**
     * 获取日落前后，-1前1后
     *
     * @return onAbsolute - 日落前后，-1前1后
     */
    public Integer getOnabsolute() {
        return onabsolute;
    }

    /**
     * 设置日落前后，-1前1后
     *
     * @param onabsolute 日落前后，-1前1后
     */
    public void setOnabsolute(Integer onabsolute) {
        this.onabsolute = onabsolute;
    }

    /**
     * 获取时间
     *
     * @return OnTime - 时间
     */
    public Date getOntime() {
        return ontime;
    }

    /**
     * 设置时间
     *
     * @param ontime 时间
     */
    public void setOntime(Date ontime) {
        this.ontime = ontime;
    }

    /**
     * @return offAbsoluteTime
     */
    public Integer getOffabsolutetime() {
        return offabsolutetime;
    }

    /**
     * @param offabsolutetime
     */
    public void setOffabsolutetime(Integer offabsolutetime) {
        this.offabsolutetime = offabsolutetime;
    }

    /**
     * 获取月
     *
     * @return OffMonth - 月
     */
    public Integer getOffmonth() {
        return offmonth;
    }

    /**
     * 设置月
     *
     * @param offmonth 月
     */
    public void setOffmonth(Integer offmonth) {
        this.offmonth = offmonth;
    }

    /**
     * 获取日
     *
     * @return OffDay - 日
     */
    public Integer getOffday() {
        return offday;
    }

    /**
     * 设置日
     *
     * @param offday 日
     */
    public void setOffday(Integer offday) {
        this.offday = offday;
    }

    /**
     * 获取关灯前后，-1前1后
     *
     * @return offAbsolute - 关灯前后，-1前1后
     */
    public Integer getOffabsolute() {
        return offabsolute;
    }

    /**
     * 设置关灯前后，-1前1后
     *
     * @param offabsolute 关灯前后，-1前1后
     */
    public void setOffabsolute(Integer offabsolute) {
        this.offabsolute = offabsolute;
    }

    /**
     * 获取时间
     *
     * @return OffTime - 时间
     */
    public Date getOfftime() {
        return offtime;
    }

    /**
     * 设置时间
     *
     * @param offtime 时间
     */
    public void setOfftime(Date offtime) {
        this.offtime = offtime;
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
}