package cn.howe.ujs.model;

import java.math.BigDecimal;
import javax.persistence.*;

public class Tbconcentrator {
    /**
     * 设备编号
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 所属路线编号
     */
    @Column(name = "RouteID")
    private Integer routeid;

    /**
     * 版本号
     */
    @Column(name = "Version")
    private String version;

    /**
     * 设备名称，服务器可以修改
     */
    @Column(name = "Name")
    private String name;

    /**
     * 设备密码
     */
    @Column(name = "Password")
    private String password;

    /**
     * 经度，服务器可以修改
     */
    @Column(name = "Longitude")
    private BigDecimal longitude;

    /**
     * 纬度，服务器可以修改
     */
    @Column(name = "Laitude")
    private BigDecimal laitude;

    /**
     * apn类型
     */
    @Column(name = "APNType")
    private Byte apntype;

    /**
     * 远传方式
     */
    @Column(name = "LongPassWay")
    private Byte longpassway;

    /**
     * 远传协议
     */
    @Column(name = "LongPassProtocol")
    private Byte longpassprotocol;

    /**
     * 数据上传间隔，服务器可以修改
     */
    @Column(name = "UpInterval")
    private Byte upinterval;

    /**
     * 数据上传延时长度，服务器可以修改
     */
    @Column(name = "UpDelay")
    private Byte updelay;

    /**
     * 数据重传次数，服务器可以修改
     */
    @Column(name = "UpRepeat")
    private Byte uprepeat;

    /**
     * 延时上传计时长度
     */
    @Column(name = "UpDelayAdmin")
    private Byte updelayadmin;

    /**
     * 项目IP
     */
    @Column(name = "IPProject")
    private String ipproject;

    /**
     * 项目端口
     */
    @Column(name = "PortProject")
    private String portproject;

    /**
     * 加密标志
     */
    @Column(name = "Encryption")
    private Byte encryption;

    /**
     * 密钥
     */
    @Column(name = "KeyProject")
    private String keyproject;

    /**
     * 管理服务器加密标志
     */
    @Column(name = "EncryptionAdmin")
    private Byte encryptionadmin;

    /**
     * 密钥
     */
    @Column(name = "KeyAdmin")
    private String keyadmin;

    /**
     * 心跳
     */
    @Column(name = "HeartBeat")
    private Byte heartbeat;

    /**
     * 心跳时序
     */
    @Column(name = "HeartBeatMin")
    private Byte heartbeatmin;

    /**
     * 管理IP
     */
    @Column(name = "IPAdmin")
    private String ipadmin;

    /**
     * 管理端口
     */
    @Column(name = "PortAdmin")
    private String portadmin;

    /**
     * 本地ip指定方式
     */
    @Column(name = "IPWay")
    private Byte ipway;

    /**
     * 本地IP
     */
    @Column(name = "IP")
    private String ip;

    /**
     * 本地端口
     */
    @Column(name = "Mask")
    private String mask;

    /**
     * 本地网关
     */
    @Column(name = "Gateway")
    private String gateway;

    /**
     * 本地DNS
     */
    @Column(name = "DNS")
    private String dns;

    /**
     * 备用设备密码
     */
    @Column(name = "ReservePassword")
    private String reservepassword;

    /**
     * 系统控制方式
     */
    @Column(name = "SystemControlMode")
    private Byte systemcontrolmode;

    /**
     * 部件使能状态
     */
    @Column(name = "PartsEnableState")
    private Byte partsenablestate;

    /**
     * 8个回路的状态
     */
    @Column(name = "CircuitState")
    private Byte circuitstate;

    /**
     * 采集时间间隔
     */
    @Column(name = "CollectTimeInterval")
    private Integer collecttimeinterval;

    /**
     * 485A口波特率
     */
    @Column(name = "ABaudRate")
    private Byte abaudrate;

    /**
     * 485A口数据位
     */
    @Column(name = "ADataBit")
    private Byte adatabit;

    /**
     * 485A口停止位
     */
    @Column(name = "AStopBit")
    private Byte astopbit;

    /**
     * 485A口校验位
     */
    @Column(name = "AParityBit")
    private Byte aparitybit;

