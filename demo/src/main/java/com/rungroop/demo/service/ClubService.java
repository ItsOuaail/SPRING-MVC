package com.rungroop.demo.service;

import com.rungroop.demo.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
