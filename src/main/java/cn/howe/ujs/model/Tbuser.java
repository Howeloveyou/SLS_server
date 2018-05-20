package cn.howe.ujs.model;

import javax.persistence.*;

public class Tbuser {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 密码
     */
    @Column(name = "Password")
    private String password;

    @Column(name = "Role")
    private String role;

    @Column(name = "ProjectID")
    private Integer projectid;

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
     * 获取用户名称
     *
     * @return Name - 用户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名称
     *
     * @param name 用户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码
     *
     * @return Password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return ProjectID
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }
}