    /**
     * 485B口波特率
     */
    @Column(name = "BBaudRate")
    private Byte bbaudrate;

    /**
     * 485B口数据位
     */
    @Column(name = "BDataBit")
    private Byte bdatabit;

    /**
     * 485B口停止位
     */
    @Column(name = "BStopBit")
    private Byte bstopbit;

    /**
     * 485B口校验位
     */
    @Column(name = "BParityBit")
    private Byte bparitybit;

    /**
     * 电话号码个数
     */
    @Column(name = "PhoneSum")
    private Integer phonesum;

    /**
     * 电话1
     */
    @Column(name = "PhoneNumber1")
    private String phonenumber1;

    /**
     * 电话2
     */
    @Column(name = "PhoneNumber2")
    private String phonenumber2;

    /**
     * 控制器数量
     */
    @Column(name = "ControllerAmount")
    private Integer controlleramount;

    /**
     * 地点
     */
    @Column(name = "Location")
    private String location;

    /**
     * 备注
     */
    @Column(name = "Remarks")
    private String remarks;

    @Column(name = "ChannelNum")
    private Integer channelnum;

    /**
     * 获取设备编号
     *
     * @return ID - 设备编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置设备编号
     *
     * @param id 设备编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取所属路线编号
     *
     * @return RouteID - 所属路线编号
     */
    public Integer getRouteid() {
        return routeid;
    }

    /**
     * 设置所属路线编号
     *
     * @param routeid 所属路线编号
     */
    public void setRouteid(Integer routeid) {
        this.routeid = routeid;
    }

    /**
     * 获取版本号
     *
     * @return Version - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取设备名称，服务器可以修改
     *
     * @return Name - 设备名称，服务器可以修改
     */
    public String getName() {
        return name;
    }

    /**
     * 设置设备名称，服务器可以修改
     *
     * @param name 设备名称，服务器可以修改
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取设备密码
     *
     * @return Password - 设备密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置设备密码
     *
     * @param password 设备密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取经度，服务器可以修改
     *
     * @return Longitude - 经度，服务器可以修改
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置经度，服务器可以修改
     *
     * @param longitude 经度，服务器可以修改
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度，服务器可以修改
     *
     * @return Laitude - 纬度，服务器可以修改
     */
    public BigDecimal getLaitude() {
        return laitude;
    }

    /**
     * 设置纬度，服务器可以修改
     *
     * @param laitude 纬度，服务器可以修改
     */
    public void setLaitude(BigDecimal laitude) {
        this.laitude = laitude;
    }

    /**
     * 获取apn类型
     *
     * @return APNType - apn类型
     */
    public Byte getApntype() {
        return apntype;
    }

    /**
     * 设置apn类型
     *
     * @param apntype apn类型
     */
    public void setApntype(Byte apntype) {
        this.apntype = apntype;
    }

    /**
     * 获取远传方式
     *
     * @return LongPassWay - 远传方式
     */
    public Byte getLongpassway() {
        return longpassway;
    }

    /**
     * 设置远传方式
     *
     * @param longpassway 远传方式
     */
    public void setLongpassway(Byte longpassway) {
        this.longpassway = longpassway;
    }

    /**
     * 获取远传协议
     *
     * @return LongPassProtocol - 远传协议
     */
    public Byte getLongpassprotocol() {
        return longpassprotocol;
    }

    /**
     * 设置远传协议
     *
     * @param longpassprotocol 远传协议
     */
    public void setLongpassprotocol(Byte longpassprotocol) {
        this.longpassprotocol = longpassprotocol;
    }

    /**
     * 获取数据上传间隔，服务器可以修改
     *
     * @return UpInterval - 数据上传间隔，服务器可以修改
     */
    public Byte getUpinterval() {
        return upinterval;
    }

    /**
     * 设置数据上传间隔，服务器可以修改
     *
     * @param upinterval 数据上传间隔，服务器可以修改
     */
    public void setUpinterval(Byte upinterval) {
        this.upinterval = upinterval;
    }

    /**
     * 获取数据上传延时长度，服务器可以修改
     *
     * @return UpDelay - 数据上传延时长度，服务器可以修改
     */
    public Byte getUpdelay() {
        return updelay;
    }

