package com.example.springtest1.dto;

import com.example.springtest1.entitiy.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {
    private Long id;

    private String name;


    private String email;


    private Long pw;

    public MemberResponseDto(Member member){
        this.id =member.getId();
        this.pw = member.getPw();
        this.email = member.getEmail();
        this.name = member.getName();

    }
}
