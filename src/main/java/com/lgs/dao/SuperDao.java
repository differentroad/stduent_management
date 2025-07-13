package com.lgs.dao;

import com.lgs.entity.Super;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("superDao")
public interface SuperDao {
    void update(Super supers);//更新数据
    void updatePassword(Super supers);////更新数据修改密码
    Super selectBySuperNo(String username);//通过userName查询单条数据
}
