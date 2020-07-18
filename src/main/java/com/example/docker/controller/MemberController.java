package com.example.docker.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.entity.Member;
import com.example.docker.entity.MemberRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class MemberController {
    private final MemberRepository members;

    @GetMapping("/")
    public ResponseEntity<List<Member>> members() {
        return ResponseEntity.ok(members.findAll());
    }

    @PostMapping("/{name}")
    public ResponseEntity<Void> createMember(@PathVariable final String name) {
        final Member member = members.save(Member.builder().name(name).build());

        return ResponseEntity.created(URI.create(String.format("/%d", member.getId()))).build();
    }
}
