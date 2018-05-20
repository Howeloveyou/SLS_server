package cn.howe.ujs.model;

import javax.persistence.*;

public class Tbroute {
    /**
     * 自增长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 路线名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 所属联系人编号
     */
    @Column(name = "ContactPersonID")
    private Integer contactpersonid;

    /**
     * 所属项目编号
     */
    @Column(name = "ProjectID")
    private Integer projectid;

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
     * 获取路线名称
     *
     * @return Name - 路线名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置路线名称
     *
     * @param name 路线名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取所属联系人编号
     *
     * @return ContactPersonID - 所属联系人编号
     */
    public Integer getContactpersonid() {
        return contactpersonid;
    }

    /**
     * 设置所属联系人编号
     *
     * @param contactpersonid 所属联系人编号
     */
    public void setContactpersonid(Integer contactpersonid) {
        this.contactpersonid = contactpersonid;
    }

    /**
     * 获取所属项目编号
     *
     * @return ProjectID - 所属项目编号
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置所属项目编号
     *
     * @param projectid 所属项目编号
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }
}