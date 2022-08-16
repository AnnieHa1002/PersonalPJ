package com.personal.project.controller;

import com.personal.project.dto.PlayerRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
public class playersController {

    @PostMapping("/generator/player")
    public String generatePlayer(@RequestBody PlayerRequestDto requestDto){

        return "생성되었습니다.";

    }
}
