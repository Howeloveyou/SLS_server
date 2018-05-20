package cn.howe.ujs.model;

import javax.persistence.*;

public class Tbconcentratorcircuit {
    /**
     * 自增长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 回路编号
     */
    @Column(name = "IDNum")
    private Integer idnum;

    /**
     * 回路名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 所属集中器编号
     */
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
     * 获取回路编号
     *
     * @return IDNum - 回路编号
     */
    public Integer getIdnum() {
        return idnum;
    }

    /**
     * 设置回路编号
     *
     * @param idnum 回路编号
     */
    public void setIdnum(Integer idnum) {
        this.idnum = idnum;
    }

    /**
     * 获取回路名称
     *
     * @return Name - 回路名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置回路名称
     *
     * @param name 回路名称
     */
    public void setName(String name) {
        this.name = name;
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
}