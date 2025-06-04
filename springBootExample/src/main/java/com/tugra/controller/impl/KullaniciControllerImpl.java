package com.tugra.controller.impl;

import com.tugra.controller.KullaniciController;
import com.tugra.dto.DtoKullanici;
import com.tugra.dto.DtoKullaniciUI;
import com.tugra.service.KullaniciService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/rest/api")
public class KullaniciControllerImpl implements KullaniciController {

    @Autowired
    private KullaniciService kullaniciService;

    @Override
    @PostMapping(path = "/kullanici-ekle")
    public DtoKullanici kayit(@Valid @RequestBody DtoKullaniciUI dtoKullaniciUI) {
        return kullaniciService.kayit(dtoKullaniciUI);
    }

}
