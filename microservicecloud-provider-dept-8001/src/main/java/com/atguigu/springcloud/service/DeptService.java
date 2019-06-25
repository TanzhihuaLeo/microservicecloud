package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;

import java.util.List;

/**
 * @Author: TanZhiHua
 * @Date: 2019/6/20 9:39
 */
public interface DeptService {
    /**
     * 添加
     * @param dept
     * @return
     */
    public boolean add(Dept dept);

    /**
     * 根据ID获取Dept
     * @param id
     * @return
     */
    public Dept get(Long id);

    /**
     * 获取Dept List
     * @return
     */
    public List<Dept> list();
}
