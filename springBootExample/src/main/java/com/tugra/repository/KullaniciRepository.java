package com.tugra.repository;

import com.tugra.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepository extends JpaRepository<Kullanici,String> {

    Kullanici findByEmail(String email);


}
