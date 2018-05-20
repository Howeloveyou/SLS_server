package cn.howe.ujs.model;

import java.util.Date;
import javax.persistence.*;

public class Tbproject {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 所属联系人id
     */
    @Column(name = "ContactPersonID")
    private Integer contactpersonid;

    /**
     * 所属县id
     */
    @Column(name = "CountyID")
    private Integer countyid;

    /**
     * 项目创建时间
     */
    @Column(name = "CreateTime")
    private Date createtime;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目名称
     *
     * @return Name - 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置项目名称
     *
     * @param name 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属联系人id
     *
     * @return ContactPersonID - 所属联系人id
     */
    public Integer getContactpersonid() {
        return contactpersonid;
    }

    /**
     * 设置所属联系人id
     *
     * @param contactpersonid 所属联系人id
     */
    public void setContactpersonid(Integer contactpersonid) {
        this.contactpersonid = contactpersonid;
    }

    /**
     * 获取所属县id
     *
     * @return CountyID - 所属县id
     */
    public Integer getCountyid() {
        return countyid;
    }

    /**
     * 设置所属县id
     *
     * @param countyid 所属县id
     */
    public void setCountyid(Integer countyid) {
        this.countyid = countyid;
    }

    /**
     * 获取项目创建时间
     *
     * @return CreateTime - 项目创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置项目创建时间
     *
     * @param createtime 项目创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}