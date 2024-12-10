package com.rungroop.demo.controller;
import org.springframework.ui.Model;
import com.rungroop.demo.dto.ClubDto;
import com.rungroop.demo.service.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {
    private ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String listClubs(Model model) {
        List<ClubDto> clubs = clubService.findAllClubs();
        model.addAttribute("clubs", clubs);
        return "clubs-list";
    }
}
