package com.user.infra.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    private  Integer id;
    private String name ;
    @Column(name = "phone_no")
    private String phoneNo ;
    @Column (unique = true)
   private String email;



    }
