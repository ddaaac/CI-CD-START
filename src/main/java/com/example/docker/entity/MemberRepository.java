package com.example.docker.entity;

import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
