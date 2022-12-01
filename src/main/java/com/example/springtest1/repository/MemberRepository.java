package com.example.springtest1.repository;

import com.example.springtest1.dto.MemberResponseDto;
import com.example.springtest1.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findAllByOrderByModifiedAtDesc();
}


