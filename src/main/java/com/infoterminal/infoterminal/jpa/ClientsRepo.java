package com.infoterminal.infoterminal.jpa;

import com.infoterminal.infoterminal.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author Mark
 * @Date 14.02.18
 */
public interface ClientsRepo extends JpaRepository<Clients, Long> {
    List<Clients> findByPhone1(String phone);
    List<Clients> findByFullname(String fullname);
}
