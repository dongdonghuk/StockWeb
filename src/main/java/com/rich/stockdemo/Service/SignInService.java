package com.rich.stockdemo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.rich.stockdemo.Model.SignInDTO;

@Service
public class SignInService {
    private final WebClient webClient;
    private final String BASE_URL = "http://119.196.30.38:8000/";
    // private final String BASE_URL = "http://localhost:8000/";
    // private final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";


    public SignInService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(BASE_URL).build();
    }

    public int signIn(SignInDTO signInDTO) {
        // int result = webClient.post()         // POST method
        //     .uri("/CommConnect")    // baseUrl 이후 uri
        //     .bodyValue(signInDTO)     // set body value
        //     .retrieve()                 // client message 전송
        //     .bodyToMono(Integer.class)  // body type : string(json)
        //     .block();                   // await
        
        // System.out.println(result);

        // return result;
        return 0;
            
    }
    
}
