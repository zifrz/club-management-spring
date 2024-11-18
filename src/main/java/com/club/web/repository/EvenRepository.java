package com.club.web.repository;

import com.club.web.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenRepository extends JpaRepository<Event, Long> {

}
