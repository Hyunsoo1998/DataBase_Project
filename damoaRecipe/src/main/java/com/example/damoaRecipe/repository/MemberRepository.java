package com.example.damoaRecipe.repository;

import com.example.damoaRecipe.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    Optional<Member> findByMemberName(String memberName);
}
