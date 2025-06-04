package com.tugra.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoKullaniciUI {

    @Email(message = "Lütfen e-mail türünde giriniz !")
    private String email;

    @NotNull(message = "Alan boş olamaz !")
    private String ad;

    @NotNull(message = "Alan boş olamaz !")
    private String soyad;

    @NotNull(message = "Alan boş olamaz !")
    private String password;

}