    /**
     * 设置数据上传延时长度，服务器可以修改
     *
     * @param updelay 数据上传延时长度，服务器可以修改
     */
    public void setUpdelay(Byte updelay) {
        this.updelay = updelay;
    }

    /**
     * 获取数据重传次数，服务器可以修改
     *
     * @return UpRepeat - 数据重传次数，服务器可以修改
     */
    public Byte getUprepeat() {
        return uprepeat;
    }

    /**
     * 设置数据重传次数，服务器可以修改
     *
     * @param uprepeat 数据重传次数，服务器可以修改
     */
    public void setUprepeat(Byte uprepeat) {
        this.uprepeat = uprepeat;
    }

    /**
     * 获取延时上传计时长度
     *
     * @return UpDelayAdmin - 延时上传计时长度
     */
    public Byte getUpdelayadmin() {
        return updelayadmin;
    }

    /**
     * 设置延时上传计时长度
     *
     * @param updelayadmin 延时上传计时长度
     */
    public void setUpdelayadmin(Byte updelayadmin) {
        this.updelayadmin = updelayadmin;
    }

    /**
     * 获取项目IP
     *
     * @return IPProject - 项目IP
     */
    public String getIpproject() {
        return ipproject;
    }

    /**
     * 设置项目IP
     *
     * @param ipproject 项目IP
     */
    public void setIpproject(String ipproject) {
        this.ipproject = ipproject;
    }

    /**
     * 获取项目端口
     *
     * @return PortProject - 项目端口
     */
    public String getPortproject() {
        return portproject;
    }

    /**
     * 设置项目端口
     *
     * @param portproject 项目端口
     */
    public void setPortproject(String portproject) {
        this.portproject = portproject;
    }

    /**
     * 获取加密标志
     *
     * @return Encryption - 加密标志
     */
    public Byte getEncryption() {
        return encryption;
    }

    /**
     * 设置加密标志
     *
     * @param encryption 加密标志
     */
    public void setEncryption(Byte encryption) {
        this.encryption = encryption;
    }

    /**
     * 获取密钥
     *
     * @return KeyProject - 密钥
     */
    public String getKeyproject() {
        return keyproject;
    }

    /**
     * 设置密钥
     *
     * @param keyproject 密钥
     */
    public void setKeyproject(String keyproject) {
        this.keyproject = keyproject;
    }

    /**
     * 获取管理服务器加密标志
     *
     * @return EncryptionAdmin - 管理服务器加密标志
     */
    public Byte getEncryptionadmin() {
        return encryptionadmin;
    }

    /**
     * 设置管理服务器加密标志
     *
     * @param encryptionadmin 管理服务器加密标志
     */
    public void setEncryptionadmin(Byte encryptionadmin) {
        this.encryptionadmin = encryptionadmin;
    }

    /**
     * 获取密钥
     *
     * @return KeyAdmin - 密钥
     */
    public String getKeyadmin() {
        return keyadmin;
    }

    /**
     * 设置密钥
     *
     * @param keyadmin 密钥
     */
    public void setKeyadmin(String keyadmin) {
        this.keyadmin = keyadmin;
    }

    /**
     * 获取心跳
     *
     * @return HeartBeat - 心跳
     */
    public Byte getHeartbeat() {
        return heartbeat;
    }

    /**
     * 设置心跳
     *
     * @param heartbeat 心跳
     */
    public void setHeartbeat(Byte heartbeat) {
        this.heartbeat = heartbeat;
    }

    /**
     * 获取心跳时序
     *
     * @return HeartBeatMin - 心跳时序
     */
    public Byte getHeartbeatmin() {
        return heartbeatmin;
    }

    /**
     * 设置心跳时序
     *
     * @param heartbeatmin 心跳时序
     */
    public void setHeartbeatmin(Byte heartbeatmin) {
        this.heartbeatmin = heartbeatmin;
    }

    /**
     * 获取管理IP
     *
     * @return IPAdmin - 管理IP
     */
    public String getIpadmin() {
        return ipadmin;
    }

