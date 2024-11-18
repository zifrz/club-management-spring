package com.club.web.dto;


import com.club.web.models.Club;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventDto {
    private Long id;
    private String name;
    private LocalDate startTime;
    private LocalDate endTime;
    private String type;
    private String photoUrl;
    private LocalDate createdOn;
    private LocalDate updatedOn;
}

