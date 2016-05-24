package mbarralo.hacks.demo.interfaces.web;

import mbarralo.hacks.demo.domain.member.Member;
import mbarralo.hacks.demo.domain.member.MemberRepository;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

@Model
public class Members {

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
