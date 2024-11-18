package com.club.web.mapper;

import com.club.web.dto.EventDto;
import com.club.web.models.Event;

public class EventMapper {
    public static Event mapToEvent(EventDto eventDto) {
        return Event
                .builder().id(eventDto.getId())
                .name(eventDto.getName())
                .startTime(eventDto.getStartTime())
                .endTime(eventDto.getEndTime())
                .type(eventDto.getType())
                .photoUrl(eventDto.getPhotoUrl())
                .createdOn(eventDto.getCreatedOn())
                .updatedOn(eventDto.getUpdatedOn())
                .build();
    }
}
