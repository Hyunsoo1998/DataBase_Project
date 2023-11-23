package com.example.damoaRecipe.service;

import com.example.damoaRecipe.entity.Member;
import com.example.damoaRecipe.exception.DataNotFoundException;
import com.example.damoaRecipe.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public Member create(String pw, String memberName, String memberEmail) {
        Member member = new Member();
        // member.setMemberPw(memberPw);
        member.setMemberName(memberName);
        member.setMemberEmail(memberEmail);

        this.memberRepository.save(member);
        return member;
    }

    public Member getMember(String memberName) {
        Optional<Member> member = this.memberRepository.findByMemberName(memberName);

        if (member.isPresent()) {
            return member.get();
        }
        else {
            throw new DataNotFoundException("Member not found");
        }
    }

}
