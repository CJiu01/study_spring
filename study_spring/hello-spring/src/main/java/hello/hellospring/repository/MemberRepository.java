package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //Member 저장한 뒤, Member 반환
    Optional<Member> findByID(Long id); //Null 반환 시, Optional에 감싸 반환함.
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
