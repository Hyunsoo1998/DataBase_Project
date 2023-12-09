package com.example.damoaRecipe;

// MemberTest.java

import com.example.damoaRecipe.entity.Member;
import com.example.damoaRecipe.repository.MemberRepository;
import com.example.damoaRecipe.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
////@Transactional
//class MemberTest {
//    @Autowired
//    MemberService memberService;
//    @Autowired
//    MemberRepository memberRepository;
//
//    @Autowired
//    public MemberTest(MemberService memberService, MemberRepository memberRepository) {
//        this.memberService = memberService;
//        this.memberRepository = memberRepository;
//    }
//
//    @Test
//    public void member_create() throws Exception {
//
//        // Member member = new Member("0525", "이정민", "shinin_2008@naver.com", "룰루랄라");
//
//        // Member member = new Member("0408", "김종현", "jjong0408@naver.com", "블링블링이즈종현");
//
//        Member member = new Member("0718", "이태민", "taem0718@naver.com", "아기치즈태민");
//
//        Member savedMember = memberRepository.save(member);
//
//        assertThat(savedMember.getMemberName()).isEqualTo(member.getMemberName());
//
//    }
//
//    @Test
//    public void member_update() throws Exception {
//
//        Member member = new Member("0718", "이태민", "taem0718@naver.com", "아기치즈태민");
//        member.setUpdatedAt(LocalDateTime.now());
//        memberRepository.save(member);
//    }
//
//    @Test
//    public void member_delete() throws Exception {
//        Member member = new Member("0718", "이태민", "taem0718@naver.com", "아기치즈태민");
//        Member savedMember = memberRepository.save(member);
//        System.out.println("memberId : " + savedMember.getMemberId());
//        memberRepository.deleteById(savedMember.getMemberId());
//    }
//}
