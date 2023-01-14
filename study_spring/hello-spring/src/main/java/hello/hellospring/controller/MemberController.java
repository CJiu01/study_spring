package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberController {

    private final MemberService memberService;

    //Autowired는 스프링 컨테이너에서 memberService 가져옴.
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    //
}
