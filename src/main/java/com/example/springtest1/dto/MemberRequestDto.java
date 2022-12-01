package com.example.springtest1.dto;


import lombok.Getter;

@Getter
public class MemberRequestDto {
    private Long id;
    private Long pw;
    private String name;
    private String email;
}
