package com.example.appbook;

import javax.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    private String isi;
    private String usernamereview;

    public Review(String isi, String usernamereview) {
        this.isi = isi;
        this.usernamereview = usernamereview;
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", isi='" + isi + '\'' +
                ", usernamereview='" + usernamereview + '\'' +
                '}';
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getUsernamereview() {
        return usernamereview;
    }

    public void setUsernamereview(String usernamereview) {
        this.usernamereview = usernamereview;
    }

    public int getId() {
        return id;
    }

   
}
