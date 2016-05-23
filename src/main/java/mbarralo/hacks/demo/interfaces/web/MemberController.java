package mbarralo.hacks.demo.interfaces.web;

import mbarralo.hacks.demo.domain.Member;
import mbarralo.hacks.demo.domain.MemberRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

@Model
public class MemberController {

    @Inject
    private MemberRepository memberRepository;

    private List<Member> members;

    @PostConstruct
    public void init() {
        members = memberRepository.getAllMembers();
    }

    public List<Member> getMembers() {
        return members;
    }
}
