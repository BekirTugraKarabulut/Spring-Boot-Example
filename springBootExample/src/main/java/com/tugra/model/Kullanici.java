package com.tugra.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "kullanici")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kullanici {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "ad")
    private String ad;

    @Column(name = "soyad")
    private String soyad;

    @Column(name = "password")
    private String password;

}
