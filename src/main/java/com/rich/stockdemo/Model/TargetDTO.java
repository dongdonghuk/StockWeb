package com.rich.stockdemo.Model;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;

@Data
@Alias("TargetDTO")
public class TargetDTO {
    private String stockKey,stockName, marketType;
    private int openPrice, closePrice, highPrice, lowPrice, dailyRate, tradingVolume;
    
    @DateTimeFormat(pattern = "yyyyMMdd")
    private LocalDateTime marketDt;

    public TargetDTO(){}

    private List<JsonRes> targetList;

    @Getter
    public class JsonRes {
    @JsonProperty
    private String stock_key;
    @JsonProperty
    private String stock_name;
    }
}

