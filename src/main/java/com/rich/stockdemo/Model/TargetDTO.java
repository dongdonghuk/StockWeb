package com.rich.stockdemo.Model;

import java.time.LocalDateTime;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
@Alias("TargetDTO")
public class TargetDTO {
    private String stockKey,stockName, marketType;
    private int openPrice, closePrice, highPrice, lowPrice, dailyRate, tradingVolume;
    
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDateTime marketDt;

    public TargetDTO(){}

}