    /**
     * 设置管理IP
     *
     * @param ipadmin 管理IP
     */
    public void setIpadmin(String ipadmin) {
        this.ipadmin = ipadmin;
    }

    /**
     * 获取管理端口
     *
     * @return PortAdmin - 管理端口
     */
    public String getPortadmin() {
        return portadmin;
    }

    /**
     * 设置管理端口
     *
     * @param portadmin 管理端口
     */
    public void setPortadmin(String portadmin) {
        this.portadmin = portadmin;
    }

    /**
     * 获取本地ip指定方式
     *
     * @return IPWay - 本地ip指定方式
     */
    public Byte getIpway() {
        return ipway;
    }

    /**
     * 设置本地ip指定方式
     *
     * @param ipway 本地ip指定方式
     */
    public void setIpway(Byte ipway) {
        this.ipway = ipway;
    }

    /**
     * 获取本地IP
     *
     * @return IP - 本地IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 设置本地IP
     *
     * @param ip 本地IP
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 获取本地端口
     *
     * @return Mask - 本地端口
     */
    public String getMask() {
        return mask;
    }

    /**
     * 设置本地端口
     *
     * @param mask 本地端口
     */
    public void setMask(String mask) {
        this.mask = mask;
    }

    /**
     * 获取本地网关
     *
     * @return Gateway - 本地网关
     */
    public String getGateway() {
        return gateway;
    }

    /**
     * 设置本地网关
     *
     * @param gateway 本地网关
     */
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * 获取本地DNS
     *
     * @return DNS - 本地DNS
     */
    public String getDns() {
        return dns;
    }

    /**
     * 设置本地DNS
     *
     * @param dns 本地DNS
     */
    public void setDns(String dns) {
        this.dns = dns;
    }

    /**
     * 获取备用设备密码
     *
     * @return ReservePassword - 备用设备密码
     */
    public String getReservepassword() {
        return reservepassword;
    }

    /**
     * 设置备用设备密码
     *
     * @param reservepassword 备用设备密码
     */
    public void setReservepassword(String reservepassword) {
        this.reservepassword = reservepassword;
    }

    /**
     * 获取系统控制方式
     *
     * @return SystemControlMode - 系统控制方式
     */
    public Byte getSystemcontrolmode() {
        return systemcontrolmode;
    }

    /**
     * 设置系统控制方式
     *
     * @param systemcontrolmode 系统控制方式
     */
    public void setSystemcontrolmode(Byte systemcontrolmode) {
        this.systemcontrolmode = systemcontrolmode;
    }

    /**
     * 获取部件使能状态
     *
     * @return PartsEnableState - 部件使能状态
     */
    public Byte getPartsenablestate() {
        return partsenablestate;
    }

    /**
     * 设置部件使能状态
     *
     * @param partsenablestate 部件使能状态
     */
    public void setPartsenablestate(Byte partsenablestate) {
        this.partsenablestate = partsenablestate;
    }

    /**
     * 获取8个回路的状态
     *
     * @return CircuitState - 8个回路的状态
     */
    public Byte getCircuitstate() {
        return circuitstate;
    }

    /**
     * 设置8个回路的状态
     *
     * @param circuitstate 8个回路的状态
     */
    public void setCircuitstate(Byte circuitstate) {
        this.circuitstate = circuitstate;
    }

    /**
     * 获取采集时间间隔
     *
     * @return CollectTimeInterval - 采集时间间隔
     */
    public Integer getCollecttimeinterval() {
        return collecttimeinterval;
    }

    /**
     * 设置采集时间间隔
     *
     * @param collecttimeinterval 采集时间间隔
     */
    public void setCollecttimeinterval(Integer collecttimeinterval) {
        this.collecttimeinterval = collecttimeinterval;
    }

    /**
     * 获取485A口波特率
     *
     * @return ABaudRate - 485A口波特率
     */
    public Byte getAbaudrate() {
        return abaudrate;
    }

    /**
     * 设置485A口波特率
     *
     * @param abaudrate 485A口波特率
     */
    public void setAbaudrate(Byte abaudrate) {
        this.abaudrate = abaudrate;
    }

    /**
     * 获取485A口数据位
     *
     * @return ADataBit - 485A口数据位
     */
    public Byte getAdatabit() {
        return adatabit;
    }

