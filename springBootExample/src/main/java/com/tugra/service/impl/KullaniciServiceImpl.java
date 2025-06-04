package com.tugra.service.impl;

import com.tugra.dto.DtoKullanici;
import com.tugra.dto.DtoKullaniciUI;
import com.tugra.exception.BaseException;
import com.tugra.exception.ErrorMessage;
import com.tugra.exception.MessageType;
import com.tugra.model.Kullanici;
import com.tugra.repository.KullaniciRepository;
import com.tugra.service.KullaniciService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KullaniciServiceImpl implements KullaniciService {

    @Autowired
    private KullaniciRepository kullaniciRepository;

    @Override
    public DtoKullanici kayit(DtoKullaniciUI dtoKullaniciUI) {

        DtoKullanici dtoKullanici = new DtoKullanici();

        Kullanici kullanici = new Kullanici();
        kullanici.setEmail(dtoKullaniciUI.getEmail());
        kullanici.setAd(dtoKullaniciUI.getAd());
        kullanici.setSoyad(dtoKullaniciUI.getSoyad());
        kullanici.setPassword(dtoKullaniciUI.getPassword());

        if(kullaniciRepository.findByEmail(kullanici.getEmail()) != null){
            throw new BaseException(new ErrorMessage(MessageType.EMAİL_HATASİ,kullanici.getEmail()));
        }

        Kullanici dbKullanici = kullaniciRepository.save(kullanici);

        BeanUtils.copyProperties(dbKullanici,dtoKullanici);

        return dtoKullanici;
    }

}
