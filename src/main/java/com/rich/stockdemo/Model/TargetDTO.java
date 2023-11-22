package com.rich.stockdemo.Model;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Alias("TargetDTO")
public class TargetDTO {

    @JsonProperty("stockKey")
    private String stockKey; 
    
    private String stockName, marketType;
    
    private int openPrice, closePrice, highPrice, lowPrice, dailyRate, tradingVolume;
    
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDateTime marketDt;

    @JsonProperty("targets")
    private List<TargetDTO> targetList;
    
    public TargetDTO(){}
}
