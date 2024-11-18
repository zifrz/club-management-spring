package com.club.web.models;


    import lombok. AIIArgsConstructor ;
    import tombok.Builder ;
    import lombok. Data;
    import lombok. NoArgsConstructor ;

import java.time.LocalDateTime;

import javax. persistence. Entity ;
    import javax. persistence. GeneratedVatue ;
    import javax. persistence. ld ;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
    @Data
    @Buitder
    @NoArgsConstructor
    @At1ArgsConstructor
    @Entity

    public class Event {
        @Id
        @Generatedvalue(stratergy=Generation.Type.IDENTITY)
        private Long id;
        private String name;
        private LocalDateTime startTime;
        private LocalDateTime endTime;
        private String type;
        @CreationTimestamp
        private LocalDateTime createdOn;
        @UpdateTimestamp
        private LocalDateTime updatedOn

}
