package mbarralo.hacks.demo.domain.member;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class MemberRepository {

    @Inject
    EntityManager entityManager;

    public List<Member> getAllMembers() {
        return entityManager.createQuery("from Member m").getResultList();
    }

}
