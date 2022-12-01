package com.example.springtest1.service;

import com.example.springtest1.dto.MemberResponseDto;
import com.example.springtest1.entitiy.Member;
import com.example.springtest1.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;


    public MemberResponseDto findMember(Long id){
        Member member = getMember(id,"존재하지 않습니다");
        MemberResponseDto memberResponseDto = new MemberResponseDto(member);
        return memberResponseDto;
    }

    public List<MemberResponseDto> findAllMember() {
        List<Member> memo = memberRepository.findAllByOrderByModifiedAtDesc();
        return memo.stream().map(memo1 ->new MemberResponseDto(memo1)).collect(Collectors.toList());
    }

    private Member getMember(Long id, String 존재하지_않습니다) {
        Member member=memberRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException()
        );
        return member;
    }
}