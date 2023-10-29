package com.rich.stockdemo.Model;

public class SignInDTO {
    private String userId, userPw;

    public SignInDTO(){}
    
    public SignInDTO(String userId, String userPw) {
        this.setUserId(userId);
        this.setUserPw(userPw);
    }
    
    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return this.userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }
    
}
