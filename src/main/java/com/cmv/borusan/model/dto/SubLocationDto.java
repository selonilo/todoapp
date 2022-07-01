package com.cmv.borusan.model.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class SubLocationDto {

    private Long id;
    private String name;
    private String description;
    private Long locationId;
    private LocationDto locationDto;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private String createUser;
    private String updateUser;
}