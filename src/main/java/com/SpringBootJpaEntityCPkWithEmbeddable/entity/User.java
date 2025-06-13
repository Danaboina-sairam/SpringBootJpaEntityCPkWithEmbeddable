package com.SpringBootJpaEntityCPkWithEmbeddable.entity;

import jakarta.persistence.*;

@Table(name="USER_DETAILS")
@Entity
public class User {
    @EmbeddedId
    private UserCk userCk;
    private String phone;
    public User(UserCk userCk, String phone) {
        this.userCk = userCk;
        this.phone = phone;
    }
    public UserCk getUserCk() {
        return userCk;
    }
    public void setUserCk(UserCk userCk) {
        this.userCk = userCk;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

}
