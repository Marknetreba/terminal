package com.infoterminal.infoterminal.jpa;

import com.infoterminal.infoterminal.entities.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author Mark
 * @Date 14.02.18
 */
public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
    List<Schedule> findByFilial(String filial);
}
