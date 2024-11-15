package com.club.web.service;

import com.club.web.dto.ClubDto;
import com.club.web.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(Club club);
}
