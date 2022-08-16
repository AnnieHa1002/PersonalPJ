package com.personal.project.controller;

import com.personal.project.dto.MemberEventDto;
import org.springframework.context.event.EventListener;

public class PlayerEventHandler {
    @EventListener
    public void process(MemberEventDto memberEventDto){


    }
}
