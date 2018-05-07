package com.bee.example.feign.basics;

import feign.Param;
import feign.RequestLine;

import java.util.List;

interface GitHub {
    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);
}

