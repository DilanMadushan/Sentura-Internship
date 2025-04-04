package com.example.User_Crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table
public class User {
    @Id
    @Column(nullable = false, unique = true)
    private String uid;

    public User() {
    }

    public User(String uid, String name, String givenName, String middleName, String familyName, String nickname, String email, String phoneNumber, String comment, String picture, String directory) {
        this.uid = uid;
        this.name = name;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.nickname = nickname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.comment = comment;
        this.picture = picture;
        this.directory = directory;
    }

    private String name;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    @Column(name = "given_name")
    private String givenName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "family_name")
    private String familyName;
    private String nickname;
    @Column(unique = true)
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String comment;
    private String picture;
    private String directory;
}
