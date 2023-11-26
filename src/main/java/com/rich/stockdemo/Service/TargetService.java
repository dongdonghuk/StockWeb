package com.rich.stockdemo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.rich.stockdemo.Model.TargetDTO;
import com.rich.stockdemo.Repository.TargetRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TargetService {
    private final WebClient webClient;
    private final String BASE_URL = "http://221.150.108.60:8000/";
    
    @Autowired private TargetRepository targetRepository;

    public TargetService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(BASE_URL).build();
    }

    public List<TargetDTO> getTagetDatas(String tDate) {
        List<TargetDTO> _result = new ArrayList<TargetDTO>() {};
        int isExistTargetDate = 0;
        targetRepository.getTargetDatasCount(tDate);
        if(isExistTargetDate == 0) {
            Mono<List<TargetDTO>> nresult = webClient.get()
            .uri("/getTargetDatas/" + tDate)
            .retrieve()
            .bodyToFlux(TargetDTO.class)
            .collectList();

            nresult.subscribe(
                result -> {
                    // 비동기적으로 처리할 로직을 작성
                    System.out.println(result);
                },
                error -> {
                    // 에러가 발생한 경우 처리
                    System.err.println("Error occurred: " + error);
                }
        );
        }
        else {
            _result =  targetRepository.getTagetDatas(tDate);
        }
        return _result;
    }
}
