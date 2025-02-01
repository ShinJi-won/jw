package com.example.jw.controller;

import com.example.jw.dto.MemberDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {
    @GetMapping("/")
    public MemberDto test() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test");
        memberDto.setAge(20);
        return memberDto;
    }
    @GetMapping("/test2")
    public MemberDto test2() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test2");
        memberDto.setAge(30);
        return memberDto;
    }
    @GetMapping("/test3")
    public MemberDto test3() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test3");
        memberDto.setAge(30);
        return memberDto;
    }
    @GetMapping("/test4")
    public MemberDto test44() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("test3");
        memberDto.setAge(30);
        return memberDto;
    }
}