package cn.howe.ujs.model;

import javax.persistence.*;

public class Tbconcentratorcircuitgroup {
    /**
     * 自增长id
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 回路的组的编号
     */
    @Column(name = "IDNum")
    private Integer idnum;

    /**
     * 回路的组的名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 所属回路编号
     */
    @Column(name = "ConcentratorCircuitID")
    private Integer concentratorcircuitid;

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
     * 获取回路的组的编号
     *
     * @return IDNum - 回路的组的编号
     */
    public Integer getIdnum() {
        return idnum;
    }

    /**
     * 设置回路的组的编号
     *
     * @param idnum 回路的组的编号
     */
    public void setIdnum(Integer idnum) {
        this.idnum = idnum;
    }

    /**
     * 获取回路的组的名称
     *
     * @return Name - 回路的组的名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置回路的组的名称
     *
     * @param name 回路的组的名称
     */
    public void setName(String name) {
        this.name = name;
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
}