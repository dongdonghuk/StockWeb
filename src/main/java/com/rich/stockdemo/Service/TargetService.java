package com.rich.stockdemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.rich.stockdemo.Model.TargetDTO;
import com.rich.stockdemo.Repository.TargetRepository;

@Service
public class TargetService {
    private final WebClient webClient;
    private final String BASE_URL = "http://221.150.108.60:8000/";
    
    @Autowired private TargetRepository targetRepository;

    public TargetService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(BASE_URL).build();
    }

    public List<TargetDTO> getTagetDatas(String tDate) {
        List<TargetDTO> result = new ArrayList<TargetDTO>() {};
        int isExistTargetDate = 1;
        targetRepository.getTargetDatasCount(tDate);
        if(isExistTargetDate == 0) {
            String nresult = webClient.get()
            .uri("/getTargetDatas/" + tDate)
            .retrieve()
            .bodyToMono(TargetDTO.class)
            .map(TargetDTO::getStockKey)
            .block();
            System.out.println(nresult);
        }
        else {
            result =  targetRepository.getTagetDatas(tDate);
        }
        return result;
    }
}
