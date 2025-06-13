package com.SpringBootJpaEntityCPkWithEmbeddable.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserCk implements Serializable {
    private String name;
    private String email;

    public UserCk(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Object obj){
        if(this==obj) return true;
        if(!(obj instanceof UserCk)){
            return false;
        }
        UserCk userCk=(UserCk) obj;
        return this.name.equals(userCk.name) && this.email.equals(userCk.email);
    }

    public int hashCode(){
        return Objects.hash(name,email);
    }
}
