package com.rich.stockdemo.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

import com.rich.stockdemo.Model.TargetDTO;

@Mapper
public interface TargetRepository {
    @Transactional
    public List<TargetDTO> getTagetDatas(String tDate);
    @Transactional
    public int getTargetDatasCount(String tDate);
}
