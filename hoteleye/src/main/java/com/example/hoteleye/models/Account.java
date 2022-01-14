package com.example.hoteleye.models;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account {
    private long id;
    private String username;
    private String password;

    public Account() {
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @Column(name = "username", nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
