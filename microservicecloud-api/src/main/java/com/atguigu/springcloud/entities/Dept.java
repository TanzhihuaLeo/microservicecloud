package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 9:28
 *
 * entity --orm--- db_table
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {
    /**
     * 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
     */
    private String dbSource;

    /**
     *
     * @param deptName
     */
    public Dept(String deptName) {
        super();
        this.deptName = deptName;
    }

}