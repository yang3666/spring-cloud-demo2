package com.jy.service;

import com.jy.entity.Dept;

import java.util.List;

public interface DeptService {
    Dept get(Integer deptNo);
    List<Dept> selectAll();
}
