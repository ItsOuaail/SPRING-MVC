package com.rungroop.demo.service;

import com.rungroop.demo.dto.ClubDto;
import com.rungroop.demo.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(Club club);
}
