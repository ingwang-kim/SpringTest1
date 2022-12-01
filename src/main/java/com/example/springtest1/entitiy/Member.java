package com.example.springtest1.entitiy;

import com.example.springtest1.dto.MemberResponseDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Long pw;



    public Member(MemberResponseDto memberResponseDto){
        this.name = memberResponseDto.getName();
        this.id = memberResponseDto.getId();
        this.pw = memberResponseDto.getPw();
        this.email = memberResponseDto.getEmail();
    }





}