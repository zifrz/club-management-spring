package com.club.web.service;

import com.club.web.dto.EventDto;
import jakarta.validation.Valid;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);

    void updateEvent(@Valid EventDto eventDto);
}
