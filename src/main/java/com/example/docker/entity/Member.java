package com.example.docker.entity;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Member {
    @Id
    private final Long id;

    private final String name;
}
