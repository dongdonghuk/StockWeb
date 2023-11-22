package com.rich.stockdemo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.web.reactive.function.client.WebClient;

import com.rich.stockdemo.Model.UsersDTO;
import com.rich.stockdemo.Repository.UsersRepository;

@Service
public class SignInService {
    //private final WebClient webClient;
    //private final String BASE_URL = "http://119.196.30.38:8000/";
    // private final String BASE_URL = "http://localhost:8000/";
    // private final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

    @Autowired private UsersRepository usersRepository;

    // public SignInService(WebClient.Builder webClientBuilder) {
    //     // this.webClient = webClientBuilder.baseUrl(BASE_URL).build();
    // }

    public int signIn(UsersDTO signInDTO) {
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
    
    public int getUsersCnt() {
        int rs = usersRepository.getUserCnt();
        return rs;
    }

    public int getUsersCnt2() {
    int rs = usersRepository.getUsersCnt();

    return rs;
    }

    public UsersDTO getUserInfo(UsersDTO user){
        UsersDTO dto = usersRepository.getUserInfo(user);
        return dto;
    }
}