    /**
     * 设置485A口数据位
     *
     * @param adatabit 485A口数据位
     */
    public void setAdatabit(Byte adatabit) {
        this.adatabit = adatabit;
    }

    /**
     * 获取485A口停止位
     *
     * @return AStopBit - 485A口停止位
     */
    public Byte getAstopbit() {
        return astopbit;
    }

    /**
     * 设置485A口停止位
     *
     * @param astopbit 485A口停止位
     */
    public void setAstopbit(Byte astopbit) {
        this.astopbit = astopbit;
    }

    /**
     * 获取485A口校验位
     *
     * @return AParityBit - 485A口校验位
     */
    public Byte getAparitybit() {
        return aparitybit;
    }

    /**
     * 设置485A口校验位
     *
     * @param aparitybit 485A口校验位
     */
    public void setAparitybit(Byte aparitybit) {
        this.aparitybit = aparitybit;
    }

    /**
     * 获取485B口波特率
     *
     * @return BBaudRate - 485B口波特率
     */
    public Byte getBbaudrate() {
        return bbaudrate;
    }

    /**
     * 设置485B口波特率
     *
     * @param bbaudrate 485B口波特率
     */
    public void setBbaudrate(Byte bbaudrate) {
        this.bbaudrate = bbaudrate;
    }

    /**
     * 获取485B口数据位
     *
     * @return BDataBit - 485B口数据位
     */
    public Byte getBdatabit() {
        return bdatabit;
    }

    /**
     * 设置485B口数据位
     *
     * @param bdatabit 485B口数据位
     */
    public void setBdatabit(Byte bdatabit) {
        this.bdatabit = bdatabit;
    }

    /**
     * 获取485B口停止位
     *
     * @return BStopBit - 485B口停止位
     */
    public Byte getBstopbit() {
        return bstopbit;
    }

    /**
     * 设置485B口停止位
     *
     * @param bstopbit 485B口停止位
     */
    public void setBstopbit(Byte bstopbit) {
        this.bstopbit = bstopbit;
    }

    /**
     * 获取485B口校验位
     *
     * @return BParityBit - 485B口校验位
     */
    public Byte getBparitybit() {
        return bparitybit;
    }

    /**
     * 设置485B口校验位
     *
     * @param bparitybit 485B口校验位
     */
    public void setBparitybit(Byte bparitybit) {
        this.bparitybit = bparitybit;
    }

    /**
     * 获取电话号码个数
     *
     * @return PhoneSum - 电话号码个数
     */
    public Integer getPhonesum() {
        return phonesum;
    }

    /**
     * 设置电话号码个数
     *
     * @param phonesum 电话号码个数
     */
    public void setPhonesum(Integer phonesum) {
        this.phonesum = phonesum;
    }

    /**
     * 获取电话1
     *
     * @return PhoneNumber1 - 电话1
     */
    public String getPhonenumber1() {
        return phonenumber1;
    }

    /**
     * 设置电话1
     *
     * @param phonenumber1 电话1
     */
    public void setPhonenumber1(String phonenumber1) {
        this.phonenumber1 = phonenumber1;
    }

    /**
     * 获取电话2
     *
     * @return PhoneNumber2 - 电话2
     */
    public String getPhonenumber2() {
        return phonenumber2;
    }

    /**
     * 设置电话2
     *
     * @param phonenumber2 电话2
     */
    public void setPhonenumber2(String phonenumber2) {
        this.phonenumber2 = phonenumber2;
    }

    /**
     * 获取控制器数量
     *
     * @return ControllerAmount - 控制器数量
     */
    public Integer getControlleramount() {
        return controlleramount;
    }

    /**
     * 设置控制器数量
     *
     * @param controlleramount 控制器数量
     */
    public void setControlleramount(Integer controlleramount) {
        this.controlleramount = controlleramount;
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
     * 获取备注
     *
     * @return Remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return ChannelNum
     */
    public Integer getChannelnum() {
        return channelnum;
    }

    /**
     * @param channelnum
     */
    public void setChannelnum(Integer channelnum) {
        this.channelnum = channelnum;
    }
}