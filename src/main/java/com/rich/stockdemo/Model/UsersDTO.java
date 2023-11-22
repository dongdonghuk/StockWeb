package com.rich.stockdemo.Model;
import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("UsersDTO")
public class UsersDTO {
    private String userId, userPw, userKey, userName;

    public UsersDTO(){}
    
    public UsersDTO(String userId, String userPw) {
        this.setUserId(userId);
        this.setUserPw(userPw);
    }

}
