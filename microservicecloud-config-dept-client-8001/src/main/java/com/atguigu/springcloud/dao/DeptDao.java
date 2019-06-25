package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 9:33
 */
@Mapper
@Repository("DeptDao")
public interface DeptDao {
    /**
     * 添加部门
     * @param dept
     * @return
     */
    public boolean addDept(Dept dept);

    /**
     * 根据部门ID获得部门
     * @param id
     * @return
     */
    public Dept findById(Long id);

    /**
     * 获得所有部门list
     * @return
     */
    public List<Dept> findAll();
}
