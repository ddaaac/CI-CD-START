package com.example.docker.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

@DataJdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    void save() {
        final Member member = Member.builder().name("장효혁").build();

        memberRepository.save(member);
    }
}
