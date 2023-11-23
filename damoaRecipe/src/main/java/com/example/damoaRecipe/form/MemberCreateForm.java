package com.example.damoaRecipe.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberCreateForm {
    private String memberPw1; // 비밀번호 입력
    private String memberPw2; // 비밀번호 확인
    private String memberName; // 이름 입력
    private String memberEmail; // 이메일 입력
}
