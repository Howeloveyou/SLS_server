package cn.howe.ujs.model;

import javax.persistence.*;

public class Tbpolicegroup {
    /**
     * 自增长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 组名
     */
    @Column(name = "GroupName")
    private String groupname;

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
     * 获取组名
     *
     * @return GroupName - 组名
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * 设置组名
     *
     * @param groupname 组名
     */
    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }
}