package com.rich.stockdemo.Repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import com.rich.stockdemo.Model.UsersDTO;

@Mapper
public interface UsersRepository {
    
    @Select("SELECT COUNT(*) FROM USERS")
    public int getUserCnt();

    //xml
    public int getUsersCnt();

    @Transactional
    public UsersDTO getUserInfo(UsersDTO user);

}
