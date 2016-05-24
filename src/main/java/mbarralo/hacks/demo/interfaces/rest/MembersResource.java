package mbarralo.hacks.demo.interfaces.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import mbarralo.hacks.demo.domain.member.Member;
import mbarralo.hacks.demo.domain.member.MemberRepository;

@Path("members")
public class MembersResource {

    @Inject
    MemberRepository memberRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Member> getMemebers() {
        return memberRepository.getAllMembers();
    }
}
